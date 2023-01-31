import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import static utils.TestDataUtils.*;

public class AutomationPracticeFormTest extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    private static final String FIRSTNAME = getRandomFirstName(),
            LASTNAME = getRandomLastName(),
            USER_EMAIL = getRandomEmail(),
            CELLPHONE = getRandomPhoneNumber(),
            CURRENT_ADDRESS = getRandomAddress(),
            YEAR = getRandomYear().toString(),
            MONTH = getMonthFromInt(getRandomMonth()),
            DAY = getRandomDay().toString(),
            SUBJECT = "Math",
            IMAGE = "1.png",
            STATE = "Haryana",
            CITY = "Karnal";

    @Test
    public void checkPracticeForm() {

        var calendarComponent = practiceFormPage.fillFirstNameField(FIRSTNAME)
                .fillLastNameField(LASTNAME)
                .fillUserEmailField(USER_EMAIL)
                .maleRadioButtonClick()
                .fillCellNumberPhoneField(CELLPHONE)
                .dateOfBirthFieldClick();
        calendarComponent.selectDateOfCalendar(YEAR, MONTH, DAY);

        var responsiveComponent = practiceFormPage.fillSubjectField(SUBJECT)
                .selectReadingCheckBox()
                .selectMusicCheckBox()
                .selectSportCheckBox()
                .uploadImage(IMAGE)
                .fillCurrentAddress(CURRENT_ADDRESS)
                .selectState(STATE)
                .selectCity(CITY)
                .sumbitButtonClick();

        responsiveComponent.checkDataInResponsiveWindowRow("Student Name", FIRSTNAME + " " + LASTNAME)
                .checkDataInResponsiveWindowRow("Student Email", USER_EMAIL)
                .checkDataInResponsiveWindowRow("Gender", "Male")
                .checkDataInResponsiveWindowRow("Mobile", CELLPHONE)
                .checkDataInResponsiveWindowRow("Date of Birth", DAY + " " + MONTH + "," + YEAR)
                .checkDataInResponsiveWindowRow("Subjects", SUBJECT)
                .checkDataInResponsiveWindowRow("Hobbies", "Reading" + ", " + "Music" + ", " + "Sports")
                .checkDataInResponsiveWindowRow("Picture", IMAGE)
                .checkDataInResponsiveWindowRow("Address", CURRENT_ADDRESS)
                .checkDataInResponsiveWindowRow("State and City", STATE + " " + CITY);
    }
}