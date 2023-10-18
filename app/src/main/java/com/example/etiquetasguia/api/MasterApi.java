package com.example.etiquetasguia.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import com.example.etiquetasguia.model.Master;

import java.util.List;

public interface MasterApi {
    @GET("posts")
    Call<List<Master>> getMaster();
}
