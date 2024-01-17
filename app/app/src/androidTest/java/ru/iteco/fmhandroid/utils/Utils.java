package ru.iteco.fmhandroid.utils;

import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import androidx.test.espresso.ViewInteraction;
public class Utils {
    public void elementIsDisplayed(ViewInteraction element) {
        element.check(matches(isDisplayed()));
    }

    public void enterTextInTheInput(ViewInteraction element, String message) {
        element.perform(replaceText(message), closeSoftKeyboard());
    }
}
