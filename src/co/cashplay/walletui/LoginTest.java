package co.cashplay.walletui;

import com.android.uiautomator.core.*;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Created by svehlak on 30.11.15.
 */
public class LoginTest extends UiAutomatorTestCase implements Helper {

    public void findChrome() throws UiObjectNotFoundException {

        getUiDevice().pressHome();
        UiObject AllAppsButton = new UiObject(new UiSelector().description("Apps"));
        AllAppsButton.clickAndWaitForNewWindow();

        UiObject AppsTab = new UiObject(new UiSelector().text("Apps"));
        AppsTab.clickAndWaitForNewWindow();

        UiScrollable AppsView = new UiScrollable(new UiSelector().scrollable(true));
        AppsView.setAsHorizontalList();

        UiObject ChromeApp = AppsView.getChildByText(new UiSelector()
                .className("android.widget.TextView"), "Chrome");
        ChromeApp.clickAndWaitForNewWindow();

    }

    public void typeAddress() throws UiObjectNotFoundException {
        UiObject AddresBarr = new UiObject(new UiSelector()
                .className("android.widget.EditText")
                .packageName(CHROME)
                .resourceId("com.android.chrome:id/url_bar"));
        AddresBarr.setText(WALLETURL);
        getUiDevice().pressEnter();

    }

    public  void loginValid() throws UiObjectNotFoundException {
        UiObject logoCashplay = new UiObject(new UiSelector()
                .className("android.view.View")
                .packageName(PKGCHROME).description("Cp logo"));
        assertTrue("Missing logo", logoCashplay.exists());

        UiObject Email = new UiObject(new UiSelector()
            .className("android.widget.EditText")
            .packageName(PKGCHROME)
            .descriptionContains("Email"));

        UiObject Password = new UiObject(new UiSelector()
                .className("android.widget.EditText")
                .packageName(PKGCHROME)
                .index(2));

        UiObject LoginButton = new UiObject(new UiSelector()
                .className("android.widget.Button")
                .packageName(PKGCHROME)
                .description("SIGN IN"));

        Email.setText(EMAIL);
        getUiDevice().pressDPadDown();
        Password.setText(PWD);
        LoginButton.clickAndWaitForNewWindow();
    }

    public void testA() throws UiObjectNotFoundException {
        findChrome();
        typeAddress();
        loginValid();

    }
}
