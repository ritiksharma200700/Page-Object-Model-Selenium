package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyLoginSalesforcee {

	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome","https://demo.opencart.com/index.php?route=account/login");
		LoginPage loginSalesforce = PageFactory.initElements(driver, LoginPage.class);
		loginSalesforce.LoginSalesforce("Admin","admin123");

	}

}
