package com.mxarcher.veyelc.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mxarcher.veyelc.ui.theme.VeyelcTheme

@Composable
fun HomeOtherInfoRow(title: String, modifier: Modifier) {
    Row(
        modifier = modifier
            .padding(5.dp)
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = ColorPainter(Color.Cyan),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(10.dp)
        )

        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 4.dp),
            fontSize = 17.sp
        )
    }
}

@Preview
@Composable
fun DefaultPreView() {
    VeyelcTheme {
        HomeOtherInfoRow("hello", modifier = Modifier)
    }
}
