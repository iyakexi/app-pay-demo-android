package com.qinyejun.apppaydemo.api;

import java.util.Map;

import android.R.string;

import com.qinyejun.apppaydemo.model.*;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

public interface LZApi {
	
	 @GET("/wxpay/prepay/{orderID}/")
	 public void getPrepay(@Path("orderID") String orderID,Callback<PrePayModel> response);
}
