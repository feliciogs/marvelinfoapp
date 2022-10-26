package fegssp.app.io.marvelinfoapp.data.remote

import fegssp.app.io.marvelinfoapp.data.model.character.CharacterModelResponse
import fegssp.app.io.marvelinfoapp.data.model.comics.ComicModelResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceAPI {

    @GET("characters")
    suspend fun list(
        @Query("nameStartsWith") nameStartsWith: String? = null
    ): Response<CharacterModelResponse>

    @GET("characters/{characterId}/comics")
    suspend fun getComics(
        @Path(
            value = "characterId",
            encoded = true
        ) characterId:Int
    ): Response<ComicModelResponse>
}