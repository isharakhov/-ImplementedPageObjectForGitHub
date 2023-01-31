package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private static final SelenideElement MONTH_DATE_PICKER = $(".react-datepicker__month-select"),
            YEAR_DATE_PICKER = $(".react-datepicker__year-select");
    private static final String DAY_DATE_PICKER = ".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)";

    public void selectDateOfCalendar(String year, String month, String day) {
        MONTH_DATE_PICKER.click();
        MONTH_DATE_PICKER.selectOption(month);
        YEAR_DATE_PICKER.selectOptionByValue(year);
        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }
        $(String.format(DAY_DATE_PICKER, day)).click();
    }
}
