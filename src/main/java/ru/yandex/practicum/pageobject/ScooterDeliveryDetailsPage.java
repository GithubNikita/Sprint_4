package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterDeliveryDetailsPage {

    private WebDriver driver;

    public ScooterDeliveryDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Заголовок "Про аренду"
    private By orderScooterFormHeading = By.xpath(".//div[starts-with(@class, 'Order_Header')][contains(text(), 'Про аренду')]");

    // Поле "Когда привезти самокат"
    private By deliveryDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Выпадающий список "Срок аренды"
    private By rentalPeriodList = By.xpath(".//span[@class='Dropdown-arrow']");
    // Элемент выпадающего списка "Срок аренды" со значением в одни сутки
    private By rentalPeriodOneDay = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'сутки')]");
    // Элемент выпадающего списка "Срок аренды" со значением в двое суток
    private By rentalPeriodTwoDays = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'двое суток')]");
    // Элемент выпадающего списка "Срок аренды" со значением в трое суток
    private By rentalPeriodThreeDays = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'трое суток')]");
    // Элемент выпадающего списка "Срок аренды" со значением в четверо суток
    private By rentalPeriodFourDays = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'четверо суток')]");
    // Элемент выпадающего списка "Срок аренды" со значением в пятеро суток
    private By rentalPeriodFiveDays = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'пятеро суток')]");
    // Элемент выпадающего списка "Срок аренды" со значением в шестеро суток
    private By rentalPeriodSixDays = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'шестеро суток')]");
    // Элемент выпадающего списка "Срок аренды" со значением в семеро суток
    private By rentalPeriodSevenDays = By.xpath(".//div[@class='Dropdown-option'][contains(text(), 'семеро суток')]");

    // Описание для чекбокса с черным цветом
    private By colorBlackCheckboxDescription = By.xpath(".//label[@for='black']");
    // Описание для чекбокса с черным цветом
    private By colorGreyCheckboxDescription = By.xpath(".//label[@for='grey']");

    // Чекбокс "Цвет самоката" со значением черный жемчуг
    private By colorBlackCheckbox = By.id("black");
    // Чекбокс "Цвет самоката" со значением серая безысходность
    private By colorGreyCheckbox = By.id("grey");
    // Поле "Комментарий для курьера"
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка "Заказать"
    private By orderButton = By.xpath(".//div[starts-with(@class, 'Order_Buttons')]//button[contains(text(), 'Заказать')]");


    // Метод ожидает загрузки формы "Про аренду"
    public void waitForLoadScooterDeliveryDetailsForm() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(orderScooterFormHeading));
    }

    // Метод для нажатия на кнопку "Заказать"
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    // Метод для заполнения поля "Когда привезти самокат"
    public void setDeliveryDate(String date) {
        driver.findElement(deliveryDateField).sendKeys(date);
    }

    // Метод выбора значения в выпадающем списке "Срок аренды"
    public void setRentalPeriod(String rentalPeriodValue) {
        driver.findElement(rentalPeriodList).click();
        if (rentalPeriodValue.equals(driver.findElement(rentalPeriodOneDay).getText())) {
            driver.findElement(rentalPeriodOneDay).click();
        } else if (rentalPeriodValue.equals(driver.findElement(rentalPeriodTwoDays).getText())) {
            driver.findElement(rentalPeriodTwoDays).click();
        } else if (rentalPeriodValue.equals(driver.findElement(rentalPeriodThreeDays).getText())) {
            driver.findElement(rentalPeriodThreeDays).click();
        } else if (rentalPeriodValue.equals(driver.findElement(rentalPeriodFourDays).getText())) {
            driver.findElement(rentalPeriodFourDays).click();
        } else if (rentalPeriodValue.equals(driver.findElement(rentalPeriodFiveDays).getText())) {
            driver.findElement(rentalPeriodFiveDays).click();
        } else if (rentalPeriodValue.equals(driver.findElement(rentalPeriodSixDays).getText())) {
            driver.findElement(rentalPeriodSixDays).click();
        } else if (rentalPeriodValue.equals(driver.findElement(rentalPeriodSevenDays).getText())) {
            driver.findElement(rentalPeriodSevenDays).click();
        } else {
            System.out.println("Вы пытаетесь установить невозможный период");
        }
    }

    // Метод для установки значения чекбоксов в блоке "Цвет самоката"
    public void setColorCheckbox(String color) {
        if (color.equals(driver.findElement(colorBlackCheckboxDescription).getText())) {
            driver.findElement(colorBlackCheckbox).click();
        } else if (color.equals(driver.findElement(colorGreyCheckboxDescription).getText())) {
            driver.findElement(colorGreyCheckbox).click();
        } else {
            System.out.println("Вы пытаетесь установить несуществующий цвет");
        }
    }

    // Метод для заполнения поля "Комментарий для курьера"
    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    // Метод заполнения формы "Про аренду"
    public void fillScooterDeliveryDetailsForm(String date, String rentalPeriod, String color, String comment) {
        setDeliveryDate(date);
        setRentalPeriod(rentalPeriod);
        setColorCheckbox(color);
        setComment(comment);
        clickOrderButton();
    }
}
