package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterSuccessfulOrderDetailsPage {

    private WebDriver driver;

    public ScooterSuccessfulOrderDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Заголовок диалогового окна "Заказ оформлен"
    private By scooterSuccessfulOrderDetailsFormHeading = By.xpath(".//div[starts-with(@class, 'Order_ModalHeader')][contains(text(), 'Заказ оформлен')]");
    // Кнопка "Посмотреть статус"
    private By statusViewButton = By.xpath(".//button[starts-with(@class, 'Button_Button')][contains(text(), 'Посмотреть статус')]");

    // Метод ожидает загрузки диалогового окна "Хотите оформить заказ?"
    public void waitForOrderSuccessfulHeading() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(scooterSuccessfulOrderDetailsFormHeading));
    }

    // Метод возвращающий значение для текста заголовка диалогового окна "Заказ оформлен"
    public String OrderSuccessfulHeadingFormGetText() {
        return driver.findElement(scooterSuccessfulOrderDetailsFormHeading).getText();
    }

    // Метод нажатия на кнопку "Просмотреть статус" для подтверждения заказа самоката
    public void clickStatusViewButton() {
        driver.findElement(statusViewButton).click();
    }
}
