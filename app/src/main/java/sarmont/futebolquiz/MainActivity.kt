package sarmont.futebolquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnComecar : Button = findViewById(R.id.btnComecar)
        val etNome : EditText = findViewById(R.id.etNome    )
        btnComecar.setOnClickListener {
            if(etNome.text.isNotEmpty()){
                val intent = Intent(this,
                    FutebolQuizQuestoesActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etNome.text.toString())
                    startActivity(intent)
                    finish()
            }else{
                Toast.makeText(this,
                    "Porfavor insira um nome", Toast.LENGTH_LONG).show()
            }
        }

    }
}