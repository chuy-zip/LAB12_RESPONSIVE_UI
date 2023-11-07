package com.example.laboratorio12_pp

data class Memes(
    val name: String,
    val imageRes: Int
)

val memes = listOf(
    Memes(
        "Shocked Guy",
        R.drawable.test_image
    ),

    Memes(
        "McDonald's Eula",
        R.drawable.test_image1
    ),

    Memes(
        "GatoC",
        R.drawable.test_image2
    ),

    Memes(
        "Ya vinieron por mí",
        R.drawable.test_image3
    ),

    Memes(
        "Niño ratón",
        R.drawable.test_image4
    ),

    Memes(
        "AYAKA",
        R.drawable.test_image5
    )
)