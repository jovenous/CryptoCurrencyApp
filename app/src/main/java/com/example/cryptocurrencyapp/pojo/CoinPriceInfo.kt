package com.example.cryptocurrencyapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo (
    @SerializedName("TYPE")
    @Expose
    val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    val market: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val fromSymbol: String? = null,

    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val flags: String? = null,

    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String? = null,

    @SerializedName("MEDIAN")
    @Expose
    val median: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val topTierVolume24Hour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val topTierVolume24HourTo: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String? = null,

    @SerializedName("PRICE")
    @Expose
    val price: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Int? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    val lastVolume: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastVolumeTo: Double? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumeHour: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumeHourTo: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    val openHour: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    val highHour: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    val lowHour: Double? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumeDayTo: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    val openDay: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    val highDay: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    val lowDay: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24Hour: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24HourTo: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    val open24Hour: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    val high24Hour: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    val low24Hour: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24Hour: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changePct24Hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeDay: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changePctDay: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changeHour: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changePctHour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversionType: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionSymbol: String? = null,

    @SerializedName("CONVERSIONLASTUPDATE")
    @Expose
    val conversionLastUpdate: Int? = null,

    @SerializedName("SUPPLY")
    @Expose
    val supply: Int? = null,

    @SerializedName("MKTCAP")
    @Expose
    val mktCap: Double? = null,

    @SerializedName("MKTCAPPENALTY")
    @Expose
    val mktCappenalty: Int? = null,

    @SerializedName("CIRCULATINGSUPPLY")
    @Expose
    val circulatingSupply: Int? = null,

    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    @Expose
    val circulatingSupplyMktCap: Double? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val totalVolume24h: Double? = null,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val totalVolume24hto: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val totalTopTierVolume24h: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val totalTopTierVolume24Hto: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String? = null
)