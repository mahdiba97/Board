package com.mahdiba97.board.feature_note.data.repository

import com.mahdiba97.board.feature_note.data.data_source.NoteDao
import com.mahdiba97.board.feature_note.domine.model.Note
import com.mahdiba97.board.feature_note.domine.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}