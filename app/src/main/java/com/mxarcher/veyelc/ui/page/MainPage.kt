package com.mxarcher.veyelc.ui.page

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mxarcher.veyelc.R
import com.mxarcher.veyelc.ui.component.HomeImportantCard
import com.mxarcher.veyelc.ui.component.HomeOtherInfoRow

@Composable
fun MainPage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.verticalScroll(state = ScrollState(0))
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.veyelc),
            modifier = Modifier
                .defaultMinSize()
                .padding(20.dp)
                .padding(top = 20.dp),
            fontSize = 21.sp
        )
        val importConfig = Modifier
            .padding(horizontal = 16.dp)
            .padding(bottom = 16.dp)

        val commonConfig = Modifier
            .padding(horizontal = 16.dp)
            .padding(bottom = 8.dp)
        HomeImportantCard("已停止", "点此启动", importConfig)
        HomeImportantCard("配置", "igg 已激活", importConfig)
        HomeOtherInfoRow(title = "日志", modifier = commonConfig.fillMaxWidth())
        HomeOtherInfoRow(title = "设置", modifier = commonConfig.fillMaxWidth())
        HomeOtherInfoRow(title = "帮助", modifier = commonConfig.fillMaxWidth())
        HomeOtherInfoRow(
            title = "关于",
            modifier = importConfig
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
                .fillMaxWidth()
        )
    }
}