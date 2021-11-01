package com.mahdiba97.board.feature_note.domine.use_case

import com.mahdiba97.board.feature_note.domine.model.Note
import com.mahdiba97.board.feature_note.domine.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(
        note: Note
    ) {
        repository.deleteNote(note)
    }
}