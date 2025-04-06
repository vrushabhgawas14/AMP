package com.example.practical1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
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

        // Frame Layout
        val frame = findViewById<Button>(R.id.btnFrameLayout)
        frame.setOnClickListener{
            setContentView(R.layout.frame_layout)

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }

        }


        // List Layout

        val listLayout = findViewById<Button>(R.id.btnListLayout)
        listLayout.setOnClickListener{
            setContentView(R.layout.list_layout)

            val listView = findViewById<ListView>(R.id.userlist)
            val items = arrayOf("Apple", "Banana", "Cherry", "Date")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,items)
            listView.adapter = adapter

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }
        }

        // Grid Layout
        val grid = findViewById<Button>(R.id.btnGridLayout)
        grid.setOnClickListener{
            setContentView(R.layout.grid_layout)

            val homeButton = findViewById<Button>(R.id.btnHome)
            homeButton.setOnClickListener{
                setContentView(R.layout.activity_main)
            }

        }
    }
}