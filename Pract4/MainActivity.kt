package com.example.practical1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Linear Layout
        val linear = findViewById<Button>(R.id.btnLinerLayout)
        linear.setOnClickListener{
            setContentView(R.layout.linear_layout)

            val editText = findViewById<EditText>(R.id.editText)
            val showButton = findViewById<Button>(R.id.showInput)

            showButton.setOnClickListener{
                val name = editText.text.toString()
                Toast.makeText(this, "Your name is : $name", Toast.LENGTH_LONG).show()
            }

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }

        }

        // Relative Layout
        val relative = findViewById<Button>(R.id.btnRelativeLayout)
        relative.setOnClickListener{
            setContentView(R.layout.relative_layout)

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }

        }


        // Absolute Layout
        val absolute = findViewById<Button>(R.id.btnAbsoluteLayout)
        absolute.setOnClickListener{
            setContentView(R.layout.absolute_layout)

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }

        }


        // Table Layout
        val table = findViewById<Button>(R.id.btnTableLayout)
        table.setOnClickListener{
            setContentView(R.layout.table_layout)

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }

        }
    }
}