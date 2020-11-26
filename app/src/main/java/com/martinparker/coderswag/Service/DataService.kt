package com.martinparker.coderswag.Service

import com.martinparker.coderswag.Model.Category
import com.martinparker.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hats", "hatimage"),
        Category("Hoodies", "hoddieimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("hat1","$11","hat01"),
        Product("hat2","$11","hat02"),
        Product("hat3","$11","hat03"),
        Product("hat4","$11","hat04")
    )
    val hoodies = listOf(
        Product("hoodies1","$12","hoodie01"),
        Product("hoodies2","$12","hoodie02"),
        Product("hoodies3","$12","hoodie03"),
        Product("hoodies4","$12","hoodie04")
    )
    val shirts = listOf(
        Product("shirts1","$13","shirt01"),
        Product("shirts2","$13","shirt02"),
        Product("shirts3","$13","shirt03"),
        Product("shirts4","$13","shirt04")
    )

}