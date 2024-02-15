package BanjaraRide;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Ride1 extends Ride {
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void bt() throws IOException, InterruptedException {
		service = startServer();
		driver = capabilities(deviceName, platformName, AppPackage, AppActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void ts() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		driver.findElement(By.id("android:id/button1")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text(\"BOOK NOW\")")).get(0).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className("android.view.ViewGroup")).click();
		driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text(\"BOOK NOW\")")).get(0).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Hire Bike\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		AndroidElement dropDown = driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"CB SHINE BS 6\"))");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dropDown.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		driver.findElement(MobileBy.AndroidUIAutomator("UiSelectore().text(\"30 days 0 hr\")")).click();
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("android.widget.ImageView")).click();

		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"7 days 0 hr\"]/android.widget.TextView"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 
		Thread.sleep(1000);

		driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AccessibilityId("19 February 2024")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("android:id/button1")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));


//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bookings']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		driver.findElements(By.className("android.view.ViewGroup")).get(0).click();
		driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElements(By.className("android.widget.EditText")).get(0).sendKeys("Activa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		driver.findElement(By.xpath("//android.widget.ImageView[1]")).click();

		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Call Us\")")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		 
	}

}
