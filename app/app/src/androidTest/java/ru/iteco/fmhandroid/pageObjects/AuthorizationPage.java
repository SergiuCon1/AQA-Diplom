package ru.iteco.fmhandroid.pageObjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.utils.Utils;

public class AuthorizationPage {
    Utils utils = new Utils();
    MainPage mainPage = new MainPage();
    private ViewInteraction loginInput = onView(withId(R.id.login_text_input_layout));
    private ViewInteraction passwordInput = onView(withId(R.id.password_text_input_layout));
    private ViewInteraction signInButton = onView(allOf(withId(R.id.enter_button), withText("Sign in")));

    public void elementsWasLoaded() {
        utils.elementIsDisplayed(loginInput);
        utils.elementIsDisplayed(passwordInput);
        utils.elementIsDisplayed(signInButton);
    }
    public void signInWithLoginAndPassword(String login, String password) throws InterruptedException {
        utils.enterTextInTheInput(loginInput, login);
        utils.enterTextInTheInput(passwordInput, password);
        signInButton.perform(click());

        mainPage.profileIconIsDisplayed();
    }
}
