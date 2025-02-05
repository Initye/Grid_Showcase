package com.example.grid_showcase.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val id: Int,
    @DrawableRes val imageResourceId: Int
)
