package com.necatisozer.multicamp.kotlinoverview.notes

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.necatisozer.multicamp.kotlinoverview.R
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter(private val noteList: MutableList<Note>) :
    RecyclerView.Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(parent.inflate(R.layout.item_note))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = noteList[position]
        holder.bind(note) {
            deleteNote(note)
        }
    }

    override fun getItemCount(): Int = noteList.size

    fun addNote(note: Note) {
        noteList.add(0, note)
        notifyItemInserted(0)
    }

    fun deleteNote(note: Note) {
        val position = noteList.indexOf(note)
        noteList.remove(note)
        notifyItemRemoved(position)
    }

    fun updateNote(note: Note, position: Int) {
        noteList[position] = note
        notifyItemChanged(position)
    }
}

class NoteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(note: Note, onClick: () -> Unit) {
        itemView.textViewTitle.text = note.title
        itemView.textViewNote.text = note.text

        itemView.imageViewDelete.setOnClickListener {
            onClick()
        }
    }
}

