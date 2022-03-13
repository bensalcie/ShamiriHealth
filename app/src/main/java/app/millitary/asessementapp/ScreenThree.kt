package app.millitary.asessementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import lib.kingja.switchbutton.SwitchMultiButton

class ScreenThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_three)
        supportActionBar?.hide()
        val mSwitchMultiButton = findViewById<View>(R.id.switchfamily) as SwitchMultiButton
        mSwitchMultiButton.setOnSwitchListener { position, tabText ->
            if (position==0){
                startActivity(Intent(this,ScreenTwo::class.java))
            }
        }
    }

    fun movetoPrevious(view: android.view.View) {
        startActivity(Intent(this,ScreenTwo::class.java))
        finish()
    }
}