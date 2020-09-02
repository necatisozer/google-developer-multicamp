package com.necatisozer.multicamp.kotlinoverview.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layoutId: Int): View {
    val layoutInflater = LayoutInflater.from(context)
    return layoutInflater.inflate(layoutId, this, false)
}