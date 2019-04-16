package `in`.abaddon.cerberus

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class RecyclerAdapter(private val data: List<String>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(rowView: CardView) : RecyclerView.ViewHolder(rowView) {
        val title = rowView.findViewById<TextView>(R.id.row_title);
        val subtitle = rowView.findViewById<TextView>(R.id.row_subtitle);
        val footerLeft = rowView.findViewById<TextView>(R.id.row_footer_left);
        val footerRight = rowView.findViewById<TextView>(R.id.row_footer_right);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rowView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item, parent, false) as CardView

        return ViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = data[position]
        holder.subtitle.text = data[position] + 0
        holder.footerLeft.text = data[position] + 1
        holder.footerRight.text = data[position] + 2
    }

    override fun getItemCount() = data.size
}
