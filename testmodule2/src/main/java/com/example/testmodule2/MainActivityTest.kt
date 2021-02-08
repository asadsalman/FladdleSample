package com.example.testmodule2

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testBtnPass() {
        Espresso.onView(ViewMatchers.withText("Toggle Visibility")).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withText("text")).check(
            ViewAssertions.matches(
                ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)
            )
        )
    }
}