package app.millitary.asessementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScreenThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_three)
        supportActionBar?.hide()
    }
}