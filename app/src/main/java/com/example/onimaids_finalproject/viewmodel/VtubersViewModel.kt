package com.example.onimaids_finalproject.viewmodel

import com.example.onimaids_finalproject.data.VtuberRepository
import androidx.lifecycle.ViewModel

class VtubersViewModel (
    private val vtubersRepository: VtuberRepository
    ): ViewModel()
    {
        fun getVtubers() = vtubersRepository.getVtubers()
    }
