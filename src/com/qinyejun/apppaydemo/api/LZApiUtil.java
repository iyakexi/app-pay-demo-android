package com.qinyejun.apppaydemo.api;

import retrofit.RestAdapter;

public class LZApiUtil {
	private static LZApiUtil mInstance;	
	private LZApi api;
	private static final String HOST = "http://api.youdomain.com";
	
	private LZApiUtil() {
		RestAdapter restAdapter = new RestAdapter.Builder()
		.setLogLevel(RestAdapter.LogLevel.FULL)
		.setEndpoint(HOST).build();
		
		api = restAdapter.create(LZApi.class);
	}
	
	public static LZApiUtil getInstance() {
		if (mInstance == null) {
			mInstance = new LZApiUtil();
		}
		return mInstance;
	}
	
	public LZApi getApi() {
		return api;
	}
}
