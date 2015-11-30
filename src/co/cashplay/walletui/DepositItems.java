package co.cashplay.walletui;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Created by svehlak on 30.11.15.
 */
public class DepositItems extends UiAutomatorTestCase implements Helper {

    public UiObject DepositLogoPic() {

        UiObject DepositLogoPic = new UiObject(new UiSelector()
                .className("android.view.View")
                .packageName(PKGCHROME)
                .description("Ico deposit 2Deposit"));
        return DepositLogoPic;
    }

    public UiObject EnterAmount() {

        UiObject EnterAmount = new UiObject(new UiSelector()
                .className("android.widget.EditText")
                .packageName(PKGCHROME)
                .description("0"));
        return EnterAmount;
    }

    public UiObject Arrow() {

        UiObject Arrow = new UiObject(new UiSelector()
                .className("android.widget.Button")
                .packageName(PKGCHROME)
                .description("Ico arrow right w"));
        return Arrow;
    }

    public UiObject MoneyTabs(String descriptionDesc) {

        UiObject MoneyTabs = new UiObject(new UiSelector()
                .className("android.widget.Button")
                .packageName(PKGCHROME)
                .description(descriptionDesc));
        return MoneyTabs;
    };

    public UiObject SecuredPage() {

        UiObject SecuredPage = new UiObject(new UiSelector()
                .className("android.view.View").packageName(PKGCHROME)
                .description("Select the amount to deposit You have entered a secure pageIco lock"));
        return SecuredPage;
    }

    public UiObject SecureIcons() {

        UiObject SecuredIcons = new UiObject(new UiSelector()
                .className("android.widget.Image")
                .packageName(PKGCHROME)
                .description("Secure icon"));
        return SecuredIcons;
    }


}
