package com.example.laboratorio12_pp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val images: List<Int> = listOf(R.drawable.test_image,
    R.drawable.test_image1,
    R.drawable.test_image2,
    R.drawable.test_image3,
    R.drawable.test_image4,
    R.drawable.test_image5)
@Composable
fun AdaptiveImage() {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        item(6) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(vertical = 25.dp))
            {
                Images()
            }
        }
    }
}

@Composable
fun Images() {
    Image(painter = painterResource(id = images[0]), contentDescription = "Image")
    Image(painter = painterResource(id = images[1]), contentDescription = "Image")
    Image(painter = painterResource(id = images[2]), contentDescription = "Image")
    Image(painter = painterResource(id = images[3]), contentDescription = "Image")
    Image(painter = painterResource(id = images[4]), contentDescription = "Image")
    Image(painter = painterResource(id = images[5]), contentDescription = "Image")
}
@Preview(showBackground = true)
@Composable
fun ImagePreview() {
    AdaptiveImage()
}