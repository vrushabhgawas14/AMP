package com.example.practical1

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }


    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)

        builder.setMessage("Are you sure you want to exit?")
        builder.setTitle("Exit App?")
        builder.setCancelable(false)

        builder.setPositiveButton("Yes"){dialog,_ ->
            dialog.dismiss()
            super.onBackPressed()
        }

        builder.setNegativeButton("No"){
            dialog, _ -> dialog.dismiss()
        }

        val alertDialog = builder.create()
        alertDialog.show()
    }
}