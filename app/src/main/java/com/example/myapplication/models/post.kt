package com.example.myapplication.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Post(
    val viewType: Int,                      // 1 for Text, 2 for Image, 3 for Video
    @StringRes val profileNameResourceId: Int,
    @StringRes val profileDescResourceId: Int,
    @StringRes val postTimestampResourceId: Int,
    @DrawableRes val profileImgResourceID: Int,
    @StringRes val postContentResourceId: Int,
    @StringRes val socialCountResourceId: Int,
    @StringRes val commentCountResourceId: Int,
    val postImageResourceId: Int? = null,    // Optional for Image posts
    val postVideoResourceId: Int? = null     // Optional for Video posts
)
