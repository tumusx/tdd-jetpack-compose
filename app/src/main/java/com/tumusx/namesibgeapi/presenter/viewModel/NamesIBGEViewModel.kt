package com.tumusx.namesibgeapi.presenter.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tumusx.namesibgeapi.data.model.NamesDTOItem
import com.tumusx.namesibgeapi.domain.NamesIBGERepository
import kotlinx.coroutines.flow.onEach

class NamesIBGEViewModel(private val ibgeRepository: NamesIBGERepository) : ViewModel() {
    private val valueNames = MutableLiveData<List<NamesDTOItem>>()
    val _valuesNames: LiveData<List<NamesDTOItem>> = valueNames
    val messageError = MutableLiveData<String>()
    init {
        getAllNames()
    }

    fun getAllNames() {
        try {
            ibgeRepository.getAllNames().onEach { values ->
                valueNames.postValue(values)
            }
        }catch (exception: Exception){
            messageError.postValue((exception.printStackTrace() ?: "Erro na requisicao").toString())
        }
    }
}