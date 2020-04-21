package com.chukwuebuka.portfolioapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

class MainActivity : AppCompatActivity() {

    var TAG: String= "ReadActivity"
    imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "The activity is in onCreate state")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


    override fun onActionModeStarted(mode: android.view.ActionMode?) {
        Log.d(TAG, "The activity is in onStart state")
        super.onActionModeStarted(mode)
    }

    override fun onSupportActionModeStarted(mode: ActionMode) {
        Log.d(TAG, "The activity is in onRestart state")
        super.onSupportActionModeStarted(mode)
    }

    override fun onPause() {
        Log.d(TAG, "The activity is in onPause state")
        super.onPause()
    }

    override fun onPostResume() {
        Log.d(TAG, "The activity is in onPostResume state")
        super.onPostResume()
    }



    override fun onDestroy() {
        Log.d(TAG, "The activity is in onDestroy state")
        super.onDestroy()
    }
}

