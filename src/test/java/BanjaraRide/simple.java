package BanjaraRide;

import org.testng.annotations.AfterTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class simple extends Ride {
	AndroidDriver<AndroidElement> driver;
	@AfterTest
	public void tearDown() {
		
		service.stop();
	}

}
