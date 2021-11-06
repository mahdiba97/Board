package com.mahdiba97.board.feature_note.domine.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mahdiba97.board.ui.theme.*

@Entity
data class Note(
    var title: String,
    var content: String,
    var color: Int,
    var timestamp: Long,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
