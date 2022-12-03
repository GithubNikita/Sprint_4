package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// Класс главной страницы
public class ScooterHomePage {

    private WebDriver driver;

    public ScooterHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Кнопка "Заказать" в заголовке главной страницы приложения
    private By orderButtonHeader = By.xpath(".//div[starts-with(@class, 'Header_Nav')]//button[contains(text(), 'Заказать')]");
    // Кнопка "Заказать" в центре главной страницы приложения
    private By orderButtonMiddle = By.xpath(".//div[starts-with(@class, 'Home_FinishButton')]//button[contains(text(), 'Заказать')]");

    // Выпадающий список в разделе «Вопросы о важном»
    private By accordionList = By.className("accordion");

    // Вопросы из выпадающего списка в разделе «Вопросы о важном»
    // Вопрос "Сколько это стоит? И как оплатить?" выпадающего списка в разделе «Вопросы о важном»
    private By howMuchAndHowToPayQuestion = By.id("accordion__heading-0");
    // Вопрос "Хочу сразу несколько самокатов! Так можно?" выпадающего списка в разделе «Вопросы о важном»
    private By severalScootersItIsPossibleQuestion = By.id("accordion__heading-1");
    // Вопрос "Как рассчитывается время аренды?" выпадающего списка в разделе «Вопросы о важном»
    private By howIsRentalTimeCalculatedQuestion = By.id("accordion__heading-2");
    // Вопрос "Можно ли заказать самокат прямо на сегодня?" выпадающего списка в разделе «Вопросы о важном»
    private By isItPossibleToOrderScooterForTodayQuestion = By.id("accordion__heading-3");
    // Вопрос "Можно ли продлить заказ или вернуть самокат раньше?" выпадающего списка в разделе «Вопросы о важном»
    private By canIExtendOrderOrReturnScooterEarlierQuestion = By.id("accordion__heading-4");
    // Вопрос "Вы привозите зарядку вместе с самокатом?" выпадающего списка в разделе «Вопросы о важном»
    private By doYouBringChargersWithScooterQuestion = By.id("accordion__heading-5");
    // Вопрос "Можно ли отменить заказ?" выпадающего списка в разделе «Вопросы о важном»
    private By canICancelAnOrderQuestion = By.id("accordion__heading-6");
    // Вопрос "Я жизу за МКАДом, привезёте?" выпадающего списка в разделе «Вопросы о важном»
    private By iliveOutsideMRRoadWillYouBringItQuestion = By.id("accordion__heading-7");


    // Ответы на вопросы из выпадающего списка в разделе «Вопросы о важном»
    // Ответ на вопрос "Сколько это стоит? И как оплатить?" выпадающего списка в разделе «Вопросы о важном»
    private By howMuchAndHowToPayAnswer = By.id("accordion__panel-0");
    // Ответ на вопрос "Хочу сразу несколько самокатов! Так можно?" выпадающего списка в разделе «Вопросы о важном»
    private By severalScootersItIsPossibleAnswer = By.id("accordion__panel-1");
    // Ответ на вопрос "Как рассчитывается время аренды?" выпадающего списка в разделе «Вопросы о важном»
    private By howIsRentalTimeCalculatedAnswer = By.id("accordion__panel-2");
    // Ответ на вопрос "Можно ли заказать самокат прямо на сегодня?" выпадающего списка в разделе «Вопросы о важном»
    private By isItPossibleToOrderScooterForTodayAnswer = By.id("accordion__panel-3");
    // Ответ на вопрос "Можно ли продлить заказ или вернуть самокат раньше?" выпадающего списка в разделе «Вопросы о важном»
    private By canIExtendOrderOrReturnScooterEarlierAnswer = By.id("accordion__panel-4");
    // Ответ на вопрос "Вы привозите зарядку вместе с самокатом?" выпадающего списка в разделе «Вопросы о важном»
    private By doYouBringChargersWithScooterAnswer = By.id("accordion__panel-5");
    // Ответ на вопрос "Можно ли отменить заказ?" выпадающего списка в разделе «Вопросы о важном»
    private By canICancelAnOrderAnswer = By.id("accordion__panel-6");
    // Ответ на вопрос "Я жизу за МКАДом, привезёте?" выпадающего списка в разделе «Вопросы о важном»
    private By iliveOutsideMRRoadWillYouBringItAnswer = By.id("accordion__panel-7");


    // Кнопки "стрелочка" для вопросов из выпадающего списка в разделе «Вопросы о важном»
    // Кнопка "стрелочка" для вопроса "Сколько это стоит? И как оплатить?" выпадающего списка в разделе «Вопросы о важном»
    private By howMuchAndHowToPayButton = By.xpath("//div[@id='accordion__heading-0' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Хочу сразу несколько самокатов! Так можно?" выпадающего списка в разделе «Вопросы о важном»
    private By severalScootersItIsPossibleButton = By.xpath("//div[@id='accordion__heading-1' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Как рассчитывается время аренды?" выпадающего списка в разделе «Вопросы о важном»
    private By howIsRentalTimeCalculatedButton = By.xpath("//div[@id='accordion__heading-2' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Можно ли заказать самокат прямо на сегодня?" выпадающего списка в разделе «Вопросы о важном»
    private By isItPossibleToOrderScooterForTodayButton = By.xpath("//div[@id='accordion__heading-3' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Можно ли продлить заказ или вернуть самокат раньше?" выпадающего списка в разделе «Вопросы о важном»
    private By canIExtendOrderOrReturnScooterEarlierButton = By.xpath("//div[@id='accordion__heading-4' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Вы привозите зарядку вместе с самокатом?" выпадающего списка в разделе «Вопросы о важном»
    private By doYouBringChargersWithScooterButton = By.xpath("//div[@id='accordion__heading-5' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Можно ли отменить заказ?" выпадающего списка в разделе «Вопросы о важном»
    private By canICancelAnOrderButton = By.xpath("//div[@id='accordion__heading-6' and @class=\"accordion__button\"]");
    // Кнопка "стрелочка" для вопроса "Я жизу за МКАДом, привезёте?" выпадающего списка в разделе «Вопросы о важном»
    private By iliveOutsideMRRoadWillYouBringItButton = By.xpath("//div[@id='accordion__heading-7' and @class=\"accordion__button\"]");


    // Метод для нажатия на кнопку "Заказать" в заголовке
    public void orderButtonHeaderClick() {
        driver.findElement(orderButtonHeader).click();
    }

    // Метод для нажатия на кнопку "Заказать" в середине главной страницы
    public void orderButtonMiddleClick() {
        driver.findElement(orderButtonMiddle).click();
    }

    // Метод ожидает загрузки выпадающего списка в разделе «Вопросы о важном»
    public void waitForLoadAccordionListData() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(accordionList));
    }

    // Метод ожидает загрузки выпадающего значения ответа для вопроса из списка в разделе «Вопросы о важном»
    public void waitForLoadAccordionListAnswerData(By accordionListItem) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(accordionListItem));
    }

    // Метод прокручивает страницу до кнопки «Заказать» в середине странице
    public void scrollToOrderMiddleButton() {
        WebElement element = driver.findElement(By.xpath(".//div[starts-with(@class, 'Home_FinishButton')]//button[contains(text(), 'Заказать')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // Метод прокручивает страницу до выпадающего списка в разделе «Вопросы о важном»
    public void scrollToLoadAccordionList() {
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }


    // Методы для клика по кнопке "стрелочка" для вопросов из выпадающего списка "Вопросы о важном"
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Сколько это стоит? И как оплатить?" выпадающего списка в разделе «Вопросы о важном»
    public void howMuchAndHowToPayQuestionClick() {
        driver.findElement(howMuchAndHowToPayButton).click();
        waitForLoadAccordionListAnswerData(howMuchAndHowToPayAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Хочу сразу несколько самокатов! Так можно?" выпадающего списка в разделе «Вопросы о важном»
    public void severalScootersItIsPossibleQuestionClick() {
        driver.findElement(severalScootersItIsPossibleButton).click();
        waitForLoadAccordionListAnswerData(severalScootersItIsPossibleAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Как рассчитывается время аренды?" выпадающего списка в разделе «Вопросы о важном»
    public void howIsRentalTimeCalculatedQuestionClick() {
        driver.findElement(howIsRentalTimeCalculatedButton).click();
        waitForLoadAccordionListAnswerData(howIsRentalTimeCalculatedAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Можно ли заказать самокат прямо на сегодня?" выпадающего списка в разделе «Вопросы о важном»
    public void isItPossibleToOrderScooterForTodayQuestionClick() {
        driver.findElement(isItPossibleToOrderScooterForTodayButton).click();
        waitForLoadAccordionListAnswerData(isItPossibleToOrderScooterForTodayAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Можно ли продлить заказ или вернуть самокат раньше?" выпадающего списка в разделе «Вопросы о важном»
    public void canIExtendOrderOrReturnScooterEarlierQuestionClick() {
        driver.findElement(canIExtendOrderOrReturnScooterEarlierButton).click();
        waitForLoadAccordionListAnswerData(canIExtendOrderOrReturnScooterEarlierAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Вы привозите зарядку вместе с самокатом?" выпадающего списка в разделе «Вопросы о важном»
    public void doYouBringChargersWithScooterQuestionClick() {
        driver.findElement(doYouBringChargersWithScooterButton).click();
        waitForLoadAccordionListAnswerData(doYouBringChargersWithScooterAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Можно ли отменить заказ?" выпадающего списка в разделе «Вопросы о важном»
    public void canICancelAnOrderQuestionClick() {
        driver.findElement(canICancelAnOrderButton).click();
        waitForLoadAccordionListAnswerData(canICancelAnOrderAnswer);
    }
    // Метод для нажатия на кнопку "стрелочка" для вопроса "Я жизу за МКАДом, привезёте?" выпадающего списка в разделе «Вопросы о важном»
    public void iliveOutsideMRRoadWillYouBringItQuestionClick() {
        driver.findElement(iliveOutsideMRRoadWillYouBringItButton).click();
        waitForLoadAccordionListAnswerData(iliveOutsideMRRoadWillYouBringItAnswer);
    }


    // Методы возвращающие значения для текста вопросов из выпадающего списка "Вопросы о важном"
    // Метод возвращающий значение для текста вопроса "Сколько это стоит? И как оплатить?" из выпадающего списка "Вопросы о важном"
    public String howMuchAndHowToPayQuestionGetText() {
        return driver.findElement(howMuchAndHowToPayQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Хочу сразу несколько самокатов! Так можно?" из выпадающего списка "Вопросы о важном"
    public String severalScootersItIsPossibleQuestionGetText() {
        return driver.findElement(severalScootersItIsPossibleQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Как рассчитывается время аренды?" из выпадающего списка "Вопросы о важном"
    public String howIsRentalTimeCalculatedQuestionGetText() {
        return driver.findElement(howIsRentalTimeCalculatedQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Можно ли заказать самокат прямо на сегодня?" из выпадающего списка "Вопросы о важном"
    public String isItPossibleToOrderScooterForTodayQuestionGetText() {
        return driver.findElement(isItPossibleToOrderScooterForTodayQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Можно ли продлить заказ или вернуть самокат раньше?" из выпадающего списка "Вопросы о важном"
    public String canIExtendOrderOrReturnScooterEarlierQuestionGetText() {
        return driver.findElement(canIExtendOrderOrReturnScooterEarlierQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Вы привозите зарядку вместе с самокатом?" из выпадающего списка "Вопросы о важном"
    public String doYouBringChargersWithScooterQuestionGetText() {
        return driver.findElement(doYouBringChargersWithScooterQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Можно ли отменить заказ?" из выпадающего списка "Вопросы о важном"
    public String canICancelAnOrderQuestionGetText() {
        return driver.findElement(canICancelAnOrderQuestion).getText();
    }
    // Метод возвращающий значение для текста вопроса "Я жизу за МКАДом, привезёте?" из выпадающего списка "Вопросы о важном"
    public String iliveOutsideMRRoadWillYouBringItQuestionGetText() {
        return driver.findElement(iliveOutsideMRRoadWillYouBringItQuestion).getText();
    }


    // Методы возвращающие значения для текста ответов из выпадающего списка "Вопросы о важном"
    // Метод возвращающий значение для текста ответа на вопрос "Сколько это стоит? И как оплатить?" из выпадающего списка "Вопросы о важном"
    public String howMuchAndHowToPayAnswerText() {
        return driver.findElement(howMuchAndHowToPayAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Хочу сразу несколько самокатов! Так можно?" из выпадающего списка "Вопросы о важном"
    public String severalScootersItIsPossibleAnswerText() {
        return driver.findElement(severalScootersItIsPossibleAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Как рассчитывается время аренды?" из выпадающего списка "Вопросы о важном"
    public String howIsRentalTimeCalculatedAnswerText() {
        return driver.findElement(howIsRentalTimeCalculatedAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Можно ли заказать самокат прямо на сегодня?" из выпадающего списка "Вопросы о важном"
    public String isItPossibleToOrderScooterForTodayAnswerText() {
        return driver.findElement(isItPossibleToOrderScooterForTodayAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Можно ли продлить заказ или вернуть самокат раньше?" из выпадающего списка "Вопросы о важном"
    public String canIExtendOrderOrReturnScooterEarlierAnswerText() {
        return driver.findElement(canIExtendOrderOrReturnScooterEarlierAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Вы привозите зарядку вместе с самокатом?" из выпадающего списка "Вопросы о важном"
    public String doYouBringChargersWithScooterAnswerText() {
        return driver.findElement(doYouBringChargersWithScooterAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Можно ли отменить заказ?" из выпадающего списка "Вопросы о важном"
    public String canICancelAnOrderAnswerText() {
        return driver.findElement(canICancelAnOrderAnswer).getText();
    }
    // Метод возвращающий значение для текста ответа на вопрос "Я жизу за МКАДом, привезёте?" из выпадающего списка "Вопросы о важном"
    public String iliveOutsideMRRoadWillYouBringItAnswerText() {
        return driver.findElement(iliveOutsideMRRoadWillYouBringItAnswer).getText();
    }
}