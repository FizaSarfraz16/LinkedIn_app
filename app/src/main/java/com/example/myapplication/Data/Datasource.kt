package com.example.myapplication.Data

import com.example.myapplication.R
import com.example.myapplication.models.Post

class Datasource {

    fun loadPosts(): List<Post> {
        return listOf(
            Post(
                viewType = 1,
                profileNameResourceId = R.string.profile_name,
                profileDescResourceId = R.string.profile_dec,
                postTimestampResourceId = R.string.post_timestamp,
                profileImgResourceID = R.drawable.ic_launcher_foreground,
                postContentResourceId = R.string.post_content,
                socialCountResourceId = R.string.social_count,
                commentCountResourceId = R.string.comment_count,
                postImageResourceId = null,  // Use null for optional image resource
                postVideoResourceId = null    // Use null for optional video resource
            ),
            Post(
                viewType = 2,
                profileNameResourceId = R.string.profile_name_1,
                profileDescResourceId = R.string.profile_dec_1,
                postTimestampResourceId = R.string.post_timestamp_1,
                profileImgResourceID = R.drawable.google,
                postContentResourceId = R.string.post_content_1,
                socialCountResourceId = R.string.social_count_1,
                commentCountResourceId = R.string.comment_count_1,
                postImageResourceId = R.drawable.post_1,  // Pass drawable ID directly
                postVideoResourceId = null    // Use null for optional video resource
            ),
            Post(
                viewType = 3,  // Changed ID to indicate a different view type
                profileNameResourceId = R.string.profile_name_3,
                profileDescResourceId = R.string.profile_dec_3,
                postTimestampResourceId = R.string.post_timestamp_3,
                profileImgResourceID = R.drawable.dscsrec,
                postContentResourceId = R.string.post_content_3,
                socialCountResourceId = R.string.social_count_3,
                commentCountResourceId = R.string.comment_count_3,
                postImageResourceId = R.drawable.post_2,  // Pass drawable ID directly
                postVideoResourceId = null    // Use null for optional video resource
            ),
            Post(
                viewType = 1,
                profileNameResourceId = R.string.profile_name_2,
                profileDescResourceId = R.string.profile_dec_2,
                postTimestampResourceId = R.string.post_timestamp_2,
                profileImgResourceID = R.drawable.apple,
                postContentResourceId = R.string.post_content_2,
                socialCountResourceId = R.string.social_count_2,
                commentCountResourceId = R.string.comment_count_2,
                postImageResourceId = null,  // Use null for optional image resource
                postVideoResourceId = null    // Use null for optional video resource
            ),
            Post(
                viewType = 3,  // Indicating this is a video post
                profileNameResourceId = R.string.profile_name_4,
                profileDescResourceId = R.string.profile_dec_4,
                postTimestampResourceId = R.string.post_timestamp_4,
                profileImgResourceID = R.drawable.dscsrec,
                postContentResourceId = R.string.post_content_4,
                socialCountResourceId = R.string.social_count_4,
                commentCountResourceId = R.string.comment_count_4,
                postImageResourceId = null,  // Use null for optional image resource
               // postVideoResourceId = R.raw.video_1  // Provide the video resource if applicable
            )
        )
    }
}
