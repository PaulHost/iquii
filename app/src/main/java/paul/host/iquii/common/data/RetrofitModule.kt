package paul.host.iquii.common.data

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Flowable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

private const val url = "https://www.reddit.com/"

val API: Api = RetrofitProvider.retrofit.create(Api::class.java)

interface Api {
    @GET("/r/{key_word}/top.json")
    fun getTop(@Path("key_word") keyWord: String): Flowable<Response>
}

object RetrofitProvider {

    val retrofit = getRetrofit()

    private fun getGson(): Gson = GsonBuilder().create()

    private fun getClient() = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .cache(null)
        .build()

    @JvmName("provideRetrofit")
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(getGson()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(url)
            .client(getClient())
            .build()
    }
}
