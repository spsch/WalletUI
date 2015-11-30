package co.cashplay.walletui;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Created by svehlak on 30.11.15.
 */
public class DepositTest extends UiAutomatorTestCase implements Helper {

    MainPageItems MainItems = new MainPageItems();
    DepositItems DepoItems = new DepositItems();

    public void checkLogin() throws UiObjectNotFoundException {

        UiObject Krizek = new UiObject(new UiSelector()
                .className("android.widget.ImageButton")
                .packageName(PKGCHROME)
                .resourceId("com.android.chrome:id/infobar_close_button"));
        Krizek.clickAndWaitForNewWindow();

        MainItems.ToggleButton().clickAndWaitForNewWindow();

        UiObject Logout = new UiObject(new UiSelector()
                .className("android.view.View")
                .packageName(PKGCHROME)
                .description("Ico logoutLogout"));

        UiObject Name = new UiObject(new UiSelector()
                .className("android.view.View")
                .packageName(PKGCHROME)
                .description("Ico userJan Svehlak"));

        String MyName = Name.getContentDescription();

        System.out.println("*-*-*-*-*-*-**-*-Logged as " + MyName);

        assertTrue("You are not logged in, Logout button did not found", Logout.exists());
        assertEquals("Login name and name does not fit", MyName, LOGINCHECK);
    }

    public void wswwq() throws UiObjectNotFoundException {
        DepoItems.MoneyTabs("$100.00").clickAndWaitForNewWindow();
        MainItems.FooterLinks("Contact");
    }

    public void testB() throws UiObjectNotFoundException {
        checkLogin();
    }

}
