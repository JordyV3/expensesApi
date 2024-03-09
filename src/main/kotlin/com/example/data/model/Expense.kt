package com.example.data.model

import kotlinx.serialization.Serializable

val expenses = mutableListOf(
    Expense(id = 1, 0.0, "GROCERIES", "Compra semanal"),
    Expense(id = 2, 0.0, "SNACKS", "Comida con amigos"),
    Expense(id = 3, 0.0, "CAR", "Audi A1"),
    Expense(id = 4, 0.0, "COFFEE", "Café con leche"),
    Expense(id = 5, 0.0, "PARTY", "Fiesta de fin de semana"),
    Expense(id = 6, 0.0, "HOUSE", "Gastos generales del hogar"),
    Expense(id = 7, 0.0, "OTHER", "Limpieza")
)


@Serializable
data class Expense(
    val id: Long = -1,
    val amount: Double,
    val categoryName: String,
    val description: String
)