package org.example;

import io.qameta.allure.Description;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainTest {
    public static MainPage mainPage;
    public static WebDriver driver;

    public static String sumPlaceholder = "Сумма";
    public static String emailPlaceholder = "E-mail для отправки чека";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainpage"));
        mainPage.clickCookieAgreeBtn();
    }

    @Test
    @Description("Проверка полей \"Услуги связи\"")
    public void communicationServicesFieldsTest() {
        Assertions.assertAll(
                () -> Assert.assertEquals("Номер телефона", mainPage.getConnectionPhonePlaceholder()),
                () -> Assert.assertEquals(sumPlaceholder, mainPage.getConnectionSumPlaceholder()),
                () -> Assert.assertEquals(emailPlaceholder, mainPage.getConnectionEmailPlaceholder())
        );
    }

    @Test
    @Description("Проверка полей \"Домашний интеренет\"")
    public void homeInternetFieldsTest() {
        Assertions.assertAll(
                () -> Assert.assertEquals("Номер абонента", mainPage.getInternetPhonePlaceholder()),
                () -> Assert.assertEquals(sumPlaceholder, mainPage.getInternetSumPlaceholder()),
                () -> Assert.assertEquals(emailPlaceholder, mainPage.getInternetEmailPlaceholder())
        );
    }

    @Test
    @Description("Проверка полей \"Рассрочка\"")
    public void installmentFieldsTest() {
        Assertions.assertAll(
                () -> Assert.assertEquals("Номер счета на 44", mainPage.getInstallmentScorePlaceholder()),
                () -> Assert.assertEquals(sumPlaceholder, mainPage.getInstallmentSumPlaceholder()),
                () -> Assert.assertEquals(emailPlaceholder, mainPage.getInstallmentEmailPlaceholder())
        );
    }

    @Test
    @Description("Проверка полей \"Задолженность\"")
    public void arrearsFieldsTest() {
        Assertions.assertAll(
                () -> Assert.assertEquals("Номер счета на 2073", mainPage.getArrearsScorePlaceholder()),
                () -> Assert.assertEquals(sumPlaceholder, mainPage.getArrearsSumPlaceholder()),
                () -> Assert.assertEquals(emailPlaceholder, mainPage.getArrearsEmailPlaceholder())
        );
    }

    @Test
    @Description("Проверка полей \"Продолжение оплаты\"")
    public void continueReplenishmentFieldsTest() {
        String expectedText = "Оплата: Услуги связи Номер:375" + ConfProperties.getProperty("phonenumber");
        String expectedSum = ConfProperties.getProperty("depositsum") + ".00 BYN";
        String expectedButtonText = "Оплатить " + expectedSum;

        mainPage.inputPhoneNumber(ConfProperties.getProperty("phonenumber"));
        mainPage.inputDepositSum(ConfProperties.getProperty("depositsum"));
        mainPage.clickContinueBtn();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@type, 'submit')]")));
        Assert.assertEquals(expectedSum, mainPage.getPayDescriptionCost());
        Assert.assertEquals(expectedText, mainPage.getPayDescriptionText());
        Assert.assertEquals(expectedButtonText, mainPage.getSubmitBtnText());

        Assert.assertEquals("Номер карты", mainPage.getCardFieldPlaceholder());
        Assert.assertEquals("Срок действия", mainPage.getValidityPeriodPlaceholder());
        Assert.assertEquals("CVC", mainPage.getCvcFieldPlaceholder());
        Assert.assertEquals("Имя держателя (как на карте)", mainPage.getHolderNameFieldPlaceholder());

        Assert.assertTrue(mainPage.visaLogoIsDisplayed());
        Assert.assertTrue(mainPage.mastercardLogoIsDisplayed());
        Assert.assertTrue(mainPage.belkartLogoIsDisplayed());
        Assert.assertTrue(mainPage.maestroLogoIsDisplayed());
        Assert.assertTrue(mainPage.mirLogoIsDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
