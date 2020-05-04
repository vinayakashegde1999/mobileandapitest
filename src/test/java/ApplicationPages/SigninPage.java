package ApplicationPages;

import ConstantVariables.Constant;
import helper.helper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webconnector.WebConnector;

public class SigninPage {
    WebConnector wc = new WebConnector();
    helper hp = new helper();
    AndroidDriver driver= (AndroidDriver) wc.getDriver();
    WebDriverWait wait = new WebDriverWait(wc.getDriver(), 10);


    public void enterWrongCredentails() throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id(Constant.email))).sendKeys("vinayakashegde@gmail.com");
        driver.findElement(MobileBy.id(Constant.password)).sendKeys("1990@vsVSss");
        driver.findElement(MobileBy.id(Constant.signinButton)).click();
    }

    public void clickRemainder() {
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id(Constant.reminders_permissions_allow))).click();
    }

    public void validCredentials() {
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id(Constant.email))).sendKeys("vinayakashegde@gmail.com");
        driver.findElement(MobileBy.id(Constant.password)).sendKeys("1990@vsVS");
        driver.findElement(MobileBy.id(Constant.signinButton)).click();

    }

    public void verifyOTPScreen() {
        readOTP();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id(Constant.inputPIN)));
    }

    public void enterOTP() {
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id(Constant.inputPIN))).sendKeys(readOTP());
        driver.findElement(MobileBy.id(Constant.button_confirm)).click();


    }

    public void verifyUserSignedIn() {
    }

    public  String readOTP()
    { driver.openNotifications();
        String otp = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(Constant.smsScreen))).getText().split(" ")[0];
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return otp;
    }

}
