package com.example.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        var app = App

        var listView =
            findViewById(R.id.listView) as
                    ListView
        var arrTest = app.produtos
        /*var arrTest =
            arrayListOf<String>("T1", "T2", "T3")*/
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            arrTest)
        listView.adapter = adapter


    }
}
