package com.example.httpjsonparser

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Song(
        val id: Int,
        val title: String,
        val artist: String,
        val durationMillis: Int,
        val smallImgURL: String,
        val largeImgURL: String
): Parcelable

