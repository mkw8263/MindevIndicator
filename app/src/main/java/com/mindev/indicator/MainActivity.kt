package com.mindev.indicator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mindev_indicator.run {
            createDot(5, R.drawable.circle_off, R.drawable.circle,3)
            selectDot(4)
        }
    }
}
