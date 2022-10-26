package fegssp.app.io.marvelinfoapp.di

import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fegssp.app.io.marvelinfoapp.data.remote.ServiceAPI
import fegssp.app.io.marvelinfoapp.util.Constants
import fegssp.app.io.marvelinfoapp.util.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import timber.log.Timber
import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import javax.inject.Singleton

@dagger.Module
@InstallIn(SingletonComponent::class)

object Module {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient{
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient().newBuilder()
            .addInterceptor { chain ->
                val currentTimesTamp = System.currentTimeMillis().toString()
                val newUrl = chain.request().url
                    .newBuilder()
                    .addQueryParameter(Constants.TS,currentTimesTamp)
                    .addQueryParameter(Constants.API_KEY, Constants.PRIVATE_KEY)
                    .addQueryParameter(Constants.HASH,
                        provideToMd5Hash(currentTimesTamp + Constants.PUBLIC_KEY + Constants.PRIVATE_KEY))
                    .build()
                val newRequest = chain.request()
                    .newBuilder()
                    .url(newUrl)
                    .build()
                chain.proceed(newRequest)
            }
            .addInterceptor(logging)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    @Singleton
    @Provides
    fun provideServiceAPI(retrofit: Retrofit): ServiceAPI{
        return retrofit.create(ServiceAPI::class.java)
    }

    private fun provideToMd5Hash(encrypted: String): String {
        var pass = encrypted
        var encryptedString: String? = null
        val md5: MessageDigest
        try {
            md5 = MessageDigest.getInstance("MD5")
            md5.update(pass.toByteArray(), 0, pass.length)
            pass = BigInteger(1, md5.digest()).toString(16)
            while (pass.length < 32) {
                pass = "0$pass"
            }
            encryptedString = pass
        } catch (e1: NoSuchAlgorithmException) {
            e1.printStackTrace()
        }
        Timber.d("hash -> $encryptedString")
        return encryptedString ?: ""
    }
}