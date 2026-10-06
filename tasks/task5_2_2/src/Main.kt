// Task 5.2.2: conversion of marks into grades, using a function

fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    var arg = 0
    var grades = ""
    for (x in args) {
        arg = x.toInt()
        grades = grade(arg)
        println("$arg is a $grades")
    }
}