package com.project.citacoesapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.citacoesapp.data.model.Citacoes
import com.project.citacoesapp.data.repo.Repositorio

class MainViewModel(val repositorio: Repositorio) : ViewModel() {

    val frases = MutableLiveData<List<Citacoes>>()

    fun getFrases() {
        frases.value = repositorio.pegaCitacoes()
    }

    class MainViewModelFactory(
        private val repositorio: Repositorio
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(repositorio) as T
        }

    }
}