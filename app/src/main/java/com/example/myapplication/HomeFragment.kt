package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.PostAdapter
import com.example.myapplication.models.Post

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var postAdapter: PostAdapter
    private lateinit var postList: List<Post>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Set up RecyclerView
        recyclerView = view.findViewById(R.id.recycler_view_posts)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Load posts with the dummy data
        postList = loadPosts()

        // Initialize PostAdapter with the dataset
        postAdapter = PostAdapter(requireContext(), postList)
        recyclerView.adapter = postAdapter

        return view
    }

    // Load posts using the dummy data from strings.xml
    private fun loadPosts(): List<Post> {
        return listOf(
            Post(
                viewType = PostAdapter.VIEW_TYPE_TEXT,
                profileNameResourceId = R.string.profile_name_1,
                profileDescResourceId = R.string.profile_dec_1,
                postTimestampResourceId = R.string.post_timestamp_1,
                profileImgResourceID = R.drawable.google, // Ensure you have this drawable
                postContentResourceId = R.string.post_content_1,
                socialCountResourceId = R.string.social_count_1,
                commentCountResourceId = R.string.comment_count_1
            ),
            Post(
                viewType = PostAdapter.VIEW_TYPE_TEXT,
                profileNameResourceId = R.string.profile_name_2,
                profileDescResourceId = R.string.profile_dec_2,
                postTimestampResourceId = R.string.post_timestamp_2,
                profileImgResourceID = R.drawable.post_2, // Ensure you have this drawable
                postContentResourceId = R.string.post_content_2,
                socialCountResourceId = R.string.social_count_2,
                commentCountResourceId = R.string.comment_count_2
            ),
            Post(
                viewType = PostAdapter.VIEW_TYPE_IMAGE,
                profileNameResourceId = R.string.profile_name_3,
                profileDescResourceId = R.string.profile_dec_3,
                postTimestampResourceId = R.string.post_timestamp_3,
                profileImgResourceID = R.drawable.dscsrec,
                postContentResourceId = R.string.post_content_1,
                postImageResourceId = R.drawable.post_2,
                socialCountResourceId = R.string.social_count_1,
                commentCountResourceId = R.string.comment_count_1
            ),
            Post(
                viewType = PostAdapter.VIEW_TYPE_IMAGE,
                profileNameResourceId = R.string.profile_name_3,
                profileDescResourceId = R.string.profile_dec_3,
                postTimestampResourceId = R.string.post_timestamp_4,
                profileImgResourceID = R.drawable.google,
                postContentResourceId = R.string.post_content_2,
                postImageResourceId = R.drawable.post_1,
                socialCountResourceId = R.string.social_count_3,
                commentCountResourceId = R.string.comment_count_3
            ),
            Post(
                viewType = PostAdapter.VIEW_TYPE_TEXT,
                profileNameResourceId = R.string.profile_name_3,
                profileDescResourceId = R.string.profile_dec_3,
                postTimestampResourceId = R.string.post_timestamp_3,
                profileImgResourceID = R.drawable.post_2, // Ensure you have this drawable
                postContentResourceId = R.string.post_content_3,
                socialCountResourceId = R.string.social_count_3,
                commentCountResourceId = R.string.comment_count_4
            ),
            Post(
                viewType = PostAdapter.VIEW_TYPE_VIDEO,
                profileNameResourceId = R.string.profile_name_4,
                profileDescResourceId = R.string.profile_dec_4,
                postTimestampResourceId = R.string.post_timestamp_4,
                profileImgResourceID = R.drawable.dscsrec, // Ensure you have this drawable
                postContentResourceId = R.string.post_content_4,
                postVideoResourceId = R.raw.sample_video, // Ensure you have this raw video resource
                socialCountResourceId = R.string.social_count_4,
                commentCountResourceId = R.string.comment_count_4
            ),
        )
    }
}
