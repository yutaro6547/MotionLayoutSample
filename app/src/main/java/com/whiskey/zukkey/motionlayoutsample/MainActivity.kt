package com.whiskey.zukkey.motionlayoutsample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.view.View
import com.whiskey.zukkey.motionlayoutsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
    var motionLayout: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        motionLayout = binding.root
        val ml = motionLayout as? MotionLayout ?: return
        if (ml.progress > 0.5f) {
            ml.transitionToStart()
        } else {
            ml.transitionToEnd()
        }
    }
}
