import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.yandex.practicum.model.constants.SuccessfulOrderDetailsFormData;
import ru.yandex.practicum.pageobject.*;

import static org.hamcrest.CoreMatchers.*;

@RunWith(Parameterized.class)
public class OrderingScooterTests {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String phone;
    private final String date;
    private final String rentalPeriod;
    private final String color;
    private final String comment;

    public OrderingScooterTests(String firstName, String lastName, String address, String metroStation, String phone, String date, String rentalPeriod,String color, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;
        this.date = date;
        this.rentalPeriod = rentalPeriod;
        this.color = color;
        this.comment = comment;
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                { "Тест", "Тестович", "улица Веселая 1", "Чистые пруды","12345678910", "02.12.2022", "сутки", "чёрный жемчуг", "Прокачусь с ветерком сутки"},
                { "Тестович", "Тест", "переулок Пёстрый 101", "Бульвар Рокоссовского","10987654321", "07.01.2023", "двое суток", "серая безысходность", "Покатаюсь с ветерком 2-ое суток"},
                { "Тест", "Тестович", "проспект Приличный 3-1", "Черкизовская","11111111111", "01.01.2000", "трое суток", "серая безысходность", "Покатаюсь с ветерком 3-ое суток"},
        };
    }

    private WebDriver driver;

    // Заказ самоката при помощи кнопки "Заказать" в заголовке формы
    @Test
    public void ScooterOrderingByOrderButtonHeaderClick() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Создание объекта класса страницы c указанием деталей об арендаторе, заказывающем самокат
        ScooterRenterDetailsPage objScooterRenterDetailsPage = new ScooterRenterDetailsPage(driver);
        // Создание объекта класса страницы c указанием деталей о доставке самоката
        ScooterDeliveryDetailsPage objScooterDeliveryDetailsPage = new ScooterDeliveryDetailsPage(driver);
        // Создание объекта класса страницы c диалоговым окном подтверждения заказа самоката
        ScooterOrderingAcceptPage objScooterOrderingAcceptPage = new ScooterOrderingAcceptPage(driver);
        // Создание объекта класса страницы c диалоговым окном с информацией об успешном заказе самоката
        ScooterSuccessfulOrderDetailsPage objScooterSuccessfulOrderDetailsPage = new ScooterSuccessfulOrderDetailsPage(driver);
        // Жмём кнопку "Заказать" в заголовке формы
        objHomePage.orderButtonHeaderClick();
        // Ожидаем загрузки формы "Для кого самокат"
        objScooterRenterDetailsPage.waitForLoadOrderScooterForm();
        // Заполняем форму "Для кого самокат"
        objScooterRenterDetailsPage.fillScooterRenterDetailsForm(firstName, lastName, address, metroStation, phone);
        // Ожидаем загрузки формы "Про аренду"
        objScooterDeliveryDetailsPage.waitForLoadScooterDeliveryDetailsForm();
        // Заполняем форму "Про аренду"
        objScooterDeliveryDetailsPage.fillScooterDeliveryDetailsForm(date, rentalPeriod, color, comment);
        // Ожидаем загрузки диалогового окна "Хотите оформить заказ?"
        objScooterOrderingAcceptPage.waitForOrderAcceptDialogForm();
        // Наживаем на кнопку "Да"
        objScooterOrderingAcceptPage.clickAcceptButton();
        // Ожидаем загрузки диалогового окна "Заказ оформлен"
        objScooterSuccessfulOrderDetailsPage.waitForOrderSuccessfulHeading();
        // Проверка наличия заголовка "Заказ оформлен" в тексте диалогового окна "Заказ оформлен"
        Assert.assertThat(objScooterSuccessfulOrderDetailsPage.OrderSuccessfulHeadingFormGetText(), startsWith(SuccessfulOrderDetailsFormData.ORDER_SUCCESSFUL_FORM_HEADING));
    }

    // Заказ самоката при помощи кнопки "Заказать" в центре главной страницы
    @Test
    public void ScooterOrderingByOrderButtonMiddleClick() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Создание объекта класса страницы c указанием деталей об арендаторе, заказывающем самокат
        ScooterRenterDetailsPage objScooterRenterDetailsPage = new ScooterRenterDetailsPage(driver);
        // Создание объекта класса страницы c указанием деталей о доставке самоката
        ScooterDeliveryDetailsPage objScooterDeliveryDetailsPage = new ScooterDeliveryDetailsPage(driver);
        // Создание объекта класса страницы c диалоговым окном подтверждения заказа самоката
        ScooterOrderingAcceptPage objScooterOrderingAcceptPage = new ScooterOrderingAcceptPage(driver);
        // Создание объекта класса страницы c диалоговым окном с информацией об успешном заказе самоката
        ScooterSuccessfulOrderDetailsPage objScooterSuccessfulOrderDetailsPage = new ScooterSuccessfulOrderDetailsPage(driver);
        // Прокручиваем страницу до кнопки "Заказать" в середине страницы
        objHomePage.scrollToOrderMiddleButton();
        // Жмём кнопку "Заказать" в заголовке формы
        objHomePage.orderButtonMiddleClick();
        // Ожидаем загрузки формы "Для кого самокат"
        objScooterRenterDetailsPage.waitForLoadOrderScooterForm();
        // Заполняем форму "Для кого самокат"
        objScooterRenterDetailsPage.fillScooterRenterDetailsForm(firstName, lastName, address, metroStation, phone);
        // Ожидаем загрузки формы "Про аренду"
        objScooterDeliveryDetailsPage.waitForLoadScooterDeliveryDetailsForm();
        // Заполняем форму "Про аренду"
        objScooterDeliveryDetailsPage.fillScooterDeliveryDetailsForm(date, rentalPeriod, color, comment);
        // Ожидаем загрузки диалогового окна "Хотите оформить заказ?"
        objScooterOrderingAcceptPage.waitForOrderAcceptDialogForm();
        // Наживаем на кнопку "Да"
        objScooterOrderingAcceptPage.clickAcceptButton();
        // Ожидаем загрузки диалогового окна "Заказ оформлен"
        objScooterSuccessfulOrderDetailsPage.waitForOrderSuccessfulHeading();
        // Проверка наличия заголовка "Заказ оформлен" в тексте диалогового окна "Заказ оформлен"
        Assert.assertThat(objScooterSuccessfulOrderDetailsPage.OrderSuccessfulHeadingFormGetText(), startsWith(SuccessfulOrderDetailsFormData.ORDER_SUCCESSFUL_FORM_HEADING));
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
