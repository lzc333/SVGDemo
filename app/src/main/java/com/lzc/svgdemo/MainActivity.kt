package com.lzc.svgdemo

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var animatorSearch : AnimatedVectorDrawable
    lateinit var animatorLine : AnimatedVectorDrawable
    lateinit var animatorPath : AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMyImageView()
    }

    private fun initMyImageView() {
        animatorSearch = resources.getDrawable(R.drawable.my_animator_search) as AnimatedVectorDrawable
        animatorLine = resources.getDrawable(R.drawable.my_animator_line) as AnimatedVectorDrawable
        animatorPath = resources.getDrawable(R.drawable.my_animator_path) as AnimatedVectorDrawable



        line_button.setOnClickListener {
            my_imageView.setImageDrawable(animatorLine)
            animatorLine.start()
        }

        search_button.setOnClickListener{
            my_imageView.setImageDrawable(animatorSearch)
            animatorSearch.start()
        }

        path_button.setOnClickListener{
            my_imageView.setImageDrawable(animatorPath)
            animatorPath.start()
        }

        move_button.setOnClickListener {
            my_imageView.setImageResource(R.drawable.my_animator_move)
            val drawable: Drawable = my_imageView.drawable
            if (drawable is Animatable) {
                (drawable as Animatable).start()
            }

        }

    }
}