package com.berkayertan.currencyconverter.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface API {

    @GET("/fixer/latest?apikey=KdlodTpxSngZRlB3gQuzFzcVfj0plXil")

    suspend fun getRates(@Query("base") base : String) : Response<CurrencyResponse>
}