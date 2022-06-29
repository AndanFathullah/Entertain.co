package com.dicoding.jetpacksubmission3.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.dicoding.jetpacksubmission3.R
import com.dicoding.jetpacksubmission3.utils.DataDummy
import com.dicoding.jetpacksubmission3.utils.EspressoIdlingRecource
import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest {
    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTrendMovies = DataDummy.generateDummyMoviesTrend()
    private val dummyTvShow = DataDummy.generateDummyTvShow()
    private val dummyTrendTvShow = DataDummy.generateDummyTvShowTrend()

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingRecource.idlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingRecource.idlingResource)
    }

    @Test
    fun loadPopularTvShow(){
        Espresso.onView(withId(R.id.navigation_dashboard)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.popular_series)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.popular_series)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTrendTvShow.size))
    }

    @Test
    fun loadDetailPopularTvShow(){
        Espresso.onView(withId(R.id.navigation_dashboard)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.popular_series)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
        Espresso.onView(withId(R.id.title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.year_release)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.genre)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.duration)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.filmRate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.overview)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.trailer_button)).perform(ViewActions.click())
    }

    @Test
    fun loadTvShow(){
        Espresso.onView(withId(R.id.navigation_dashboard)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.list_tv)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.list_tv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow(){
        Espresso.onView(withId(R.id.navigation_dashboard)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.list_tv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
        Espresso.onView(withId(R.id.title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.year_release)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.genre)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.duration)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.filmRate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.overview)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.trailer_button)).perform(ViewActions.click())
    }

    @Test
    fun loadTrendingMovies(){
        Espresso.onView(withId(R.id.trendMovies)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.trendMovies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTrendMovies.size))
    }

    @Test
    fun loadDetailTrendingMovies(){
        Espresso.onView(withId(R.id.trendMovies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
        Espresso.onView(withId(R.id.title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.year_release)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.genre)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.duration)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.filmRate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.overview)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.trailer_button)).perform(ViewActions.click())
    }

    @Test
    fun loadMovies(){
        Espresso.onView(withId(R.id.list_movies)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.list_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovies(){
        Espresso.onView(withId(R.id.list_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
        Espresso.onView(withId(R.id.title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.year_release)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.genre)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.duration)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.filmRate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.overview)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.trailer_button)).perform(ViewActions.click())
    }

    @Test
    fun loadFavorite(){
        Espresso.onView(withId(R.id.navigation_notifications)).perform(ViewActions.click())
    }
}