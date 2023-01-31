import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public abstract class TestBase {

    @BeforeAll
    public static void setUp() {
        Configuration.browserSize = "1920x1050";
        open("https://demoqa.com/automation-practice-form");
    }
}
