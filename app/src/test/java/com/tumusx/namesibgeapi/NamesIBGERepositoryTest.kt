package com.tumusx.namesibgeapi

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import com.tumusx.namesibgeapi.repositoryMock.NamesIBGERepositoryMock
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NamesIBGERepositoryTest {

    @get:Rule
    val schedulers = InstantTaskExecutorRule()

    @Test
    fun getAllNamesIBGE() {
        val ibgeRepository = NamesIBGERepositoryMock()
        val namesDTOItem = mutableListOf<NamesDTOItem>()
        namesDTOItem.add(NamesDTOItem(1, "Murillo", 2, 1, "man"))
        val ibgeListFromRepository = mutableListOf<NamesDTOItem>()
        assertEquals(namesDTOItem.clear(), ibgeListFromRepository)
    }
}