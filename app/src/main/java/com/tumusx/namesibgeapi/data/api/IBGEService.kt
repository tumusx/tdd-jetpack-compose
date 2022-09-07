package com.tumusx.namesibgeapi.data.api

import com.tumusx.namesibgeapi.data.model.NameDTOItem
import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface IBGEService {
    @GET("censos/nomes")
    fun getAllNames(): List<NamesDTOItem>

    @GET("censos/nomes/{nome}")
    suspend fun findByName(@Path("nome") nome: String): Response<NameDTOItem>
}



