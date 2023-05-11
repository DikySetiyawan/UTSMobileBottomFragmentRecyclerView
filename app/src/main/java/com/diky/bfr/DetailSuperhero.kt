package com.diky.bfr

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.diky.bfr.databinding.ActivityDetailSuperheroBinding

class DetailSuperhero : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Data>(HomeFragment.INTENT_PARCELABLE)

        val name: TextView = findViewById(R.id.tv_item_name_detil)
        val imageId: ImageView = findViewById(R.id.img_item_photo_detil)
        val deskripsi: TextView = findViewById(R.id.tv_item_description_detil)

        if (superhero != null) {
            name.text = superhero.name
            imageId.setImageResource(superhero.imageId)
            deskripsi.text = superhero.deskripsi
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}