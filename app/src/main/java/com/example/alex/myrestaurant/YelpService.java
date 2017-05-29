package com.example.alex.myrestaurant;

/**
 * Created by alex on 5/29/17.
 */
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;



public class YelpService {
    private static OkHttpClient client = new OkHttpClient();

    public static void findRestaurants(String location, Callback callback) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.YELP_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.YELP_LOCATION_QUERY_PARAMETER, location);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .header("Authorization", "Bearer " + Constants.YELP_TOKEN)
                .url(url)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }
}

