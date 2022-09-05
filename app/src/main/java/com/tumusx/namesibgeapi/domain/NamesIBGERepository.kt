package com.tumusx.namesibgeapi.domain

import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import kotlinx.coroutines.flow.Flow

interface NamesIBGERepository {
    fun getAllNames() : Flow<List<NamesDTOItem>>
}