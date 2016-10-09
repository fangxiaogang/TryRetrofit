package com.example.xiaogang.tryretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by xiaogang on 16/10/8.
 */
public interface   GankApi {
    @GET("data/福利/10/{page}")
    Observable<Root> getresult(@Path("page")int page);
}
