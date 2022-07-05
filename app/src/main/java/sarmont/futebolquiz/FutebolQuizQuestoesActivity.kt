package sarmont.futebolquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat


class FutebolQuizQuestoesActivity : AppCompatActivity(), View.OnClickListener {

    private var minhaPosicaoAtual: Int = 1
    private var minhaListaQuestao:ArrayList<Questao>? =null
    private var minhaPosicaoSelecionada: Int = 0
    private var meuNome: String? = null
    private var minhasQuestoesCorretas: Int = 0

    private var barraProgresso : ProgressBar? = null
    private var tvProgresso : TextView? = null
    private var tvQuestao : TextView? = null
    private var ivImagem : ImageView? = null

    private var tvOpcao1 : TextView? = null
    private var tvOpcao2 : TextView? = null
    private var tvOpcao3 : TextView? = null
    private var tvOpcao4 : TextView? = null
    private var btnEnviar : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol_quiz_questoes)

        meuNome = intent.getStringExtra(Constants.USER_NAME)


        barraProgresso = findViewById(R.id.barraProgresso)
        tvProgresso = findViewById(R.id.tvProgresso)
        tvQuestao = findViewById(R.id.tvQuestao)
        ivImagem = findViewById(R.id.ivImagem)

        tvOpcao1 = findViewById(R.id.tvOpcao1)
        tvOpcao2 = findViewById(R.id.tvOpcao2)
        tvOpcao3 = findViewById(R.id.tvOpcao3)
        tvOpcao4 = findViewById(R.id.tvOpcao4)
        btnEnviar = findViewById(R.id.btnEnviar)

        tvOpcao1?.setOnClickListener(this)
        tvOpcao2?.setOnClickListener(this)
        tvOpcao3?.setOnClickListener(this)
        tvOpcao4?.setOnClickListener(this)
        btnEnviar?.setOnClickListener(this)

        minhaListaQuestao = Constants.getQuestoes()

        setQuestao()
    }

    private fun setQuestao() {

        opcoesViewDefault()
        val pergunta: Questao = minhaListaQuestao!![minhaPosicaoAtual - 1]
        ivImagem?.setImageResource(pergunta.image)
        barraProgresso?.progress = minhaPosicaoAtual
        tvProgresso?.text = "$minhaPosicaoAtual/${barraProgresso?.max}"
        tvQuestao?.text = pergunta.pergunta
        tvOpcao1?.text = pergunta.opcao1
        tvOpcao2?.text = pergunta.opcao2
        tvOpcao3?.text = pergunta.opcao3
        tvOpcao4?.text = pergunta.opcao4

        if (minhaPosicaoAtual == minhaListaQuestao!!.size) {
            btnEnviar?.text = "TERMINAR"
        } else {
            btnEnviar?.text = "CONTINUAR"
        }
    }

    private fun opcoesViewDefault() {
        val opcoes = ArrayList<TextView>()

        tvOpcao1?.let {
            opcoes.add(0, it)
        }
        tvOpcao2?.let {
            opcoes.add(1, it)
        }
        tvOpcao3?.let {
            opcoes.add(2, it)
        }
        tvOpcao4?.let {
            opcoes.add(3, it)
        }

        for (opcoes in opcoes) {
            opcoes.setTextColor(Color.parseColor("#7A8089"))
            opcoes.typeface = Typeface.DEFAULT
            opcoes.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun opcaoViewSelecionada(tv: TextView, opcaoNumeroSelecionada: Int){
        opcoesViewDefault()

        minhaPosicaoSelecionada = opcaoNumeroSelecionada

        tv.setTextColor(Color.parseColor("#29455C"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background =  ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tvOpcao1 -> {
                tvOpcao1?.let {
                    opcaoViewSelecionada(it, 1)
                }
            }
            R.id.tvOpcao2 -> {
                tvOpcao2?.let {
                    opcaoViewSelecionada(it, 2)
                }
            }
            R.id.tvOpcao3 -> {
                tvOpcao3?.let {
                    opcaoViewSelecionada(it, 3)
                }
            }
            R.id.tvOpcao4 -> {
                tvOpcao4?.let {
                    opcaoViewSelecionada(it, 4)
                }
            }
            R.id.btnEnviar -> {
                if (minhaPosicaoSelecionada == 0) {
                    minhaPosicaoAtual++

                    when {
                        minhaPosicaoAtual <= minhaListaQuestao!!.size -> {
                            setQuestao()
                        }
                    else ->{
                        val intent = Intent(this, ResultadoActivity::class.java)
                        intent.putExtra(Constants.USER_NAME, meuNome)
                        intent.putExtra(Constants.QUESTOES_CORRETAS, minhasQuestoesCorretas)
                        intent.putExtra(Constants.TOTAL_QUESTOES, minhaListaQuestao?.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                } else {
                    val questao = minhaListaQuestao?.get(minhaPosicaoAtual - 1)
                    if (questao!!.respostaCorreta != minhaPosicaoSelecionada) {
                        resultadoView(minhaPosicaoSelecionada, R.drawable.option_border_errada_bg)
                    }else{
                        minhasQuestoesCorretas++
                    }
                    resultadoView(questao.respostaCorreta, R.drawable.option_border_correta_bg)

                    if(minhaPosicaoAtual == minhaListaQuestao!!.size){
                        btnEnviar?.text ="TERMINAR"
                    }else{
                        btnEnviar?.text ="CONTINUAR"
                    }
                minhaPosicaoSelecionada = 0
               }
            }
        }
    }

    private fun resultadoView(resultado: Int, drawableView: Int){
            when(resultado){
                1-> {
                    tvOpcao1?.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                    )
                }
                2-> {
                    tvOpcao2?.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                    )
                }
                3-> {
                    tvOpcao3?.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                    )
                }
                4-> {
                    tvOpcao4?.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                    )
                }


            }
    }
}