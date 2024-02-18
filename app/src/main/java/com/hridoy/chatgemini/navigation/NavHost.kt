/*
* MIT License
*
* Copyright (c) 2024 Hridoy Chandra Das
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*
*/
package com.hridoy.chatgemini.navigation

import androidx.activity.compose.BackHandler
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.PickVisualMediaRequest
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.hridoy.chatgemini.presentation.screens.HomeScreen
import com.hridoy.chatgemini.presentation.screens.ViewScreen
import kotlinx.coroutines.flow.MutableStateFlow

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainAnimationNavHost(
    imagePicker: ActivityResultLauncher<PickVisualMediaRequest>,
    uriState: MutableStateFlow<String>,
    navController: NavHostController,
    startDestination: String = ScreenDestinations.HomeScreen.route,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        screen(ScreenDestinations.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        screen(ScreenDestinations.ViewScreen.route) {
            ViewScreen(
                onBackPress = {
                    // navigateTo のためNavHostControllerを作成します。
                    navController.navigateTo(ScreenDestinations.HomeScreen.route)
                },
                imagePicker = imagePicker,
                uriState = uriState,
            )
        }
    }
    // Back Handler
    BackHandler {
        navController.popBackStack()
    }
}