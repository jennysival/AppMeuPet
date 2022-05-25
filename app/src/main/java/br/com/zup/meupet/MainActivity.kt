package br.com.zup.meupet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.botao_mensagem)
        botaoMensagem.setOnClickListener {
            Toast.makeText(this, getString(R.string.mensagem_toast_latido), Toast.LENGTH_LONG).show()
        }

        val botaoVerMais = findViewById<Button>(R.id.botao_ver_mais)
        botaoVerMais.setOnClickListener {
            val intent = Intent(this, VerOutroPet::class.java)
            startActivity(intent)
        }
    }
}