package `in`.abaddon.cerberus

import `in`.abaddon.cerberus.models.Reading
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val r = Reading(4, null, 4.0, "")
    }
}
