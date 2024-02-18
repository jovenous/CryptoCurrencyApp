package com.example.cryptocurrencyapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.cryptocurrencyapp.databinding.ItemCoinInfoBinding
import com.example.cryptocurrencyapp.pojo.CoinPriceInfo
import com.squareup.picasso.Picasso

class CoinInfoAdapter : Adapter<CoinInfoAdapter.CoinInfoViewHolder>() {

    var coinInfoList: List<CoinPriceInfo> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

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
        val titleText = "${coin.fromSymbol} / ${coin.toSymbol}"
        val currentPrice = coin.price.toString()
        val lastUpdate = coin.getFormattedTime()

        with(holder) {
            binding.textViewSymbols.text = titleText
            binding.textViewPrice.text = currentPrice
            binding.textViewTimeUpdating.text = lastUpdate

            Picasso
                .get()
                .load(coin.getFullImageUrl())
                .into(binding.imageViewLogoCoin)
        }
    }

    override fun getItemCount() = coinInfoList.size


}