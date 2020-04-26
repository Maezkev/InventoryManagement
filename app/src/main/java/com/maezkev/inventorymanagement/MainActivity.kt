package com.maezkev.inventorymanagement

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddInventory_Button.setOnClickListener {
            startActivity(Intent(this, AddInventoryActivity::class.java))
        }
        val Preferences_Val = getSharedPreferences("InventoryDb", Context.MODE_PRIVATE)
        val SavedName_Val = Preferences_Val.getString("SaveProductName","This thing doesn't exist.")
        d("Maezkev", "The Saved Message is : $SavedName_Val")
    }
}
