package com.example.savingdatalocalusingroom

import android.app.Application

class EmployeeApp : Application() {
    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }
}