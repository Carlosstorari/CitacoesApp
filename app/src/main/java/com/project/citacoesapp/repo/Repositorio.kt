package com.project.citacoesapp.repo

import com.project.citacoesapp.model.Citacoes

interface Repositorio {
    fun pegaCitacoes(): List<Citacoes>
}