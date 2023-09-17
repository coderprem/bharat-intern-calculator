package com.example.bcalculator

sealed class CalculatorAction {
    data class Number(val number: Int) : CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
}
