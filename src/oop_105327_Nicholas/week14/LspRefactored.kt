package oop_105327_Nicholas.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int) : Shape{
    override fun area() = width * height
}