package com.berkayertan.currencyconverter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berkayertan.currencyconverter.data.API
import com.berkayertan.currencyconverter.databinding.ActivityMainBinding
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var BASE_URL = "https://api.apilayer.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        // KdlodTpxSngZRlB3gQuzFzcVfj0plXil api key


        getdata()
        binding.ButtonConvert.setOnClickListener {
            binding.EtFrom.text.toString()
            binding.TextViewTo.text.toString()
            binding.spToCurrency.selectedItem.toString()
        }
    }



    private fun getdata(){

        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(API::class.java   )
    }
}
