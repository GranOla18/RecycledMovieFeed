package com.axinpz.examenparcial2

import android.content.Context
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApplicationAdapter(context: Context, movieEntry: ArrayList<MovieModel>): RecyclerView.Adapter<ApplicationAdapter.ViewHolder>() {
    private var localContext: Context? = null
    private var localFeedEntries: ArrayList<MovieModel>? = null

    init {
        localContext = context
        localFeedEntries = movieEntry
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): ApplicationAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(localContext)
        val view: View = layoutInflater.inflate(R.layout.cards, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ApplicationAdapter.ViewHolder, position: Int) {
        //Creeme 100% que este objeto no es nulo -> !!, ignora que te dije que es nuleable
        val currentFeedEntry: MovieModel = localFeedEntries!![position]
        holder.textTitle.text = currentFeedEntry.title
        holder.textRating.text = currentFeedEntry.imdbRating
        holder.textMetascore.text = currentFeedEntry.metascore
        holder.textVotes.text = currentFeedEntry.imdbVotes

    }

    override fun getItemCount(): Int {
        //Si existe hazlo, si no, devuelve 0 como tamaño
        return localFeedEntries?.size ?:0
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v) {

        val textTitle: TextView = v.findViewById(R.id.txtView_title)
        val textRating: TextView = v.findViewById(R.id.txtView_rating)
        val textMetascore: TextView = v.findViewById(R.id.txtView_metascore)
        val textVotes: TextView = v.findViewById(R.id.txtView_votes)
    }
}