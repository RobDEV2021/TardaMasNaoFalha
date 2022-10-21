package br.com.mobile.tardamasnaofalha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.mobile.tardamasnaofalha.databinding.LoginBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        LoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imagemLogin.setImageResource(R.drawable.img_login)
        binding.fazerLogin.text = "nova mensagem de login"

        binding.botaoLogin.setOnClickListener {

            Toast.makeText(this, "Clicou em login", Toast.LENGTH_LONG).show()
        }

    }
}