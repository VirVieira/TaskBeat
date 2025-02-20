package com.devspace.taskbeats

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CategoryEntity(
    @PrimaryKey
    @ColumnInfo("key")
    val  name: String,
    @ColumnInfo("isSelected")
        val isSelected: Boolean
)
