import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.practicum.model.constants.AccordionListData;
import ru.yandex.practicum.pageobject.ScooterHomePage;

import static org.junit.Assert.assertEquals;


// Класс с проверками для значений текста ответов из выпадающего списка "Вопросы о важном" на предмет соответствия с эталонным значением, указанным в константах
public class AccordionListAnswerValueTests {

    private WebDriver driver;

    // Проверка значения текста ответа на вопрос "Сколько это стоит? И как оплатить?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkHowMuchAndHowToPayAnswerValue() {
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
        objHomePage.howMuchAndHowToPayQuestionClick();
        assertEquals(AccordionListData.HOW_MUCH_AND_HOW_TO_PAY_ANSWER, objHomePage.howMuchAndHowToPayAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Хочу сразу несколько самокатов! Так можно?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkSeveralScootersItIsPossibleAnswerValue() {
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
        objHomePage.severalScootersItIsPossibleQuestionClick();
        assertEquals(AccordionListData.SEVERAL_SCOOTERS_IT_IS_POSSIBLE_ANSWER, objHomePage.severalScootersItIsPossibleAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Как рассчитывается время аренды?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkHowIsRentalTimeCalculatedAnswerValue() {
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
        objHomePage.howIsRentalTimeCalculatedQuestionClick();
        assertEquals(AccordionListData.HOW_IS_RENTAL_TIME_CALCULATED_ANSWER, objHomePage.howIsRentalTimeCalculatedAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Можно ли заказать самокат прямо на сегодня?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkIsItPossibleToOrderScooterForTodayAnswerValue() {
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
        objHomePage.isItPossibleToOrderScooterForTodayQuestionClick();
        assertEquals(AccordionListData.IS_IT_POSSIBLE_TO_ORDER_SCOOTER_FOR_TODAY_ANSWER, objHomePage.isItPossibleToOrderScooterForTodayAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Можно ли продлить заказ или вернуть самокат раньше?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkCanIExtendOrderOrReturnScooterEarlierAnswerValue() {
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
        objHomePage.canIExtendOrderOrReturnScooterEarlierQuestionClick();
        assertEquals(AccordionListData.CAN_I_EXTEND_ORDER_OR_RETURN_SCOOTER_EARLIER_ANSWER, objHomePage.canIExtendOrderOrReturnScooterEarlierAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Вы привозите зарядку вместе с самокатом?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkDoYouBringChargersWithScooterAnswerValue() {
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
        objHomePage.doYouBringChargersWithScooterQuestionClick();
        assertEquals(AccordionListData.DO_YOU_BRING_CHARGERS_WITH_SCOOTER_ANSWER, objHomePage.doYouBringChargersWithScooterAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Можно ли отменить заказ?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkCanICancelAnOrderAnswerValue() {
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
        objHomePage.canICancelAnOrderQuestionClick();
        assertEquals(AccordionListData.CAN_I_CANCEL_AN_ORDER_ANSWER, objHomePage.canICancelAnOrderAnswerText());
    }

    // Проверка значения текста ответа на вопрос "Я жизу за МКАДом, привезёте?" из выпадающего списка "Вопросы о важном"
    @Test
    public void checkIliveOutsideMRRoadWillYouBringItAnswerValue() {
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
        objHomePage.iliveOutsideMRRoadWillYouBringItQuestionClick();
        assertEquals(AccordionListData.I_LIVE_OUTSIDE_M_R_ROAD_WILL_YOU_BRING_IT_ANSWER, objHomePage.iliveOutsideMRRoadWillYouBringItAnswerText());
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}