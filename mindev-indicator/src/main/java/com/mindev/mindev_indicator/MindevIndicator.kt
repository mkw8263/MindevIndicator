package com.mindev.mindev_indicator

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.ImageView
import android.widget.LinearLayout

class MindevIndicator : LinearLayout {
    private var circleContext: Context? = null

    private var defaultCircle = 0
    private var selectCircle = 0

    private var imgDotList = mutableListOf<ImageView>()

    private val temp = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP, 4.5f, resources.displayMetrics
    )

    constructor(context: Context) : super(context) {
        circleContext = context
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        circleContext = context
    }

    fun createDot(count: Int, defaultCircle: Int, selectCircle: Int, position: Int) {
        removeAllViews()

        this.defaultCircle = defaultCircle
        this.selectCircle = selectCircle

        for (index in 0 until count) {
            imgDotList.add(ImageView(context)
                .apply {
                    setPadding(temp.toInt(), 0, temp.toInt(), 0)
                })
            addView(imgDotList[index])
        }
        selectDot(position)
    }

    fun selectDot(position: Int) {
        for (index in 0 until imgDotList.indices.count()) {
            if (index == position) imgDotList[index].setImageResource(selectCircle)
            else imgDotList[index].setImageResource(defaultCircle)
        }
    }
}