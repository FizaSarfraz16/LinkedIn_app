package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.NetworkAdapter
import com.example.myapplication.adapters.RequestAdapter
import com.example.myapplication.models.RequestModel
import com.example.myapplication.models.UserModel

class NetworkFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var requestRecyclerView: RecyclerView
    private lateinit var adapter: NetworkAdapter
    private lateinit var requestAdapter: RequestAdapter
    private var list: MutableList<RequestModel> = mutableListOf()
    private var connectionList: MutableList<UserModel> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_network, container, false)

        recyclerView = view.findViewById(R.id.recycler_network)
        requestRecyclerView = view.findViewById(R.id.request_recyclerView)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Network RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.isNestedScrollingEnabled = false

        // Request RecyclerView
        requestRecyclerView.setHasFixedSize(true)
        requestRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        requestRecyclerView.isNestedScrollingEnabled = false

        // Populate the lists statically for demonstration purposes
        populateStaticData()
    }

    // Function to populate static data
    private fun populateStaticData() {
        // Example static data for RequestModel and UserModel
        list.add(RequestModel(username = "John Doe", emailAddress = "john@example.com"))
        list.add(RequestModel(username = "Jane Smith", emailAddress = "jane@example.com"))

        connectionList.add(UserModel("1", "Alice"))
        connectionList.add(UserModel("2", "Bob"))


        // Setting up adapters
        requestAdapter = RequestAdapter(requireActivity(), list)
        requestRecyclerView.adapter = requestAdapter

        adapter = NetworkAdapter(requireActivity(), connectionList)
        recyclerView.adapter = adapter
    }
}
