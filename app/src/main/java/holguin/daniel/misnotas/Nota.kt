package holguin.daniel.misnotas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.nota_layout.view.*

data class Nota(var titulo: String, var contenido: String) {
}

