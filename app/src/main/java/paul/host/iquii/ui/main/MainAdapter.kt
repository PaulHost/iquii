package paul.host.iquii.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import paul.host.iquii.R
import com.squareup.picasso.Picasso.Builder
import paul.host.iquii.common.isTrue
import timber.log.Timber

class MainAdapter(
    context: Context,
    private val list: MutableList<String> = mutableListOf(),
    private val picasso: Picasso = Builder(context).build(),
    private val onItemClick: (url: String) -> Unit = { _ -> }
) : RecyclerView.Adapter<MainViewHolder>() {

    fun setList(list: List<String>) {
        list.isNotEmpty() isTrue {
            this.list.clear()
            this.list.addAll(list)
            this.notifyDataSetChanged()
        }.invoke()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val url = list[position]
        picasso.load(url).into(holder.image)
        holder.image.setOnClickListener { onItemClick(url) }
    }
}

class MainViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val image: ImageView = v.findViewById(R.id.imageView)
}