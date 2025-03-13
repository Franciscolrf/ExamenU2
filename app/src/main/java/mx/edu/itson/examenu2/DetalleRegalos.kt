package mx.edu.itson.examenu2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalleRegalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_regalos)

        val iv_image: ImageView = findViewById(R.id.iv_regalo_imagen)
        val tv_precio: TextView = findViewById(R.id.tv_regalo_precio)

        val bundle = intent.extras

        if(bundle !=null){
            iv_image.setImageResource(bundle.getInt("image"))
            tv_precio.setText(bundle.getString("precio"))

        }

    }
}