package mx.edu.itson.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class Regalos : AppCompatActivity() {

    var lista = ArrayList<Detalles>()
    var adapter: AdaptadorProductos? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var option: String? = intent.getStringExtra("type")
        addProducts(option)

        adapter = AdaptadorProductos(this, lista)

        var gridtView: GridView = findViewById(R.id.detalles_grid)
        gridtView.adapter = adapter


    }
    fun addProducts(option: String?) {
        when(option) {
            "Detalles" -> {
                lista.add(Detalles(R.drawable.cumplebotanas, "$280"))
                lista.add(Detalles(R.drawable.cumplecheve, "$320"))
                lista.add(Detalles(R.drawable.cumpleescolar, "$330"))
                lista.add(Detalles(R.drawable.cumplepaletas, "$190"))
                lista.add(Detalles(R.drawable.cumplesnack, "$150"))
                lista.add(Detalles(R.drawable.cumplevinos, "$370"))
            }
            "Globos" -> {
                lista.add(Detalles(R.drawable.globoamor, "$240"))
                lista.add(Detalles(R.drawable.globocumple, "$820"))
                lista.add(Detalles(R.drawable.globofestejo, "$260"))
                lista.add(Detalles(R.drawable.globonum, "$760"))
                lista.add(Detalles(R.drawable.globoregalo, "$450"))
                lista.add(Detalles(R.drawable.globos, "$240"))
            }
            "Peluches" -> {
                lista.add(Detalles(R.drawable.peluchemario, "$320"))
                lista.add(Detalles(R.drawable.pelucheminecraft, "$320"))
                lista.add(Detalles(R.drawable.peluchepeppa, "$290"))
                lista.add(Detalles(R.drawable.peluches, "$320"))
                lista.add(Detalles(R.drawable.peluchesony, "$330"))
                lista.add(Detalles(R.drawable.peluchestich, "$280"))
                lista.add(Detalles(R.drawable.peluchevarios, "$195"))
            }
            "Regalos" -> {
                lista.add(Detalles(R.drawable.regaloazul, "$80"))
                lista.add(Detalles(R.drawable.regalobebe, "$290"))
                lista.add(Detalles(R.drawable.regalocajas, "$140"))
                lista.add(Detalles(R.drawable.regalocolores, "$85"))
                lista.add(Detalles(R.drawable.regalos, "$80"))
                lista.add(Detalles(R.drawable.regalovarios, "$75"))
            }
            "Tazas" -> {
                lista.add(Detalles(R.drawable.tazaabuela, "$120"))
                lista.add(Detalles(R.drawable.tazalove, "$120"))
                lista.add(Detalles(R.drawable.tazaquiero, "$260"))
                lista.add(Detalles(R.drawable.tazas, "$280"))
            }
        }
    }


    class AdaptadorProductos: BaseAdapter{
        var regalo = ArrayList<Detalles>()
        var contexto: Context?=null

        constructor(contexto: Context, r1: ArrayList<Detalles>){
            this.regalo = r1
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return regalo.size
        }

        override fun getItem(position: Int): Any {
            return  regalo[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var reg = regalo[position]
            var inflator = LayoutInflater.from(contexto)
            var vista = inflator.inflate(R.layout.activity_detalle_regalos,null)

            var image = vista.findViewById(R.id.iv_regalo_imagen) as ImageView
            var precio = vista.findViewById(R.id.tv_regalo_precio) as TextView

            image.setImageResource(reg.image)
            precio.setText(reg.precio)

            return vista
        }
    }
}