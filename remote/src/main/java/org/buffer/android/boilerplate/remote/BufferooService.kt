package org.buffer.android.boilerplate.remote

import io.reactivex.Flowable
import org.buffer.android.boilerplate.remote.model.BufferooModel
import retrofit2.http.GET

/**
 * Defines the abstract methods used for interacting with the Bufferoo API
 */
interface BufferooService {

    @GET("users")
    fun getBufferoos(): Flowable<List<BufferooModel>>

    @GET("users/{user}")
    fun getBufferoo(): Flowable<BufferooModel>


    class BufferooResponse {
        lateinit var team: List<BufferooModel>
    }

}