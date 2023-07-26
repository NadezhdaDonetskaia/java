import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class PersonalData {
    String lastName;
    String firstName;
    String middleName;
    String birthDate;
    String phoneNumber;
    char gender;

    public PersonalData(String lastName, String firstName, String middleName, String birthDate, String phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // метод для проверки формата даты
    public static boolean isValidDate(String date) {
        String dateRegex = "^(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[0-2])\\.\\d{4}$";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    // метод для проверки формата номера телефона
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\d{7}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // метод для проверки формата пола
    public static boolean isValidGender(char gender) {
        return gender == 'f' || gender == 'm';
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            String input = getUserInput();
            String[] inputData = input.split(" ");
            if (inputData.length != 6) {
                throw new IllegalArgumentException("Ошибка: Неверное количество данных. Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");
            }
            

            String lastName = inputData[0];
            String firstName = inputData[1];
            String middleName = inputData[2];
            String birthDate = inputData[3];
            String phoneNumber = inputData[4];
            char gender = inputData[5].charAt(0);

            if (!PersonalData.isValidDate(birthDate)) {
                throw new IllegalArgumentException("Ошибка: Неверный формат даты рождения. Используйте формат dd.mm.yyyy");
            }

            if (!PersonalData.isValidPhoneNumber(phoneNumber)) {
                throw new IllegalArgumentException("Ошибка: Неверный формат номера телефона. Используйте семизначное число.");
            }

            if (!PersonalData.isValidGender(gender)) {
                throw new IllegalArgumentException("Ошибка: Неверный формат пола. Используйте символ 'f' или 'm'.");
            }

            PersonalData personalData = new PersonalData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            writeToFile(personalData);

            System.out.println("Данные успешно записаны в файл.");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи в файл:");
            e.printStackTrace();
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");
        String input = scanner.nextLine();

        scanner.close();
        return input;
    }

    private static void writeToFile(PersonalData personalData) throws IOException {
        String fileName = personalData.lastName + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String dataLine = personalData.lastName + personalData.firstName + personalData.middleName +
                    personalData.birthDate + " " + personalData.phoneNumber + personalData.gender + "\n";
            writer.write(dataLine);
        }
    }
}