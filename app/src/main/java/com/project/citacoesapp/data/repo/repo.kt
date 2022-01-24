package com.project.citacoesapp.data.repo

import com.project.citacoesapp.data.model.Autor
import com.project.citacoesapp.data.model.Citacoes

val frases = listOf(
    Citacoes(Autor("Bauman" ,"foto"), "A modernidade líquida em que vivemos traz consigo \n" +
        "uma misteriosa fragilidade dos laços humanos – um\n" +
        " amor líquido. A segurança inspirada por essa \n" +
        "condição estimula desejos conflitantes de estreitar \n" +
        "esses laços e ao mesmo tempo mantê-los frouxos."),
    Citacoes(Autor("Pablo Neruda", "foto"), "Você é livre para fazer suas escolhas, mas é prisioneiro \n" +
            "das consequências."),
    Citacoes(Autor("Jean-Paul Sartre", "foto"), "Nunca se é homem enquanto se não encontra alguma \n" +
            "coisa pela qual se estaria disposto a morrer."),
    Citacoes(Autor("Pablo Neruda", "foto"), "O homem não é nada além do que faz de si mesmo.")

)