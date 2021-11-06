package com.mahdiba97.board.feature_note.presentation.notes.componenets

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahdiba97.board.feature_note.domine.util.NoteOrder
import com.mahdiba97.board.feature_note.domine.util.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    order: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Title",
                selected = order is NoteOrder.Title,
                onSelected = { onOrderChange(NoteOrder.Title(order.orderType)) })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Date",
                selected = order is NoteOrder.Date,
                onSelected = { onOrderChange(NoteOrder.Date(order.orderType)) })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Color",
                selected = order is NoteOrder.Color,
                onSelected = { onOrderChange(NoteOrder.Color(order.orderType)) })
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Ascending",
                selected = order.orderType is OrderType.Ascending,
                onSelected = { onOrderChange(order.copy(OrderType.Ascending)) })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Descending",
                selected = order.orderType is OrderType.Descending,
                onSelected = { onOrderChange(order.copy(OrderType.Descending)) })
        }
    }
}