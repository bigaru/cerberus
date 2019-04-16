package `in`.abaddon.cerberus

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        view_pager.adapter = viewPagerAdapter

        tab_layout.setupWithViewPager(view_pager)
    }
}
