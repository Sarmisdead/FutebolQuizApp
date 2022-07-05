package sarmont.futebolquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val tvNome: TextView = findViewById(R.id.tvNome)
        val tvPlacar: TextView = findViewById(R.id.tvPlacar)
        val btnFinalizar: Button = findViewById(R.id.btnFinalizar)

        tvNome.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestoes = intent.getIntExtra(Constants.TOTAL_QUESTOES, 0)
        val questoesCorretas = intent.getIntExtra(Constants.QUESTOES_CORRETAS, 0)

        tvPlacar.text = "Seu Placar foi: $questoesCorretas de $totalQuestoes"

        btnFinalizar.setOnClickListener{
            startActivity(Intent(this , MainActivity::class.java))
        }
    }
}