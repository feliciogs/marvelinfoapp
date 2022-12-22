package fegssp.app.io.marvelinfoapp.repository

import fegssp.app.io.marvelinfoapp.data.remote.ServiceAPI
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api:ServiceAPI
){
    suspend fun list(nameStartsWith:String? = null) = api.list(nameStartsWith)
    suspend fun getComics(characterID: Int) = api.getComics(characterID)
}