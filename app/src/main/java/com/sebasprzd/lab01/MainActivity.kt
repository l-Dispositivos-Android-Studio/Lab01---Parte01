package com.sebasprzd.lab01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {





    private lateinit var imagenSeleccionada: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imagenSeleccionada = findViewById(R.id.imagenSeleccionada)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imagenesPequeñas = listOf(
            findViewById<ImageView>(R.id.imagen6),
            findViewById<ImageView>(R.id.imagen7),
            findViewById<ImageView>(R.id.imagen2),
            findViewById<ImageView>(R.id.imagen3),
            findViewById<ImageView>(R.id.imagenChayanne),
            findViewById<ImageView>(R.id.imagen5)
        )

        for (imagen in imagenesPequeñas) {
            imagen.setOnClickListener { cambiarImagen(imagen) }
        }
    }

    private fun cambiarImagen(imagen: ImageView) {
        imagenSeleccionada.setImageDrawable(imagen.drawable)
    }
}
