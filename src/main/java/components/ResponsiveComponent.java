package components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ResponsiveComponent {

    private final static String RESULT_ROW = "//td[text()='" + "%s" + "']";

    public ResponsiveComponent checkDataInResponsiveWindowRow(String key, String value) {
        $x(String.format(RESULT_ROW, key)).parent()
                .shouldHave(text(value));
        return this;
    }
}
