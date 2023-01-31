package utils;

import com.github.javafaker.Faker;

import java.time.LocalDate;

public class TestDataUtils {

    private static final Faker faker = new Faker();
    private static final String REGEXP_PHONE_NUMBER = "\\d{10}";

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.dog().breed();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomPhoneNumber() {
        return faker.regexify(REGEXP_PHONE_NUMBER);
    }

    public static String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public static Integer getRandomYear() {
        return randomBetweenDigits(1900, LocalDate.now().getYear());
    }

    public static String getMonthFromInt(int month) {
        switch (month) {
            case 0: return "January";
            case 1: return "February";
            case 2: return "March";
            case 3: return "April";
            case 4: return "May";
            case 5: return "June";
            case 6: return "July";
            case 7: return "August";
            case 8: return "September";
            case 9: return "October";
            case 10: return "November";
            case 11: return "December";
            default: throw new IllegalArgumentException();
        }
    }

    public static Integer getRandomDay() {
        return randomBetweenDigits(1, 31);
    }

    public static Integer getRandomMonth() {
        return ((int) (Math.random() * (12)));
    }

    public static int randomBetweenDigits(int start, int end) {
        return (start + (int) Math.round(Math.random() * (end - start)));
    }
}
