package com.project.citacoesapp.data.repo

import com.project.citacoesapp.data.model.Citacoes

interface Repositorio {
    fun pegaCitacoes(): List<Citacoes>
}