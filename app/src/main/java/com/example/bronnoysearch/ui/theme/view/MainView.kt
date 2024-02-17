package com.example.bronnoysearch.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bronnoysearch.R
import com.example.bronnoysearch.ui.theme.LightBeige
import com.example.bronnoysearch.ui.theme.MellowBlue


@Preview
@Composable
fun MainViewPreview() {
    MainView()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = MellowBlue) {
                Image(
                    modifier = Modifier.fillMaxSize().weight(1f).padding(10.dp),
                    painter = painterResource(id = R.drawable.search_icon),
                    contentDescription = null
                )

                Image(
                    modifier = Modifier.fillMaxSize().weight(1f),
                    painter = painterResource(id = R.drawable.load_icon),
                    contentDescription = null
                )
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .background(LightBeige)
            .fillMaxSize()) {

            SearchBar(query = "Skriv for å søke etter bedrift", onQueryChange = { } , onSearch = {}, active = true, onActiveChange = {} ) {
                
            }
        }
    }
}