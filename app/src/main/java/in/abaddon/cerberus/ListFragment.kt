package `in`.abaddon.cerberus

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListFragment : Fragment() {

    private val data: MutableList<String> = arrayListOf("Meow", "Moo", "Pikachu","DRagon", "eMoo", "ePikeachu","DeeRagon")
    private val viewAdapter = RecyclerAdapter(data)

    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_list, container, false)

        recyclerView = rootView.findViewById(R.id.recycler_view);
        fab = rootView.findViewById(R.id.fab);

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewManager = LinearLayoutManager(activity?.applicationContext)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        recyclerView.addOnScrollListener(onScrollListener)

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
