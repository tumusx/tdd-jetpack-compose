package com.tumusx.namesibgeapi.data.api

import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import retrofit2.http.GET

interface IBGEService {
    @GET("censos/nomes")
    fun getAllNames() : List<NamesDTOItem>
}



