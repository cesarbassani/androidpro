package com.example.appajudabrasil

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProposicoesAdapter (val list: List<Proposicao>, val context: Context) : RecyclerView.Adapter<ProposicoesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val siglaTipo: TextView = itemView.findViewById(R.id.tv_sigla_tipo)
        val ementa: TextView = itemView.findViewById(R.id.tv_ementa)
        val ano: TextView = itemView.findViewById(R.id.tv_ano)
        val verMais: Button = itemView.findViewById(R.id.btn_ver_mais)
    }

}