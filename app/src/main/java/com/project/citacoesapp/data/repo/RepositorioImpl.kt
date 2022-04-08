package com.project.citacoesapp.data.repo

import com.project.citacoesapp.data.model.Citacoes

class RepositorioImpl: Repositorio {
    override fun pegaCitacoes(): List<Citacoes> {
        return frases
    }
}