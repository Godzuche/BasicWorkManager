package com.example.basicworkmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnStartWork: Button
    lateinit var btnWorkStatus: Button
    lateinit var btnResetStatus: Button
    lateinit var btnWorkUIThread: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStartWork = findViewById(R.id.btnStartWork)
        btnWorkStatus = findViewById(R.id.btnWorkStatus)
        btnResetStatus = findViewById(R.id.btnResetStatus)
        btnWorkUIThread = findViewById(R.id.btnWorkUIThread)

    }
}