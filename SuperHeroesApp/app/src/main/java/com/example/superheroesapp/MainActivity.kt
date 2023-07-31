package com.example.superheroesapp

import com.example.superheroesapp.ui.theme.SuperHeroesAppTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HeroApp()
                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroApp() {
    Scaffold(
        topBar = {
            HeroTopBar()
        }
    ) {
        HeroList(Modifier.padding(it))
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroTopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(title = {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.displayLarge
        )
    })
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperHeroesAppTheme {
        HeroApp()
    }
}