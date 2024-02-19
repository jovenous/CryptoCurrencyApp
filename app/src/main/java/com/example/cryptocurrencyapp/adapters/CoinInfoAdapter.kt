package com.example.cryptocurrencyapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.cryptocurrencyapp.R
import com.example.cryptocurrencyapp.databinding.ItemCoinInfoBinding
import com.example.cryptocurrencyapp.pojo.CoinPriceInfo
import com.squareup.picasso.Picasso

class CoinInfoAdapter(private val context: Context) : Adapter<CoinInfoAdapter.CoinInfoViewHolder>() {

    var coinInfoList: List<CoinPriceInfo> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var onCoinClickListener: OnCoinClickListener? = null

    inner class CoinInfoViewHolder(val binding: ItemCoinInfoBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        val binding = ItemCoinInfoBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CoinInfoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        val coin = coinInfoList[position]
        val symbolsTemplate = context.resources.getString(R.string.symbols_template)
        val lastUpdateTemplate = context.resources.getString(R.string.last_update_template)
        val titleText = String.format(symbolsTemplate, coin.fromSymbol, coin.toSymbol)
        val currentPrice = coin.price.toString()
        val lastUpdate = String.format(lastUpdateTemplate, coin.getFormattedTime())

        with(holder) {
            binding.textViewSymbols.text = titleText
            binding.textViewCurrentPrice.text = currentPrice
            binding.textViewTimeUpdating.text = lastUpdate

            Picasso
                .get()
                .load(coin.getFullImageUrl())
                .into(binding.imageViewLogoCoin)

            itemView.setOnClickListener {
                onCoinClickListener?.onCoinClick(coin)
            }
        }


    }

    override fun getItemCount() = coinInfoList.size

    interface OnCoinClickListener {
        fun onCoinClick(coinPriceInfo: CoinPriceInfo)
    }


}