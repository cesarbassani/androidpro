package com.example.appajudabrasil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var list: MutableList<Proposicao> = emptyList<Proposicao>().toMutableList()

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ProposicoesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add(Proposicao(1, "", "PEC", 2019, "Ementa de teste!"))
        list.add(Proposicao(2, "", "PEC", 2019, "Segunda Ementa de teste!"))

        recyclerView = findViewById(R.id.rv_proposicoes)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapter = ProposicoesAdapter(list, this)
        recyclerView.adapter = adapter
    }
}
