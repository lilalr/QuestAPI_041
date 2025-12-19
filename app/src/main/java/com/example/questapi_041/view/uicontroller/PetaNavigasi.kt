package com.example.questapi_041.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questapi_041.view.route.DestinasiEntry
import com.example.questapi_041.view.route.DestinasiHome
import com.example.questapi_041.view.EntrySiswaScreen
import com.example.questapi_041.view.HomeScreen

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    HostNavigasi(navController = navController)
}

