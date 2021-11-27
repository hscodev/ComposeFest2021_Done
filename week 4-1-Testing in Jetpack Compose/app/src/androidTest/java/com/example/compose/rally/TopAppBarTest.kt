package com.example.compose.rally

import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class TopAppBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarTest_billsTabSelected() {
        composeTestRule.setContent {
            RallyApp()
        }

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Bills.name)
            .performClick()
            .assertIsSelected()
    }
}