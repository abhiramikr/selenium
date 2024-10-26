package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
		WebDriver driver;
		@FindBy(xpath="//*[@id=\"user-name\"]")
		WebElement username;
		@FindBy(xpath="//*[@id=\"password\"]")
		WebElement password;
		@FindBy(xpath="//*[@id=\"login-button\"]")
		WebElement loginclick;

		@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
		WebElement c1;
		@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")
		WebElement c2;
		@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button")
		WebElement c3;
		@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[4]/div[3]/button")
		WebElement c4;
		@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[5]/div[3]/button")
		WebElement c5;
		@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[6]/div[3]/button")
		WebElement c6;

		@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
		WebElement clickcart;

		@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/a[2]")
		WebElement clickcheckout;

		@FindBy(xpath="//*[@id=\"first-name\"]")
		WebElement firstname;

		@FindBy(xpath="//*[@id=\"last-name\"]  ")
		WebElement lastname;

		@FindBy(xpath="//*[@id=\"postal-code\"]")
		WebElement zipcode;

		@FindBy(xpath="/html/body/div/div[2]/div[3]/div/form/div[2]/input")
		WebElement processcontinue;
		
		@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")
		WebElement cancel;
		
		@FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
		WebElement hamburger;
		@FindBy(xpath="/html/body/div/div[1]/div/div[2]/div[1]/nav/a[3]")
		WebElement logout;

		public Login(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void setValues(String Username,String Password)
		{
			username.sendKeys(Username);
			password.sendKeys(Password);
			
			
		}
		public void clickLoginButton()
		{
			loginclick.click();
		}
		

		public void addingToCart()
		{
			
			c1.click();
			c2.click();
			c3.click();
			c4.click();
			c5.click();
			c6.click();
		}
		public void clickCart()
		{
			clickcart.click();
		}
		public void clickCheckout()
		{
			
			clickcheckout.click();
		}
		public void setValues2(String FirstName,String LastName,String ZipCode)
		{
			firstname.sendKeys(FirstName);
			lastname.sendKeys(LastName);
			zipcode.sendKeys(ZipCode);
		}

		public void clickContinue()
		{
			processcontinue.click();
		}
		public void clickCancel()
		{
			
			cancel.click();
		}

		public void clickHamburger()
		{
			
			hamburger.click();
		}
		public void clickLogout()
		{
			logout.click();
		}
		
	}