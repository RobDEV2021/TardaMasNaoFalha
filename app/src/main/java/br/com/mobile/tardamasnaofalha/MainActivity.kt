package br.com.mobile.tardamasnaofalha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.mobile.tardamasnaofalha.databinding.LoginBinding

class MainActivity : DebugActivity() {

    private val binding by lazy {
        LoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imagemLogin.setImageResource(R.drawable.img_login)
        binding.fazerLogin.text = "nova mensagem de login"

        binding.botaoLogin.setOnClickListener {
            Toast.makeText(this,"Clicou em login", Toast.LENGTH_LONG).show()
            val intent = Intent(this, TelaInicialActivity::class.java)

            val params = Bundle()
            params.putString("nome", "Robinson")
            params.putInt("numero", 10)

            intent.putExtras(params)

            val nome_usuario = binding.campoUsuario.text.toString()
            intent.putExtra("nome_usuario", nome_usuario)

            startActivity(intent)

        }

    }
}