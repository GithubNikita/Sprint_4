import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;
import ru.yandex.practicum.model.constants.AccordionListData;
import ru.yandex.practicum.pageobject.ScooterHomePage;

import static org.junit.Assert.assertEquals;


// Класс с проверками для значений текста вопросов из выпадающего списка "Вопросы о важном" на предмет соответствия с эталонным значением, указанным в константах
public class AccordionListQuestionValueTests {

    private WebDriver driver;

    // Проверка значения текста вопроса "Сколько это стоит? И как оплатить?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkHowMuchAndHowToPayQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Сколько это стоит? И как оплатить?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.HOW_MUCH_AND_HOW_TO_PAY_QUESTION, objHomePage.howMuchAndHowToPayQuestionGetText());
    }

    // Проверка значения текста вопроса "Хочу сразу несколько самокатов! Так можно?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkSeveralScootersItIsPossibleQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Хочу сразу несколько самокатов! Так можно?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.SEVERAL_SCOOTERS_IT_IS_POSSIBLE_QUESTION, objHomePage.severalScootersItIsPossibleQuestionGetText());
    }

    // Проверка значения текста вопроса "Как рассчитывается время аренды?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkHowIsRentalTimeCalculatedQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Как рассчитывается время аренды?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.HOW_IS_RENTAL_TIME_CALCULATED_QUESTION, objHomePage.howIsRentalTimeCalculatedQuestionGetText());
    }

    // Проверка значения текста вопроса "Можно ли заказать самокат прямо на сегодня?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkIsItPossibleToOrderScooterForTodayQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Можно ли заказать самокат прямо на сегодня?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.IS_IT_POSSIBLE_TO_ORDER_SCOOTER_FOR_TODAY_QUESTION, objHomePage.isItPossibleToOrderScooterForTodayQuestionGetText());
    }

    // Проверка значения текста вопроса "Можно ли продлить заказ или вернуть самокат раньше?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkCanIExtendOrderOrReturnScooterEarlierQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Можно ли продлить заказ или вернуть самокат раньше?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.CAN_I_EXTEND_ORDER_OR_RETURN_SCOOTER_EARLIER_QUESTION, objHomePage.canIExtendOrderOrReturnScooterEarlierQuestionGetText());
    }

    // Проверка значения текста вопроса "Вы привозите зарядку вместе с самокатом?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkDoYouBringChargersWithScooterQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Вы привозите зарядку вместе с самокатом?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.DO_YOU_BRING_CHARGERS_WITH_SCOOTER_QUESTION, objHomePage.doYouBringChargersWithScooterQuestionGetText());
    }

    // Проверка значения текста вопроса "Можно ли отменить заказ?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkCanICancelAnOrderQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Можно ли отменить заказ?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.CAN_I_CANCEL_AN_ORDER_QUESTION, objHomePage.canICancelAnOrderQuestionGetText());
    }

    // Проверка значения текста вопроса "Я жизу за МКАДом, привезёте?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkIliveOutsideMRRoadWillYouBringItQuestionValue() {
        // Драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создание объекта класса главной страницы приложения
        ScooterHomePage objHomePage = new ScooterHomePage(driver);
        // Ожидаем загрузки выпадающего списка в разделе «Вопросы о важном»
        objHomePage.waitForLoadAccordionListData();
        // Прокручиваем страницу до выпадающего списка в разделе «Вопросы о важном»
        objHomePage.scrollToLoadAccordionList();
        // Сравнение значения текста вопроса "Я жизу за МКАДом, привезёте?" из выпадающего списка "Вопросы о важном" с эталонным значением
        assertEquals(AccordionListData.I_LIVE_OUTSIDE_M_R_ROAD_WILL_YOU_BRING_IT_QUESTION, objHomePage.iliveOutsideMRRoadWillYouBringItQuestionGetText());
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}