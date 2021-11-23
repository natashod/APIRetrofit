package com.natashazahr.apiretrofit.API

import retrofit2.http.GET

const val BASE_URL = "https://random.dog"

interface ApiRequest {

    @GET("/woof.json?ref=apilist.fun")
    suspend fun getRandomDog(): ApiData
}