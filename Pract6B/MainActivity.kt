package com.example.practical1

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        title = "Kotlin App"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menus,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_bluetooth -> {
                Toast.makeText(this, "Bluetooth Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_call -> {
                Toast.makeText(this, "Call Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_about -> {
                Toast.makeText(this, "About Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_chat -> {
                Toast.makeText(this, "Chat Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}