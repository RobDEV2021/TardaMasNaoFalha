package br.com.mobile.tardamasnaofalha

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import br.com.mobile.tardamasnaofalha.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : DebugActivity() {

    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val params = intent.extras
        val nome = params?.getString("nome")
        val numero = params?.getInt("numero")

        Toast.makeText(context, "Parâmetro: $nome", Toast.LENGTH_LONG).show()
        Toast.makeText(context, "Numero: $numero", Toast.LENGTH_LONG).show()

        val nome_usuario = params?.getString("nome_usuario")
        binding.mensagemTelainicial.text = "Bem vindo $nome_usuario"

        setSupportActionBar(binding.toolbarInclude.toolbar)

        supportActionBar?.title = "Paises"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

       // binding.botaoSair.setOnClickListener {cliqueSair()}
    }

    fun cliqueSair() {
        val returnIntent = Intent();
        returnIntent.putExtra("result","Saída do LMSApp");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        (menu?.findItem(R.id.action_buscar)?.actionView as SearchView?)?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {

                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {

                return false
            }

        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item?.itemId

        if  (id == R.id.action_buscar) {
            Toast.makeText(this, "clicou buscar", Toast.LENGTH_LONG).show()
        }
        else if (id == R.id.action_atualizar) {
            Toast.makeText(this, "clicou atualizar", Toast.LENGTH_LONG).show()
        }
         else if (id == R.id.action_adicionar) {
            Toast.makeText(this, "clicou adicionar", Toast.LENGTH_LONG).show()
        }

        else if (id == android.R.id.home) {
            finish()
        }
        return true             //super.onOptionsItemSelected(item)
    }

}
