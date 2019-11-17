package com.example.cadastro

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Menu Principal")

        val contexto: Context = this
        cadastrarMain.setOnClickListener{
            val int = Intent( contexto,
            CadastrarActivity::class.java )
                startActivity(int)
        }

        val int = Intent(contexto,
            CadastrarActivity::class.java)
        val param = Bundle()
        param.putString("nome",
            "luis")
        int.putExtras(param)
        startActivity(int)

        val contexto2: Context = this
        listarMain.setOnClickListener{
            val int2 = Intent( contexto2,
                ListarActivity::class.java )
            startActivity(int2)
        }

        val int2 = Intent(contexto2,
            ListarActivity::class.java)
        val param2 = Bundle()
        param2.putString("nome",
            "luis")
        int2.putExtras(param2)
        startActivity(int2)


    }
    }