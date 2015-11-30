package co.cashplay.walletui;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Created by svehlak on 30.11.15.
 */
public class MainPageItems extends UiAutomatorTestCase implements Helper {

    public UiObject ToggleButton() {

        UiObject ToggleButton = new UiObject(new UiSelector()
                .className("android.widget.Button")
                .packageName(PKGCHROME)
                .descriptionContains("Toggle"));
        return ToggleButton;
    }

    public UiObject FooterLinks(String descriptionLink) {

        UiObject FooterLinks = new UiObject(new UiSelector()
            .className("android.view.View")
            .packageName(PKGCHROME)
            .description(descriptionLink));
        return FooterLinks;
    }

}
