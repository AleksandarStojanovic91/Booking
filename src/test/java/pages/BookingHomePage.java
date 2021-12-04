package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingHomePage extends BasePage{
    WebDriver driver;
    WebDriverWait wait;

    public BookingHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-modal-id='language-selection']")
    WebElement languageIcon;

    String languageLinkXpath = "//div[@class='bui-group bui-group--large']/div[2]//div[contains(text(),'$')]/../..";

    public void selectLanguage(String language){
        click(languageIcon);
        click(driver.findElement(By.xpath(languageLinkXpath.replace("$", language))));
    }


}
