package io.appium.java_client.pagefactory_tests.widgets.ios.simple;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;
import io.appium.java_client.pagefactory_tests.widgets.Review;
import org.openqa.selenium.WebElement;

//className = UIAWindow
public class IOSReview extends Review{

    @iOSFindBy(className = "UIANavigationBar")
    private IOSElement navigationBar;

    @iOSFindBys({@iOSFindBy(className = "UIAScrollView"),
    @iOSFindBy(className = "UIAStaticText")})
    private IOSElement synopsis;

    @iOSFindBy(className = "UIAImage")
    private IOSElement poster;


    protected IOSReview(WebElement element) {
        super(element);
    }

    @Override
    public String title() {
        return navigationBar.getText();
    }

    @Override
    public String score() {
        return "100";
    }

    @Override
    public String info() {
        return synopsis.getText();
    }

    @Override
    public Object getPoster() {
        return poster.getSize();
    }
}
