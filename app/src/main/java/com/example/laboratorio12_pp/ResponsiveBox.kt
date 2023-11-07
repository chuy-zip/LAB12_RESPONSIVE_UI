package com.example.laboratorio12_pp

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.AsyncImage
import com.example.laboratorio12_pp.ui.theme.Laboratorio12_PPTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun responsiveBox(){

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

                Text(text = "Bienvenida a la adaptive UI, rota el telefono para ver los cambios",
                    textAlign = TextAlign.Center)
                //Llamar aqui a la funcion de lazy grid
                AdaptiveGrid()

                Button(
                    onClick = {},
                ){
                    Text("Horizontal adaptive button")
                }
            }

            else{
                Text(text = "Bienvenida a la adaptive UI, rota el telefono para ver los cambios",
                    textAlign = TextAlign.Center)

                //Llamar aqui a la funcion de lazy list
                AdaptiveImage()

                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(400.dp, 48.dp)


                ){
                    Text(text ="Vertical adaptive button")
                }

            }
        }
    }
}

@Composable
fun AdaptiveGrid(){
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        content = {
            items(images) { img ->
                AsyncImage(
                    model = img,
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                )
            }
        },
        modifier = Modifier
            .fillMaxWidth()
    )
}