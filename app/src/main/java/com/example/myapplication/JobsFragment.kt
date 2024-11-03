package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import de.hdodenhof.circleimageview.CircleImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout

class JobsFragment : Fragment() {

    private lateinit var profileImg: CircleImageView
    private lateinit var textView: TextView
    private lateinit var cardView: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_jobs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profileImg = view.findViewById(R.id.user_img)
        textView = view.findViewById(R.id.text)
        cardView = view.findViewById(R.id.card_view)

        // Here, you could set a default image or text if needed, but no backend logic.
    }
}
