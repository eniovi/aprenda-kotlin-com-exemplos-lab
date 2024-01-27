package com.eniovi

import com.eniovi.education.ConteudoEducacional
import com.eniovi.education.Formacao
import com.eniovi.education.Nivel
import com.eniovi.education.Usuario

fun main() {
    val usuario1 = Usuario("Enio", "enio@teste.com")
    val usuario2 = Usuario("Vinicius", "vinicius@teste.com")
    val usuario3 = Usuario("Clayton", "clayton@teste.com")
    val usuario4 = Usuario("Santos", "santos@teste.com")
    val usuario5 = Usuario("Benedita", "benedita@teste.com")
    val usuario6 = Usuario("Laura", "laura@teste.com")

    val conteudoEducacional1 = ConteudoEducacional("Conceitos Básicos")
    val conteudoEducacional2 = ConteudoEducacional("Funções", 90)
    val conteudoEducacional3 = ConteudoEducacional("Controle de Fluxo", 90)

    val formacao1 = Formacao(
        "Programação Orientada a Objetos - Kotlin", Nivel.BASICO,
        mutableListOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
    )
    val formacao2 = Formacao(
        "Programação Orientada a Objetos - Kotlin", Nivel.INTERMEDIARIO,
        mutableListOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
    )
    val formacao3 = Formacao(
        "Programação Orientada a Objetos - Kotlin", Nivel.AVANCADO,
        mutableListOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
    )

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2, usuario3)

    formacao2.matricular(usuario4)

    formacao3.matricular(usuario5, usuario6)

    println("Inscritos na formação 1: ${formacao1.obterInscritos()}")
    println("Inscritos na formação 2: ${formacao2.obterInscritos()}")
    println("Inscritos na formação 3: ${formacao3.obterInscritos()}")
}
