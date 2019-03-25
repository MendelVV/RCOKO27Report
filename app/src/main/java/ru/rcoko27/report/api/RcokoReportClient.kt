package ru.rcoko27.report.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RcokoReportClient {

    private const val BASE_URL = "http://192.168.43.14/rcoko27/api/"


    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()!!

    private val service = retrofit.create<APIService>(APIService::class.java)!!


}