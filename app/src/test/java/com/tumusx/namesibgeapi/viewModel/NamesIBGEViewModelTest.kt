package com.tumusx.namesibgeapi.viewModel

import android.database.Observable
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import com.tumusx.namesibgeapi.repositoryMock.NamesIBGERepositoryMock
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@MockK
class NamesIBGEViewModelTest {

    @get:Rule
    val ruleGet = InstantTaskExecutorRule()

    @MockK
    @get:Before
    val repositoryMockk = mockk<NamesIBGERepositoryMock>()

    @MockK
    private lateinit var itemDTObservable: Observable<List<NamesDTOItem>>

    @MockK
    private lateinit var ibgeItemViewModel: NamesIBGEViewModel

    @Test
    fun getAllNamesById() {
        ibgeItemViewModel.getAllNames()
        val listItens = mutableListOf<NamesDTOItem>()
        listItens.add(NamesDTOItem(1, "Murillo", 2, 1, "man"))
        itemDTObservable.unregisterObserver(listItens)
        ibgeItemViewModel.namesValue.onChanged()
        verify { ibgeItemViewModel.namesValue.onChanged().valuen(listItens) }
    }
}