package com.lzc.svgdemo

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var animatorFill : AnimatedVectorDrawable
    lateinit var animatorEmpty : AnimatedVectorDrawable
    var isEmpty = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMyImageView()
    }

    private fun initMyImageView() {
        animatorFill = resources.getDrawable(R.drawable.my_animator_fill) as AnimatedVectorDrawable
        animatorEmpty = resources.getDrawable(R.drawable.my_animator_empty) as AnimatedVectorDrawable

        my_imageView.setOnClickListener {
            if(isEmpty){
                my_imageView.setImageDrawable(animatorEmpty)
                animatorEmpty.start()
            }else{
                my_imageView.setImageDrawable(animatorFill)
                animatorFill.start()
            }
            isEmpty = !isEmpty
        }
    }
}