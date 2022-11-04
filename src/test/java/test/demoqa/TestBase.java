package test.demoqa;

import com.beust.ah.A;
import com.codeborne.selenide.Configuration;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    static String firstName = "Anastasiia",
            lastName = "Kireeva",
            email = "aaakireeva@yandex.ru",
            Number = "9295722597",
            day = "22",
            month = "October",
            year = "1998";

    @BeforeAll
    static void configure(){
        //Добавляем URL, чтоб не прописывать каждый раз
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        //Configuration.browser = "chrome";
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last Screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();

    }
}

