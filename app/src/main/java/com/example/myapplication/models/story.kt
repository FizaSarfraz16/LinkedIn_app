
package com.example.myapplication.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Story(
    val viewType: Int,
    val storyProfileName: String,
    @DrawableRes val storyProfileImg: Int,
)
