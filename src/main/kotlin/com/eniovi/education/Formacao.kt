package com.eniovi.education

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }

    fun obterInscritos(): String {
        return inscritos.stream().map { inscrito -> inscrito.nome }.toList().joinToString(", ")
    }
}
