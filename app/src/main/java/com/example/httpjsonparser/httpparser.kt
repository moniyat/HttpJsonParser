package com.example.httpjsonparser

import android.app.Application

class httpparser: Application() {

    lateinit var SongData: songData

    override fun onCreate() {
        super.onCreate()

        SongData = songData()
    }
}
