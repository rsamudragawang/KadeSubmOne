package com.ganargatul.kadesubmone.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Items (
    val name: String?,
    val description: String?,
    val image: Int?
) : Parcelable
