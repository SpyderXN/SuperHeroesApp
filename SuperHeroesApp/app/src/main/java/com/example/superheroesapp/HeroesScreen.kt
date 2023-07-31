package com.example.superheroesapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.data.Hero
import com.example.superheroesapp.model.HeroesRepository
import com.example.superheroesapp.model.HeroesRepository.heroes
import com.example.superheroesapp.ui.theme.SuperHeroesAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HeroList(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ) {
        items(heroes) {
            HeroListItem(
                hero = it,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}

@Composable
fun HeroListItem(
    modifier: Modifier = Modifier,
    hero: Hero
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .size(72.dp)
        ) {
            HeroNames(
                name = hero.nameRes,
                description = hero.descriptionRes
            )
            Spacer(modifier = modifier.weight(1f))
            HeroImage(heroImage = hero.imageRes)
        }
    }
}

@Composable
fun HeroNames(
    modifier: Modifier = Modifier,
    @StringRes name: Int,
    @StringRes description: Int
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(name),
            style = MaterialTheme.typography.displaySmall,
            modifier = modifier.padding(end = 16.dp)

        )

        Text(
            text = stringResource(description),
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier.padding(end = 16.dp)
        )
    }
}

@Composable
fun HeroImage(
    modifier: Modifier = Modifier,
    @DrawableRes heroImage: Int
) {
    Image(
        painter = painterResource(heroImage),
        contentDescription = null,
        modifier = modifier
            .size(72.dp)
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop
    )
}

