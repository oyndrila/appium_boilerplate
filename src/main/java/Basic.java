import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basic {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = AppiumUtils.createAppiumDriver("C:\\Users\\shubh\\OneDrive\\Desktop\\Appium automation\\MobileAndroidAutomation\\src\\ApiDemos-debug.apk");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //xpath //tagName[@attribute='value'] here tagName use Class value

        //android.widget.TextView[@text='Preference']
        //driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("ebrahim881");
        driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
    }
}
