package com.georgekolobaev.rduhelper

import android.graphics.Point

open class DrawPoint {

    val position = Point()

    open fun draw() {

    }

}


open class DrawLine : DrawPoint() {

    val endPosition = Point()

    override fun draw() {

    }

}


class DrawRect : DrawLine() {

    override fun draw() {

    }

}