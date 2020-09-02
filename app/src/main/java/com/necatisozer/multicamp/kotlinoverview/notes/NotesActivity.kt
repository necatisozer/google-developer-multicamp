package com.necatisozer.multicamp.kotlinoverview.notes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.necatisozer.multicamp.kotlinoverview.R
import kotlinx.android.synthetic.main.activity_notes.*
import java.util.*

class NotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val noteList = generateNoteList().toMutableList()
        val notesAdapter = NotesAdapter(noteList)
        recyclerViewNote.adapter = notesAdapter

        buttonAddNote.setOnClickListener {
            val title = editTextTitle.text?.toString() ?: ""
            val text = editTextText.text?.toString() ?: ""
            val note = Note(UUID.randomUUID().toString(), title, text)
            notesAdapter.addNote(note)
            recyclerViewNote.scrollToPosition(0)

            /*
            val note = Note(id = UUID.randomUUID().toString(), title = "Hello", text = "World")
            notesAdapter.updateNote(note, 2)

             */

        }
    }
}