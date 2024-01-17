package ru.iteco.fmhandroid.pageObjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.utils.Utils;

public class MainPage {
    Utils utils = new Utils();
    private ViewInteraction profileIcon = onView(allOf(withId(R.id.authorization_image_button), withContentDescription("Authorization")));

    public void profileIconIsDisplayed() {
        utils.elementIsDisplayed(profileIcon);
    }
}
