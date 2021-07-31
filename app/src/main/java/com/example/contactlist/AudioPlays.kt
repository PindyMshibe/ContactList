package com.example.contactlist

import android.content.LocusId
import android.media.MediaDataSource
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class AudioPlays : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_plays)

        mediaPlayer = MediaPlayer()

        mediaPlayer.setDataSource("assets/sound.mp3")

        mediaPlayer.start()

        // Locus.startLocationUpdates(this) { result ->
        //result.location?.let{
        //Log.d("Phindile")
    }
}