package com.example.onimaids_finalproject.data

interface VtuberRepository {
    fun getVtubers() : List<Vtuber>
}