package org.buffer.android.boilerplate.data.model

import com.google.gson.annotations.SerializedName

/**
 * Representation for a [BufferooEntity] fetched from an external layer data source
 */
data class BufferooEntity(val id: Long, val login: String, val avatar_url: String)