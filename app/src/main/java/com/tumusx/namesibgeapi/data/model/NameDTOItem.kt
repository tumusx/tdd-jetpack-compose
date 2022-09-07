package com.tumusx.namesibgeapi.data.model

data class NameDTOItem(
    val localidade: String,
    val nome: String,
    val currentNames: List<CurrentName>,
    val sexo: Any
)