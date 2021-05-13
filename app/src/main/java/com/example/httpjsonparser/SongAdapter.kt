package com.example.httpjsonparser

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.httpjsonparser.databinding.ItemSongBinding

class SongAdapter (private var listOfSongs: List<Song>): RecyclerView.Adapter<SongAdapter.SongViewHolder>() {
    var onSongClickListener: (name: String) -> Unit = {}

    class SongViewHolder(val binding: ItemSongBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongAdapter.SongViewHolder {
        val binding = ItemSongBinding.inflate(LayoutInflater.from(parent.context))
        return SongViewHolder(binding)

    }

    override fun onBindViewHolder(holder: SongAdapter.SongViewHolder, position: Int) {
        val specSong = listOfSongs[position]
        with(holder.binding) {
            title.text = specSong.title
            artist.text = specSong.artist
            root.setOnClickListener{
            }
        }
    }

    override fun getItemCount(): Int = listOfSongs.size
    fun updatePlaylist(newEmails: List<Song>) {
       // val callback = EmailDiffCallback(this.listOfSongs, newSongs)
        //val results = DiffUtil.calculateDiff(callback)
       // results.dispatchUpdatesTo(this)

       // this.listOfSongs = newSongs
    }
}