package pages;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage {
	
WebDriver driver;
	
	@FindBy(xpath = "//span[@class='anch myacc_2']")
	public WebElement myAccount;
	
	@FindBy(xpath = "(//a[text()='My Profile'])[1]")
	public WebElement myProfile;
	
	@FindBy(xpath = "//*[@id='profile1']/div/div[3]/div[1]/div/span")
	public WebElement profileEmail;
	
	@FindBy(xpath = "(//a[@title='Casual Shoes'])[1]")
	public static WebElement CasualShoes;

	@FindBy(xpath = "(//div[@class='list_img wifi'])[1]")
	public static WebElement ProductLink;

	@FindBy(xpath = "(//span[@class='size-option pos-rel2stat R14_42'])[1]")
	public static WebElement SelectSize;

	@FindBy(xpath = "(//span[@class='M16_white'])[4]")
	public static WebElement AddToCartBTN;
	
	@FindBy(xpath = "(//li[@class='M14_42 categry'])[3]/child::a")
	public static WebElement footwear;
	
	@FindBy(xpath = "(//span[@class='step2 M16_white'])[1]/child::span")
	public static WebElement cartItemCount;
	
	@FindBy(xpath="//span[@class='bucket']")
	static WebElement GoToCartBTN;
	
	@FindBy(xpath="//img[@class='cart-card-img']")
	static WebElement clickonimage;

	public LoggedInPage(WebDriver driver) {
	    super();
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public void goToProfile() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(myAccount);
		Thread.sleep(2000);
		action.moveToElement(myProfile);
		action.click().build().perform();
	}
	
	public void goToFootwear() {
		Actions action =  new Actions(driver);
		action.moveToElement(footwear).build().perform();
	}
	
	public void goToProductPage() throws InterruptedException {
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(1000);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getProfileEmail() {
		return profileEmail.getText();
	}

	public void clickshoes() {
		CasualShoes.click();
	}

	public void clickproduct() {
		ProductLink.click();
	}

	public void selectshoesize() {
		SelectSize.click();
	}

	public void addtocart() {
		AddToCartBTN.click();
	}
	
	public void GoTocart()
	{
		GoToCartBTN.click();
	}
	
	public void clickonimage()
	{
		clickonimage.click();
	}
	

}
