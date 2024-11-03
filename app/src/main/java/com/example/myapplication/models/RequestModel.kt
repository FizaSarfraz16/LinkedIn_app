package com.example.myapplication.models

data class RequestModel(
    var username: String? = null,
    var emailAddress: String? = null, // Making this mutable if you need to change it
    var imageUrl: String? = null,
    var key: String? = null,
    var token: String? = null,
    var headline: String? = null,
    var location: String? = null
)
