package com.mahdiba97.board.feature_note.domine.util

sealed class NoteOrder(val orderType: OrderType){
    class Title(orderType: OrderType):NoteOrder(orderType)
    class Color(orderType: OrderType):NoteOrder(orderType)
    class Date(orderType: OrderType):NoteOrder(orderType)
}
