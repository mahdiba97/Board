package com.mahdiba97.board.feature_note.domine.use_case

import com.mahdiba97.board.feature_note.domine.model.Note
import com.mahdiba97.board.feature_note.domine.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}