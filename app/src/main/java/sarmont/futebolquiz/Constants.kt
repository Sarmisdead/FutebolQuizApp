package sarmont.futebolquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTOES : String = "total_questoes"
    const val QUESTOES_CORRETAS : String = "questoes_corretas"



    fun getQuestoes():ArrayList<Questao>{
        val listaQuestoes = ArrayList<Questao>()

        //Questão 1
        val questao1 = Questao(
            1,
            "Qual o time desse escudo?",
            R.drawable.atleticomadrid,
            "Real Valladolid",
            "Atlético de Madrid",
            "Sevilla",
            "Athletic Club",
            2
        )
        listaQuestoes.add(questao1)

        //Questão 2
        val questao2 = Questao(
            2,
            "Qual o time desse escudo?",
            R.drawable.atleticomineiro,
            "America Mineiro",
            "Botafogo",
            "Atlético Mineiro",
            "Ceará",
            3
        )
        listaQuestoes.add(questao2)

        //Questão 3
        val questao3 = Questao(
            3,
            "Qual o time desse escudo?",
            R.drawable.atleticopr,
            "Atlético Goianiense",
            "Athletico Paranaense",
            "Sport",
            "Flamengo",
            2
        )
        listaQuestoes.add(questao3)

        //Questão 4
        val questao4 = Questao(
            4,
            "Qual o time desse escudo?",
            R.drawable.bangu,
            "Madureira",
            "Santa Cruz Futebol Clube",
            "Náutico",
            "Bangu",
            4
        )
        listaQuestoes.add(questao4)

        //Questão 5
        val questao5 = Questao(
            5,
            "Qual o time desse escudo?",
            R.drawable.barcelona,
            "Barcelona",
            "Real Madrid",
            "Levante UD",
            "Espanyol de Barcelona",
            1
        )
        listaQuestoes.add(questao5)

        //Questão 6
        val questao6 = Questao(
            6,
            "Qual o time desse escudo?",
            R.drawable.bayernmunich,
            "FC Bayern Munich",
            "Bayer Leverkusen",
            "Borussia Dortmund",
            "Borussia Mönchengladbach",
            1
        )
        listaQuestoes.add(questao6)

        //Questão 7
        val questao7 = Questao(
            7,
            "Qual o time desse escudo?",
            R.drawable.bocajuniors,
            "River Plate",
            "Racing Club",
            "Boca Juniors",
            "Vélez Sársfield",
            3
        )
        listaQuestoes.add(questao7)

        //Questão 8
        val questao8 = Questao(
            8,
            "Qual o time desse escudo?",
            R.drawable.borussiadortmund,
            "VFL Wolfsburg",
            "Borussia Dortmund",
            "Borussia Mönchengladbach",
            "Bayer Leverkusen",
            2
        )
        listaQuestoes.add(questao8)

        //Questão 9
        val questao9 = Questao(
            9,
            "Qual o time desse escudo?",
            R.drawable.botafogo,
            "Vasco da Gama",
            "Atlético Mineiro",
            "Santos",
            "Botafogo",
            4
        )
        listaQuestoes.add(questao9)

        //Questão 10
        val questao10 = Questao(
            10,
            "Qual o time desse escudo?",
            R.drawable.corinthians,
            "Red Bull Bragantino",
            "Ceará",
            "São Paulo",
            "Corinthians",
            4
        )
        listaQuestoes.add(questao10)

        //Questão 11
        val questao11 = Questao(
            11,
            "Qual o time desse escudo?",
            R.drawable.cruzeiro,
            "Cruzeiro",
            "Fortaleza",
            "Grêmio",
            "Avaí",
            1
        )
        listaQuestoes.add(questao11)

        //Questão 12
        val questao12 = Questao(
            12,
            "Qual o time desse escudo?",
            R.drawable.figueirense,
            "Volta Redonda",
            "Figueirense",
            "Vitória",
            "Brasil de Pelotas",
            2
        )
        listaQuestoes.add(questao12)

        //Questão 13
        val questao13 = Questao(
            13,
            "Qual o time desse escudo?",
            R.drawable.flamengo,
            "Flamengo",
            "Athletico Paranaense",
            "Sport",
            "Oeste Futebol Clube",
            1
        )
        listaQuestoes.add(questao13)

        //Questão 14
        val questao14 = Questao(
            14,
            "Qual o time desse escudo?",
            R.drawable.fluminense,
            "Remo",
            "Ituano",
            "LDU Quito",
            "Fluminense",
            4
        )
        listaQuestoes.add(questao14)

        //Questão 15
        val questao15 = Questao(
            15,
            "Qual o time desse escudo?",
            R.drawable.goias,
            "Coritiba",
            "Goias",
            "Palmeiras",
            "Chapecoense",
            2
        )
        listaQuestoes.add(questao15)

        //Questão 16
        val questao16 = Questao(
            16,
            "Qual o time desse escudo?",
            R.drawable.gremio,
            "Bahia",
            "CSA",
            "Grêmio",
            "Fortaleza",
            3
        )
        listaQuestoes.add(questao16)

        //Questão 17
        val questao17 = Questao(
            17,
            "Qual o time desse escudo?",
            R.drawable.internacional,
            "Milan",
            "Internacional",
            "Náutico",
            "Internazionale",
            2
        )
        listaQuestoes.add(questao17)

        //Questão 18
        val questao18 = Questao(
            18,
            "Qual o time desse escudo?",
            R.drawable.internazionale,
            "Napoli",
            "Roma",
            "internazionale",
            "Spezia",
            3
        )
        listaQuestoes.add(questao18)

        //Questão 19
        val questao19 = Questao(
            19,
            "Qual o time desse escudo?",
            R.drawable.milan,
            "Milan",
            "Juventus",
            "Atalanta",
            "Bologna",
            1
        )
        listaQuestoes.add(questao19)

        //Questão 20
        val questao20 = Questao(
            20,
            "Qual o time desse escudo?",
            R.drawable.nautico,
            "Tombense",
            "Madureira",
            "CRB",
            "Náutico",
            4
        )
        listaQuestoes.add(questao20)

        //Questão 21
        val questao21 = Questao(
            21,
            "Qual o time desse escudo?",
            R.drawable.paysandu,
            "Londrina",
            "Paysandu",
            "CSA",
            "Remo",
            2
        )
        listaQuestoes.add(questao21)

        //Questão 22
        val questao22 = Questao(
            22,
            "Qual o time desse escudo?",
            R.drawable.pontepreta,
            "Ponte Preta",
            "Operário",
            "Santos",
            "ABC Futebol Clube",
            1
        )
        listaQuestoes.add(questao22)

        //Questão 23
        val questao23 = Questao(
            23,
            "Qual o time desse escudo?",
            R.drawable.recife,
            "Ituano",
            "Sport",
            "Vila Nova",
            "Criciúma",
            2
        )
        listaQuestoes.add(questao23)

        //Questão 24
        val questao24 = Questao(
            24,
            "Qual o time desse escudo?",
            R.drawable.santos,
            "Vasco da Gama",
            "Operário",
            "Santos",
            "Novorizontino",
            3
        )
        listaQuestoes.add(questao24)

        //Questão 25
        val questao25 = Questao(
            25,
            "Qual o time desse escudo?",
            R.drawable.saopaulo,
            "Vitória",
            "Atlético Goianiense",
            "Fortaleza",
            "São Paulo",
            4
        )
        listaQuestoes.add(questao25)

        //Questão 26
        val questao26 = Questao(
            26,
            "Qual o time desse escudo?",
            R.drawable.vasco,
            "Operário",
            "Vasco da Gama",
            "Londrina",
            "Ceará",
            2
        )
        listaQuestoes.add(questao26)

        //Questão 27
        val questao27 = Questao(
            27,
            "Qual o time desse escudo?",
            R.drawable.manchestercity,
            "Chelsea",
            "Manchester United",
            "Manchester City",
            "Leicester City",
            3
        )
        listaQuestoes.add(questao27)

        return listaQuestoes

    }
}