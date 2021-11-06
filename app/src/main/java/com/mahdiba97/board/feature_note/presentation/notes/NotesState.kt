package com.mahdiba97.board.feature_note.presentation.notes

import com.mahdiba97.board.feature_note.domine.model.Note
import com.mahdiba97.board.feature_note.domine.util.NoteOrder
import com.mahdiba97.board.feature_note.domine.util.OrderType

//survive screen rotation
data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
)
