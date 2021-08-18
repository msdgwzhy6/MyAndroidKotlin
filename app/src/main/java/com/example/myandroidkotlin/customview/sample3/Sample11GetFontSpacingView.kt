package com.example.myandroidkotlin.customview.sample3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Sample11GetFontSpacingView @JvmOverloads constructor(context: Context?, attrs: AttributeSet?=null, defStyleAttr: Int=0)
    : View(context, attrs, defStyleAttr) {
    var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var text = "Hello HenCoder"

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val spacing = paint.fontSpacing
        canvas.drawText(text, 50f, 100f, paint)
        canvas.drawText(text, 50f, 100 + spacing, paint)
        canvas.drawText(text, 50f, 100 + spacing * 2, paint)
    }

    init {
        paint.textSize = 60f
    }
}