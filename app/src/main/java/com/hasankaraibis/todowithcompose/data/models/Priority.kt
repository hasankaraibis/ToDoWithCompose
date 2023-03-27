package com.hasankaraibis.todowithcompose.data.models

import androidx.compose.ui.graphics.Color
import com.hasankaraibis.todowithcompose.ui.theme.HighPriorityColor
import com.hasankaraibis.todowithcompose.ui.theme.LowPriorityColor
import com.hasankaraibis.todowithcompose.ui.theme.MediumPriorityColor
import com.hasankaraibis.todowithcompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}