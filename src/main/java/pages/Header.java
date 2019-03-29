package pages;

import models.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public abstract class Header extends BasePage {

    private WebDriver webDriver;

    public Header(Browser browser){
        super(browser);
        this.webDriver=browser.getWebDriver();
    }

    public final String SEARCH_FIELD=".//div[@class='header-content desktop-header']//input";
    public final String SELECTED_CITY=".//ul[@class='header-navigation']/li/div/span";
    public final String NOTIFICATION_SELECTED_CITY=".//div[contains(@class,'notification-visible')]/div";
    public final String BUTTON=".//ul[@class='react-autosuggest__suggestions-list']//*[.='$KeyWord']";
    public final String SHOW_ALL_SEARCH_RESULTS_BUTTON=".//div[@class='search-auto-item show-all']/span";
    public final String GLOBAL_SEARCH_BUTTON="div.grid.bottom-tier button.btn-search";
    public final String GLOBAL_SEARCH_BUTTON_AUTOSUGGEST_FIELD="//div[@class='search-input-container ']//button[@class='btn-search']";

    public void clickOnShowAllButton() throws InterruptedException {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(SHOW_ALL_SEARCH_RESULTS_BUTTON)),TimeUnit.MILLISECONDS,5000);
        findBy(SHOW_ALL_SEARCH_RESULTS_BUTTON).click();

    }

    public void clickOnGlobalSearchButton() {
        findBy(GLOBAL_SEARCH_BUTTON).click();
    }

    public void clickOnGlobalSearchButtonOfAutosuggestField()  {
        clickOnByXpathJS(GLOBAL_SEARCH_BUTTON_AUTOSUGGEST_FIELD);
    }
}
