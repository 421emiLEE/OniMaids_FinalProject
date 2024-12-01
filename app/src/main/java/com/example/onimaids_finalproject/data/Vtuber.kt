package com.example.onimaids_finalproject.data

import java.util.concurrent.Flow.Subscriber

data class Vtuber(
    val channelName: String, //channel name
    val channelId: String,  // youtube channel id
    var subscriberCount: Int, // subscriber count
    var isFavorite: Boolean, // favoriting the user
)
