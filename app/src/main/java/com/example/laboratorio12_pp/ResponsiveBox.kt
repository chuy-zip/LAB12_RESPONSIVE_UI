package com.example.laboratorio12_pp

import android.content.Context
import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.AsyncImage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ResponsiveBox(context: Context){

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        val orientation = LocalConfiguration.current.orientation
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = if (orientation == Configuration.ORIENTATION_LANDSCAPE)
                Alignment.CenterHorizontally else Alignment.Start
        ) {

            if (orientation == Configuration.ORIENTATION_LANDSCAPE){

                Text(text = "Bienvenido a la adaptive UI, rota el teléfono para ver los cambios",
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp)
                //Llamar aqui a la funcion de lazy grid
                AdaptiveGrid(context)
            }

            else {
                Text(text = "Bienvenido a la adaptive UI, rota el teléfono para ver los cambios",
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp)

                //Llamar aquí a la funcion de lazy list
                AdaptiveImage(context, memes)
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AdaptiveGrid(context: Context){
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        content = {
            items(memes) { card ->
                Cards(context, name = card.name, image = card.imageRes)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
    )
}