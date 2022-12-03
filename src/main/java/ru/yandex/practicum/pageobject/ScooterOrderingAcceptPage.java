package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterOrderingAcceptPage {
    private WebDriver driver;

    public ScooterOrderingAcceptPage(WebDriver driver) {
        this.driver = driver;
    }

    // Заголовок диалогового окна "Хотите оформить заказ?"
    private By scooterOrderingAcceptFormHeading = By.xpath(".//div[starts-with(@class, 'Order_ModalHeader')]");
    // Кнопка "Да" для подтверждения заказа самоката
    private By acceptButton = By.xpath(".//button[starts-with(@class, 'Button_Button')][contains(text(), 'Да')]");

    // Метод ожидает загрузки диалогового окна "Хотите оформить заказ?"
    public void waitForOrderAcceptDialogForm() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(scooterOrderingAcceptFormHeading));
    }

    // Метод нажатия на кнопку "Да" для подтверждения заказа самоката
    public void clickAcceptButton() {
        driver.findElement(acceptButton).click();
    }
}
