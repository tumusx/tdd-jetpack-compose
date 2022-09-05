package com.tumusx.namesibgeapi.repositoryMock

import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import com.tumusx.namesibgeapi.domain.NamesIBGERepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NamesIBGERepositoryMock : NamesIBGERepository {
    override fun getAllNames(): Flow<List<NamesDTOItem>> = flow {
        val namesDTOItem = mutableListOf<NamesDTOItem>()
        try {
            namesDTOItem.add(NamesDTOItem(1, "Murillo", 2, 1, "man"))
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }
}