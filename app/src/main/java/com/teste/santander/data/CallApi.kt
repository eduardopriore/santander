package com.teste.santander.data

import com.teste.santander.model.StatementResponse
import com.teste.santander.model.UserResponse
import com.teste.santander.utils.Constants.Companion.API_PARAM_STATEMENT
import com.teste.santander.utils.Constants.Companion.API_PARAM_USER
import com.teste.santander.utils.Constants.Companion.API_PASSWORD
import com.teste.santander.utils.Constants.Companion.API_USER
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface CallApi {

    @GET(API_PARAM_STATEMENT)
    fun getStatement(): Call<StatementResponse>

    @FormUrlEncoded
    @POST(API_PARAM_USER)
    fun getUser(@Field(API_USER) user: String, @Field(API_PASSWORD) password: String): Call<UserResponse>
}
