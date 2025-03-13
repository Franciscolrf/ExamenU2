package mx.edu.itson.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        var btnDetalles: Button = findViewById(R.id.btn_detalles) as Button
        var btnGlbos: Button = findViewById(R.id.btn_globos) as Button
        var btnPeluches: Button = findViewById(R.id.btn_peluches) as Button
        var btnRegalos: Button = findViewById(R.id.btn_regalos) as Button
        var btnTazas: Button = findViewById(R.id.btn_tazas) as Button

        btnDetalles.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Detalles")
            startActivity(intent)
        }

        btnGlbos.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Tazas")
            startActivity(intent)
        }

    }
}