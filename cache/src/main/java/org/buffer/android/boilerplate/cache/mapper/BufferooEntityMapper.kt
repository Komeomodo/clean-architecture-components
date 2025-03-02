package org.buffer.android.boilerplate.cache.mapper

import org.buffer.android.boilerplate.cache.model.CachedBufferoo
import org.buffer.android.boilerplate.data.model.BufferooEntity
import javax.inject.Inject

/**
 * Map a [CachedBufferoo] instance to and from a [BufferooEntity] instance when data is moving between
 * this later and the Data layer
 */
open class BufferooEntityMapper @Inject constructor():
        EntityMapper<CachedBufferoo, BufferooEntity> {

    /**
     * Map a [BufferooEntity] instance to a [CachedBufferoo] instance
     */
    override fun mapToCached(type: BufferooEntity): CachedBufferoo {
        return CachedBufferoo(type.id, type.login,  type.avatar_url)
    }

    /**
     * Map a [CachedBufferoo] instance to a [BufferooEntity] instance
     */
    override fun mapFromCached(type: CachedBufferoo): BufferooEntity {
        return BufferooEntity(type.id, type.login, type.avatar_url)
    }

}