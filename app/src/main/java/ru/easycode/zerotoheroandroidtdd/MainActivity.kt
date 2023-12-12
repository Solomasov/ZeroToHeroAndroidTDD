package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleTextView = findViewById<TextView>(R.id.titleTextView)

        findViewById<Button>(R.id.changeButton).setOnClickListener {
            titleTextView.text = getString(R.string.i_am_an_android_developer)
        }

    }

}