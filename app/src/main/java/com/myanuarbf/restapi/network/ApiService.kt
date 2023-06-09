package com.myanuarbf.restapi.network

import com.myanuarbf.restapi.model.request.Mahasiswa
import com.myanuarbf.restapi.model.response.ResponseAddDataMahasiswa
import com.myanuarbf.restapi.model.response.ResponseDataMahasiswa
import com.myanuarbf.restapi.model.response.ResponseDataUpdateMahasiswa
import com.myanuarbf.restapi.model.response.ResponseDeleteDataMahasiswa
import com.myanuarbf.restapi.model.response.ResponseDetailDataMahasiswa
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("datamahasiswa/")
    fun getDataMahasiswa() : Call<ResponseDataMahasiswa>

    @GET("datamahasiswa/{nim}")
    fun getDetailMahasiswa(@Path("nim") nim : String) : Call<ResponseDetailDataMahasiswa>

    @POST("datamahasiswa/")
    fun addDataMahasiswa(@Body data: Mahasiswa) : Call<ResponseAddDataMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteDataMahasiswa(@Path("nim") nim : String) : Call<ResponseDeleteDataMahasiswa>

    @POST("datamahasiswa/{nim}")
    fun updateDataMahasiswa(@Path("nim") nim : String, @Body data: Mahasiswa) : Call<ResponseDataUpdateMahasiswa>

}