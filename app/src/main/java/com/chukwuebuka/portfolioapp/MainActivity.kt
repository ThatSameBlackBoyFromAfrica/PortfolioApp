package com.chukwuebuka.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val TAG: String= "ReadActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "The activity is in onCreate state")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView?>(R.id.profilepic)
        imageView?.setOnClickListener {
            Log.d(TAG, "Profile Picture clicked ")
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        Log.d(TAG, "Entered onClick function")
        val intent = Intent(Intent.ACTION_SEND)
        val message = "Message"
        intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.type= "text/plain"
        val chooser = Intent.createChooser(intent, "Open with :")
        if(intent.resolveActivity(packageManager)!= null){
            startActivity(chooser)
        }
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

