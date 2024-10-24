package com.example.buscacep.api

import android.telecom.Call
import com.example.buscacep.api.model.Endereco
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("ws/{cep}/json/")
    fun setEndereco(@Path("cep")cep: String): retrofit2.Call<Endereco>
}