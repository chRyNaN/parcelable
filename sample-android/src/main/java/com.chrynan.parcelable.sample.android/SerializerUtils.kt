package com.chrynan.parcelable.sample.android

import com.chrynan.parcelable.core.Parcelable
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
object SerializerUtils {

    val parcelable: Parcelable = Parcelable.Default

    val json: Json = Json {
        prettyPrint = true
        encodeDefaults = true
    }
}
