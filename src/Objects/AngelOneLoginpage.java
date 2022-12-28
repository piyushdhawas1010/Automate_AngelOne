package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelOneLoginpage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='txtUserID']") WebElement Username;
	@FindBy(xpath="//input[@id='txtTradingPassword']") WebElement password;
	@FindBy(xpath="//a[@id='loginBtn']") WebElement loginbtn;
	
	public AngelOneLoginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  void login(String username,String passsword) {
		Username.sendKeys("piyushdhawas10@gmail.com");
		password.sendKeys("Ald");
		loginbtn.click();
	}

}
