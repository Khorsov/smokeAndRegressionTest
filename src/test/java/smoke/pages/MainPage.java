package smoke.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import smoke.utilities.Driver;


public class MainPage {


    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(className = "MV3Tnb")
    public WebElement storeBtn;
}
