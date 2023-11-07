package com.example.laboratorio12_pp

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val images: List<Int> = listOf(R.drawable.test_image,
    R.drawable.test_image1,
    R.drawable.test_image2,
    R.drawable.test_image3,
    R.drawable.test_image4,
    R.drawable.test_image5)
@Composable
fun AdaptiveImage(context: Context, memesList: List<Memes>) {
    LazyColumn(
        modifier = Modifier
            .padding(vertical = 4.dp)
        ) {
        item {
            Column(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(vertical = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                memesList.forEach { memes -> Cards(context, memes.name, memes.imageRes)}
            }
        }
    }
}

@Composable
fun Cards(context: Context, name: String, image: Int) {

    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = image), contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit)
        }

        Column(modifier = Modifier.padding(8.dp)) {
                Text(text = name,
                    style = MaterialTheme.typography.headlineSmall)
                
                Button(onClick = { Toast.makeText(context, "Funciona", Toast.LENGTH_SHORT).show()}) {
                    Text(text = "Botón")
                }
            }
        }
}