package com.mahdiba97.board.feature_note.domine.use_case

import com.mahdiba97.board.feature_note.domine.model.InvalidNoteException
import com.mahdiba97.board.feature_note.domine.model.Note
import com.mahdiba97.board.feature_note.domine.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty!")
        }
        repository.insertNote(note)
    }
}