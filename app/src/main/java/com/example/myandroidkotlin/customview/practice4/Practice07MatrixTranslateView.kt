package com.example.myandroidkotlin.customview.practice4

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.example.myandroidkotlin.R

class Practice07MatrixTranslateView @JvmOverloads constructor(context: Context?, attrs: AttributeSet?=null, defStyleAttr: Int=0)
    : View(context, attrs, defStyleAttr) {
    var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var bitmap: Bitmap? = null
    var point1 = Point(200, 200)
    var point2 = Point(600, 200)
    var mMatrix = Matrix()


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.save()
        mMatrix.reset()
        mMatrix.setTranslate(-100f, -100f)
        canvas.concat(mMatrix)
        canvas.drawBitmap(bitmap!!, point1.x.toFloat(), point1.y.toFloat(), paint)
        canvas.restore()
        canvas.save()
        mMatrix.reset()
        mMatrix.setTranslate(200f, 0f)
        canvas.concat(mMatrix)
        canvas.drawBitmap(bitmap!!, point2.x.toFloat(), point2.y.toFloat(), paint)
        canvas.restore()
    }

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.maps)
    }
}