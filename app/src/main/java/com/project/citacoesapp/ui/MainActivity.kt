package com.project.citacoesapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.citacoesapp.data.repo.RepositorioImpl
import com.project.citacoesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProvider(
            this,
            MainViewModel.MainViewModelFactory(RepositorioImpl())
        ).get(MainViewModel::class.java)

        viewModel.frases.observe(this, Observer { citacoes ->
            binding.rvQuotesList.apply {
                adapter = QuotesAdapter(citacoes)
                layoutManager = LinearLayoutManager(context)
            }
        })

        viewModel.getFrases()
    }
}