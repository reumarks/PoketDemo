package com.reumarks.poketdemo

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Handle openDrawer button interactions
        val openDrawerButton: Button = findViewById(R.id.show_bottom_sheet_button)

        openDrawerButton.setOnClickListener {
            // When pressed the bottom sheet dialog should be shown
            showBottomSheetDialog()
        }
    }

    private fun showBottomSheetDialog() {
        // Create a new BottomSheetDialog and assign the bottom_sheet_layout to its view
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_layout, null)
        dialog.setContentView(view)

        // Load the list of fruits and bind them to the recycler view using a custom adapter
        val fruitsList = loadFruitListFromCSV(this)
        val recyclerView: RecyclerView = view.findViewById(R.id.fruit_list_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = FruitAdapter(fruitsList)

        // Handle close button interactions
        val closeButton: Button = view.findViewById(R.id.close_button)
        closeButton.setOnClickListener {
            dialog.dismiss()
        }

        // Handle interactions from the other button -- currently just a placeholder
        val selectButton: Button = view.findViewById(R.id.select_button)
        selectButton.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
        }

        // Display the dialog
        dialog.show()
    }

    private fun loadFruitListFromCSV(context: Context): List<String> {
        // Create an empty mutable list
        val fruitList = mutableListOf<String>()

        // Attempt to read the fruitList stored in the assets folder
        try {
            context.assets.open("fruitList.csv").bufferedReader().useLines { lines ->
                // Each line has its own entry so can just be trimmed and used as is
                lines.forEach {
                    fruitList.add(it.trim())
                }
            }
        } catch (e: IOException) {
            // If the read fails then display an error in the console
            e.printStackTrace()
        }

        // Return the list of fruits
        return fruitList
    }
}