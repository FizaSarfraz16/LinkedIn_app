
package com.example.myapplication.Data

import com.example.myapplication.R
import com.example.myapplication.models.Story

class StoryData {

    fun loadStory(): List<Story> {
        return listOf(
            Story(1,
                "Your Story",
                R.drawable.user
            ),
            Story(1,
                "dscsrec",
                R.drawable.dscsrec
            ),
            Story(2,
                "Google",
                R.drawable.google
            ),
            Story(2,
                "Apple",
                R.drawable.apple
            ),
            Story(2,
                "MacApp Studio",
                R.drawable.macapp
            ),
            Story(2,
                "LinkedIn",
                R.drawable.linkedin
            ),
            Story(2,
                "SREC",
                R.drawable.srec
            ),
        )
    }
}
