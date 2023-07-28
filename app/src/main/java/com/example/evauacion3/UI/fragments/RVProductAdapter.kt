package com.example.evauacion3.UI.fragments

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.evauacion3.R
import com.example.evauacion3.databinding.ItemProductBinding
import com.example.evauacion3.model.Movie


class RVProductAdapter(var products: List<Movie>): RecyclerView.Adapter<ProductVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        val b = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductVH(b)
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        holder.bind(products[position])
    }
}

class ProductVH(private val b: ItemProductBinding):RecyclerView.ViewHolder(b.root){
    fun bind(movie : Movie) {
        b.txtNomPelicula.text = movie.original_title
        if (movie.backdrop_path.isNotEmpty()){
            b.imgProduct.load(movie.backdrop_path)
        }else{
            b.imgProduct.setImageResource(R.drawable.mario1)
        }
    }

}