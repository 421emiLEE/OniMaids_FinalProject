package com.example.onimaids_finalproject.di

import com.example.onimaids_finalproject.data.VtuberRepository
import com.example.onimaids_finalproject.data.VtuberRepositoryImpl
import com.example.onimaids_finalproject.viewmodel.VtubersViewModel
import org.koin.dsl.module

val appModules = module {
    single<VtuberRepository> { VtuberRepositoryImpl() }
    single { VtubersViewModel(get()) }
}