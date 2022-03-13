package app.millitary.asessementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import lib.kingja.switchbutton.SwitchMultiButton

import android.view.View


class ScreenTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)
        supportActionBar?.hide()


        val mSwitchMultiButton = findViewById<View>(R.id.switchfamily) as SwitchMultiButton
        mSwitchMultiButton.setOnSwitchListener { position, tabText ->
          if (position==1){
              startActivity(Intent(this,ScreenThree::class.java))
          }
        }
    }

    fun movetoPrevious(view: android.view.View) {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}