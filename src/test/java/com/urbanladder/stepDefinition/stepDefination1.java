package com.urbanladder.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import com.urbanladder.pageobject.BedroomPage;
import com.urbanladder.pageobject.DiningPage;
import com.urbanladder.pageobject.Header;
import com.urbanladder.pageobject.LivingPage;
import com.urbanladder.pageobject.SalePage;
import com.urbanladder.pageobject.SearchPage;
import com.urbanladder.pageobject.StoragePage;
import com.urbanladder.pageobject.StudyPage;
import com.urbanladder.reusablecomponent.ReusableComponents;
import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.runner.runner;
import com.urbanladder.utility.dataDriven;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;
@RunWith(Cucumber.class)
public class stepDefination1 extends abstractpagestepDefination {
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	private Header h;
	private SearchPage s;
	private SalePage sa;
	private LivingPage li;
	private BedroomPage bp;
	private DiningPage dp;
	private StoragePage sp;
	private StudyPage st;
	WebDriver driver=getDriver();
	
	public stepDefination1() throws IOException {
		super();
		dd = new dataDriven();
		h = new Header(driver);
		s = new SearchPage(driver);
		sa = new SalePage(driver);
		li = new LivingPage(driver);
		bp = new BedroomPage(driver);
		dp = new DiningPage(driver);
		sp = new StoragePage(driver);
		st = new StudyPage(driver);
		
	}

    @Given("^User is on \"([^\"]*)\"$")
    public void user_is_on_something(String strArg1) throws Throwable {
		driver.manage().window().maximize();
		driver.get(strArg1);
    }

    @When("^User hover on login and click on login$")
    public void user_hover_on_login_and_click_on_login() throws Throwable {
		Actions a = new Actions(driver);
		WebElement move=h.loginstep1();//drop down without clicking
		a.moveToElement(move).build().perform(); //context click means right click
		h.login().click();
		System.out.println("hovered --------------------------------------------");
		System.out.println("clicked-------------------------------");
    }

    @Then("^Login page popup is populated$")
    public void login_page_popup_is_populated() throws Throwable {
        Thread.sleep(10000);
        System.out.println("waited");

    }

    @And("^User enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
		h.entermail().sendKeys(strArg1);
		h.enterpassword().sendKeys(strArg2);
    }

    @And("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
		h.loginbutton().click();
		System.out.println("logged in");
		log.info("logged in rithik");

    }


}
