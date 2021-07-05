package com.example.finance_application

import android.telecom.Call
import com.example.finance_application.Model.Sign_up_model
import com.example.finance_application.Model.sign_model
import okhttp3.RequestBody
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api_Service {
    //    @POST("registration")
//    open fun createPost(@Body signUpModel: Sign_up_model): Call<Sign_up_model>
//    @POST("registration")
//    @FormUrlEncoded
//    fun registrationPost(@Field("email") email: String,
//                         @Field("password") password: String): Call<Sign_up_model>
//    @FormUrlEncoded
//    @POST("registration")
//    suspend fun registerUser(
//        @Field("email") email:String,
//        @Field("username") username:String,
//        @Field("password") password:String,
//    @Field("phone_number") phone_number:String)
//    @POST("login")
//    suspend fun loginUser(@Body requestBody: Sign_up_model): Response<Sign_up_model>


}