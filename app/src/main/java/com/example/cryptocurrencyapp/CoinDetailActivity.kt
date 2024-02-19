package com.example.cryptocurrencyapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cryptocurrencyapp.databinding.ActivityCoinDetailBinding
import com.example.cryptocurrencyapp.databinding.ActivityCoinPriceListBinding
import com.squareup.picasso.Picasso

class CoinDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    private lateinit var binding: ActivityCoinDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fromSymbol = intent.getStringExtra(EXTRA_FROM_SYMBOL) ?: ""
        if (!intent.hasExtra(EXTRA_FROM_SYMBOL)) {
            finish()
            return
        }

        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.getDetailInfo(fromSymbol).observe(this, Observer {
            with(binding) {
                textViewPrice.text = it.price.toString()
                textViewMinPerDay.text = it.lowDay.toString()
                textViewMaxPerDay.text = it.highDay.toString()
                textViewLastMarket.text = it.lastMarket
                textViewLastUpdate.text = it.getFormattedTime()
                textViewFromSymbol.text = it.fromSymbol
                textViewToSymbol.text = it.toSymbol

                Picasso
                    .get()
                    .load(it.getFullImageUrl())
                    .into(imageViewLogoCoin)
            }
        })
    }

    companion object {
        private const val EXTRA_FROM_SYMBOL = "fSym"

        fun newIntent(context: Context, fromSymbol: String): Intent {
            val intent = Intent(context, CoinDetailActivity::class.java)
            intent.putExtra(EXTRA_FROM_SYMBOL, fromSymbol)
            return intent
        }
    }
}