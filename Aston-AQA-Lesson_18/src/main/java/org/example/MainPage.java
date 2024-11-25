package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath =  "//*[contains(@id, 'cookie-agree')]")
    private WebElement cookieAgreeButton;
    @FindBy(xpath =  "//*[contains(@id, 'connection-phone')]")
    private WebElement connectionPhone;
    @FindBy(xpath =  "//*[contains(@id, 'connection-sum')]")
    private WebElement connectionSum;
    @FindBy(xpath =  "//*[contains(@id, 'connection-email')]")
    private WebElement connectionEmail;
    @FindBy(xpath =  "//*[contains(@id, 'internet-phone')]")
    private WebElement internetPhone;
    @FindBy(xpath =  "//*[contains(@id, 'internet-sum')]")
    private WebElement internetSum;
    @FindBy(xpath =  "//*[contains(@id, 'internet-email')]")
    private WebElement internetEmail;
    @FindBy(xpath =  "//*[contains(@id, 'score-instalment')]")
    private WebElement installmentScore;
    @FindBy(xpath =  "//*[contains(@id, 'instalment-sum')]")
    private WebElement installmentSum;
    @FindBy(xpath =  "//*[contains(@id, 'instalment-email')]")
    private WebElement installmentEmail;
    @FindBy(xpath =  "//*[contains(@id, 'score-arrears')]")
    private WebElement arrearsScore;
    @FindBy(xpath =  "//*[contains(@id, 'arrears-sum')]")
    private WebElement arrearsSum;
    @FindBy(xpath =  "//*[contains(@id, 'arrears-email')]")
    private WebElement arrearsEmail;
    @FindBy(xpath =  "//*[contains(@placeholder, 'Номер телефона')]")
    private WebElement phoneNumberField;
    @FindBy(xpath =  "//*[contains(@placeholder, 'Сумма')]")
    private WebElement depositField;
    @FindBy(xpath =  "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;
    @FindBy(xpath =  "//*[contains(@class, 'bepaid-app')]")
    private WebElement paymentWindow;
    @FindBy(xpath = "//*[contains(@class, 'pay-description__cost')]")
    private WebElement payDescriptionCost;
    @FindBy(xpath = "//*[contains(@type, 'submit')]")
    private WebElement submitButton;
    @FindBy(xpath = "//*[contains(@class, 'pay-description__text')]")
    private WebElement payDescriptionText;
    @FindBy(xpath = "//*[contains(@class, 'content ng-tns-c46-1')]")
    private WebElement cardField;
    @FindBy(xpath = "//*[contains(@class, 'content ng-tns-c46-4')]")
    private WebElement validityPeriodField;
    @FindBy(xpath = "//*[contains(@class, 'content ng-tns-c46-5')]")
    private WebElement cvcField;
    @FindBy(xpath = "//*[contains(@class, 'content ng-tns-c46-3')]")
    private WebElement holderNameField;
    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/visa-system.svg')]")
    private WebElement visaLogo;
    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/mastercard-system.svg')]")
    private WebElement mastercardLogo;
    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/belkart-system.svg')]")
    private WebElement belkartLogo;
    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/maestro-system.svg')]")
    private WebElement maestroLogo;
    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/mir-system-ru.svg')]")
    private WebElement mirLogo;
    @FindBy(xpath =  "//div[contains(@class, 'header__close-button')]")
    private WebElement closePaymentWindowButton;

    public void clickCookieAgreeBtn() {
        cookieAgreeButton.click();
    }

    public String getConnectionPhonePlaceholder() {
        return connectionPhone.getAttribute("placeholder");
    }
    public String getConnectionSumPlaceholder() {
        return connectionSum.getAttribute("placeholder");
    }

    public String getConnectionEmailPlaceholder() {
        return connectionEmail.getAttribute("placeholder");
    }

    public String getInternetPhonePlaceholder() {
        return internetPhone.getAttribute("placeholder");
    }

    public String getInternetSumPlaceholder() {
        return internetSum.getAttribute("placeholder");
    }

    public String getInternetEmailPlaceholder() {
        return internetEmail.getAttribute("placeholder");
    }

    public String getInstallmentScorePlaceholder() {
        return installmentScore.getAttribute("placeholder");
    }

    public String getInstallmentSumPlaceholder() {
        return installmentSum.getAttribute("placeholder");
    }

    public String getInstallmentEmailPlaceholder() {
        return installmentEmail.getAttribute("placeholder");
    }

    public String getArrearsScorePlaceholder() {
        return arrearsScore.getAttribute("placeholder");
    }

    public String getArrearsSumPlaceholder() {
        return arrearsSum.getAttribute("placeholder");
    }

    public String getArrearsEmailPlaceholder() {
        return arrearsEmail.getAttribute("placeholder");
    }

    public void inputPhoneNumber(String number) {
        phoneNumberField.sendKeys(number);
    }

    public void inputDepositSum(String sum) {
        depositField.sendKeys(sum);
    }

    public void clickContinueBtn() {
        continueButton.click();
    }

    public String getPayDescriptionCost() {
        return payDescriptionCost.getText();
    }

    public String getPayDescriptionText() {
        return payDescriptionText.getText();
    }

    public void clickClosePaymentWindowBtn() {
        closePaymentWindowButton.click();
    }

    public String getSubmitBtnText() {
        return submitButton.getText();
    }

    public String getCardFieldPlaceholder() {
        return cardField.getText();
    }

    public String getValidityPeriodPlaceholder() {
        return validityPeriodField.getText();
    }

    public String getCvcFieldPlaceholder() {
        return cvcField.getText();
    }

    public String getHolderNameFieldPlaceholder() {
        return holderNameField.getText();
    }

    public boolean visaLogoIsDisplayed() {
        return visaLogo.isDisplayed();
    }

    public boolean mastercardLogoIsDisplayed() {
        return mastercardLogo.isDisplayed();
    }

    public boolean belkartLogoIsDisplayed() {
        return belkartLogo.isDisplayed();
    }

    public boolean maestroLogoIsDisplayed() {
        return maestroLogo.isDisplayed();
    }

    public boolean mirLogoIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//*[contains(@src, 'assets/images/payment-icons/card-types/mir-system-ru.svg')]")));
        return mirLogo.isDisplayed();
    }
}
