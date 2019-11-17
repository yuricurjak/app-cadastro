package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog

class CadastrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        var app = App
        var btcadastrar = findViewById(R.id.btcadastrar) as Button
        var spinner = findViewById(R.id.spinnercategorias) as Spinner
        var categorias: ArrayList<Categoria> =
            arrayListOf(
                Categoria.MOBILE, Categoria.BAGS,
                Categoria.COMPUTADORES, Categoria.DISPOSITIVOS
            )

        val adapter = ArrayAdapter<Categoria>(
            this, android.R.layout.simple_spinner_item, categorias)
        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter


        btcadastrar.setOnClickListener({
            var nome = findViewById(R.id.inpnome) as EditText
            var desc = findViewById(R.id.inpdesc) as EditText
            var preco = findViewById(R.id.inppreco) as EditText
            var categ = findViewById(R.id.spinnercategorias) as Spinner

            var p: Produto = Produto(
                nome = nome.text.toString(),
                preco = preco.text.toString().toDouble(),
                descricao = desc.toString(),
                categoria = categ.getSelectedItem() as Categoria
            )
            app.produtos.add(p);

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Ok")
            builder.setMessage("Produto Cadastrado com Sucesso")
            builder.show()
        });
    }
}
