package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Excelutils;
import pagepkg.Login;


public class TestSauce {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
    public void test() throws Exception {
        Login sg = new Login(driver);
        String exl = "\"C:\\Users\\Abhirami K R\\Desktop\\Sauce.xlsx\"";
        String Sheet1 = "Sheet1";
        int rowCount = Excelutils.getRowCount(exl, Sheet1);
        for (int i = 1; i <= rowCount; i++) {
            String Username = Excelutils.getCellValue(exl, Sheet1, i, 0);
            System.out.println("Username-------" + Username);

            String Password = Excelutils.getCellValue(exl, Sheet1, i, 1);
            System.out.println("Password-------" + Password);

            sg.setValues(Username, Password);
            sg.clickLoginButton();
            driver.navigate().refresh();
            Thread.sleep(1000);
        }

        sg.setValues("standard_user", "secret_sauce");
        sg.clickLoginButton();
        Thread.sleep(3000);

        sg.addingToCart();
        sg.clickCart();
        sg.clickCheckout();
        sg.setValues2("abhirami", "kaippil", "686522");
        sg.clickContinue();
        sg.clickCancel();
        sg.clickHamburger();
        sg.clickLogout();
    }
}