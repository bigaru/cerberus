package `in`.abaddon.cerberus

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val data: MutableList<String> = arrayListOf("Meow", "Moo", "Pikachu","DRagon", "eMoo", "ePikeachu","DeeRagon")
    private val viewAdapter = RecyclerAdapter(data)

    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)

        recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        recycler_view.addOnScrollListener(onScrollListener)

        fab.setOnClickListener{v ->
            data.add("Mooo")
            viewAdapter.notifyDataSetChanged()
        }

    }

    private val onScrollListener = object: RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            if(dy < 0) // going up
                fab.show()

            if(dy > 0) // going down
                fab.hide()
        }
    }
}
