package com.project.citacoesapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.citacoesapp.R
import com.project.citacoesapp.data.model.Citacoes
import com.project.citacoesapp.databinding.QuoteItemBinding

class QuotesAdapter(private val mQuote: List<Citacoes>): RecyclerView.Adapter<QuotesAdapter.QuotesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesViewHolder {
        val context = parent.context
        val binding = QuoteItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return QuotesViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: QuotesViewHolder, position: Int) {
        val quotes: Citacoes = mQuote[position]

        val authorName = holder.nameTextView
        val senteseQuote = holder.sentenseTextView

        authorName.text = quotes.autor.nome
        senteseQuote.text = quotes.frase
    }

    override fun getItemCount() = mQuote.size

    inner class QuotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView = itemView.findViewById<TextView>(R.id.author_name)
        val sentenseTextView = itemView.findViewById<TextView>(R.id.sentese_quote)
    }
}