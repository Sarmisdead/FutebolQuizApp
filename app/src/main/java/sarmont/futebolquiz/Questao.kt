package sarmont.futebolquiz

data class Questao(
    val id: Int,
    val pergunta: String,
    val image: Int,
    val opcao1: String,
    val opcao2: String,
    val opcao3: String,
    val opcao4: String,
    val respostaCorreta:Int
)
