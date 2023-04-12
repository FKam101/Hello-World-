//Package name for file
package com.example.mainactivity

// imports for the files
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//class activity that is defined for MainActivity, it then
// extends to AppCompatActivity
class MainActivity : AppCompatActivity() {

    //The onCreate method which is called on when the activity is
    // generated
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}