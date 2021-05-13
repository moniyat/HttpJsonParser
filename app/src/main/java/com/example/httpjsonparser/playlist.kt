package com.example.httpjsonparser

data class playlist (
    val title: String,
    val numOfSongs: Int,
    val songs: List<Song>

)