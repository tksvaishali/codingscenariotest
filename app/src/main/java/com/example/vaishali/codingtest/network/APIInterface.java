package com.example.vaishali.codingtest.network;

import com.example.vaishali.codingtest.domainobject.LocationDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * APIInterface is an interface for service call
 */
public interface APIInterface {

    @GET("sample.json")
    Call<List<LocationDetail>> getLocationData();
}
