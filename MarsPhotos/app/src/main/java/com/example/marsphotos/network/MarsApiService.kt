package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.http.GET

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType

// interface que define la comunicacion entre retrofit y la web
interface MarsApiService{
    // indicar a retrofit que se hará una solicitud GET
    // se usa el extremo /photos sobre la URL BASE
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}


