package com.example.superheroesapp.model

import com.example.superheroesapp.R
import com.example.superheroesapp.data.Hero

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.iron_man
        ),
        Hero(
            nameRes = R.string.hero2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.captain_america
        ),
        Hero(
            nameRes = R.string.hero3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.batman
        ),
        Hero(
            nameRes = R.string.hero4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.superman
        ),
        Hero(
            nameRes = R.string.hero5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.flash
        ),
        Hero(
            nameRes = R.string.hero6,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.doctor_strange
        )
    )
}
