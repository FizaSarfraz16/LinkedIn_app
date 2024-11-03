package com.example.myapplication.models

import android.os.Parcel
import android.os.Parcelable

data class UserModel(
    var username: String? = null,
    var emailAddress: String? = null,
    var imageUrl: String? = null,
    var key: String? = null,
    private var token: String? = null,
    var location: String? = null,
    var headline: String? = null
) : Parcelable {

    constructor(parcel: Parcel) : this(
        username = parcel.readString(),
        emailAddress = parcel.readString(),
        imageUrl = parcel.readString(),
        key = parcel.readString(),
        token = parcel.readString(),
        location = parcel.readString(),
        headline = parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeString(emailAddress)
        parcel.writeString(imageUrl)
        parcel.writeString(key)
        parcel.writeString(token)
        parcel.writeString(location)
        parcel.writeString(headline)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserModel> {
        override fun createFromParcel(parcel: Parcel): UserModel {
            return UserModel(parcel)
        }

        override fun newArray(size: Int): Array<UserModel?> {
            return arrayOfNulls(size)
        }
    }
}
