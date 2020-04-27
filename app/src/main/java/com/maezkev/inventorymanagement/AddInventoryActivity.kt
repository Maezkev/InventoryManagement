package com.maezkev.inventorymanagement

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.ContactsContract
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_inventory.*

class AddInventoryActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_inventory)

        val Database_Val = getSharedPreferences("Inventory_Db", Context.MODE_PRIVATE)
        Database_Val.edit().apply {

        }
    }
}