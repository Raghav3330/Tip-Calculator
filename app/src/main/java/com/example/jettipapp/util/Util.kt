package com.example.jettipapp.util

fun CalculateTotalTip(totalBill: Double, tipPercentage: Int): Double {

    return if(totalBill > 1 && totalBill.toString().isNotEmpty())
        (totalBill * tipPercentage)/100 else 0.0
}
fun CalculatePerPerson(totalBill: Double,splitBy: Int, tipPercentage: Int): Double{
    val bill = CalculateTotalTip(totalBill, tipPercentage) + totalBill
    return (bill/splitBy)
}