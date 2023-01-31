package pages;

import com.codeborne.selenide.SelenideElement;
import components.CalendarComponent;
import components.ResponsiveComponent;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {

    private final static SelenideElement FIRSTNAME_FIELD = $("#firstName"),
            LASTNAME_FIELD = $("#lastName"),
            USER_EMAIL_FIELD = $("#userEmail"),
            MALE_RADIOBUTTON = $(byText("Male")),
            PHONE_NUMBER_FIELD = $("#userNumber"),
            DATE_OF_BIRTH_FIELD = $("#dateOfBirthInput"),
            SUBJECTS_FIELD = $("#subjectsInput"),
            HOBBIES_SPORT_CHECKBOX = $("#hobbies-checkbox-1").parent(),
            HOBBIES_READING_CHECKBOX = $("#hobbies-checkbox-2").parent(),
            HOBBIES_MUSIC_CHECKBOX = $("#hobbies-checkbox-3").parent(),
            UPLOAD_IMG_BUTTON = $("#uploadPicture"),
            CURRENT_ADDRESS_FIELD = $("#currentAddress"),
            CHOICE_STATE_BUTTON = $("#state"),
            CHOICE_STATE = $("#stateCity-wrapper"),
            CHOICE_CITY_BUTTON = $("#city"),
            CHOICE_CITY = $("#stateCity-wrapper"),
            SUMBIT_BUTTON = $("#submit");

    public PracticeFormPage fillFirstNameField(String value) {
        FIRSTNAME_FIELD.shouldBe(visible)
                .setValue(value);
        return this;
    }

    public PracticeFormPage fillLastNameField(String value) {
        LASTNAME_FIELD.shouldBe(visible)
                .setValue(value);
        return this;
    }

    public PracticeFormPage fillUserEmailField(String value) {
        USER_EMAIL_FIELD.setValue(value);
        return this;
    }

    public PracticeFormPage maleRadioButtonClick() {
        MALE_RADIOBUTTON.click();
        return this;
    }

    public PracticeFormPage fillCellNumberPhoneField(String value) {
        PHONE_NUMBER_FIELD.setValue(value);
        return this;
    }

    public CalendarComponent dateOfBirthFieldClick() {
        DATE_OF_BIRTH_FIELD.click();
        return new CalendarComponent();
    }

    public PracticeFormPage fillSubjectField(String value) {
        SUBJECTS_FIELD.setValue(value)
                .pressEnter();
        return this;
    }

    public PracticeFormPage selectReadingCheckBox() {
        HOBBIES_READING_CHECKBOX.click();
        return this;
    }

    public PracticeFormPage selectMusicCheckBox() {
        HOBBIES_MUSIC_CHECKBOX.click();
        return this;
    }

    public PracticeFormPage selectSportCheckBox() {
        HOBBIES_SPORT_CHECKBOX.click();
        return this;
    }

    public PracticeFormPage fillCurrentAddress(String value) {
        CURRENT_ADDRESS_FIELD.setValue(value);
        return this;
    }

    public PracticeFormPage selectState(String value) {
        CHOICE_STATE_BUTTON.click();
        CHOICE_STATE.$(byText(value))
                .click();
        return this;
    }

    public PracticeFormPage selectCity(String value) {
        CHOICE_CITY_BUTTON.click();
        CHOICE_CITY.$(byText(value))
                .click();
        return this;
    }

    public ResponsiveComponent sumbitButtonClick() {
        SUMBIT_BUTTON.scrollTo()
                .click();
        return new ResponsiveComponent();
    }

    public PracticeFormPage uploadImage(String fullImageName) {
        UPLOAD_IMG_BUTTON.uploadFromClasspath("img/" + fullImageName);
        return this;
    }
}
