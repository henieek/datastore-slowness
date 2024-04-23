package com.example.datastoreslowness

import android.app.Application
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.preferencesDataStoreFile

class MainApplication : Application() {

    val store by lazy {
        PreferenceDataStoreFactory
            .create { preferencesDataStoreFile("my_preferences") }
    }
}