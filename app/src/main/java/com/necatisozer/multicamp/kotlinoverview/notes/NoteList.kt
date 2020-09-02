package com.necatisozer.multicamp.kotlinoverview.notes

import java.util.*

data class Note(val id: String, val title: String, val text: String)

fun generateNoteList(): List<Note> = listOf(
    Note(id = UUID.randomUUID().toString(), title = "1", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "2", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "3", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "4", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "5", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
    Note(id = UUID.randomUUID().toString(), title = "Note Title", text = "Note Text"),
)