package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterRenterDetailsPage {

    private WebDriver driver;

    public ScooterRenterDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Заголовок "Для кого самокат"
    private By orderScooterFormHeading = By.xpath(".//div[starts-with(@class, 'Order_Header')][contains(text(), 'Для кого самокат')]");

    // Поле "Имя"
    private By firstNameField = By.xpath("//input[@placeholder='* Имя']");
    // Поле "Фамилия"
    private By lastNameField = By.xpath("//input[@placeholder='* Фамилия']");
    // Поле "Адрес: куда привезти заказ"
    private By addressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    // Комбобокс "станция метро"
    private By metroStationField = By.xpath(".//input[@class='select-search__input']");
    // Список значений комбобокса "станция метро"
    private By metroStationListValue = By.xpath("//div[@class='select-search__select']");
    // Поле "Телефон на него позвонит курьер"
    private By phoneField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    private By furtherButton = By.xpath(".//button[starts-with(@class, 'Button_Button')][contains(text(), 'Далее')]");


    // Метод ожидает загрузки формы "Для кого самокат"
    public void waitForLoadOrderScooterForm() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(orderScooterFormHeading));
    }

    // Метод для заполнения поля "Имя"
    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    // Метод для заполнения поля "Фамилия"
    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    // Метод для заполнения поля "Адрес: куда привезти заказ"
    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    // Метод для заполнения поля "Станция метро"
    public void setMetroStation(String metroStation) {
        driver.findElement(metroStationField).sendKeys(metroStation);
        driver.findElement(metroStationListValue).click();
    }

    // Метод для заполнения поля "Телефон: на него позвонит курьер"
    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    // Метод для нажатия на кнопку "Далее"
    public void clickFurtherButton() {
        driver.findElement(furtherButton).click();
    }

    // Метод заполнения формы "Для кого самокат"
    public void fillScooterRenterDetailsForm(String firstName, String lastName, String address, String metroStation, String phone){
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setMetroStation(metroStation);
        setPhone(phone);
        clickFurtherButton();
    }

}
