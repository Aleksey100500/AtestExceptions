import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String name;
    private String surName;
    private String surName2;
    private String dateOfBirth;
    private String phoneNumber;
    private String sex;

    public Person(String name, String surName, String surName2, String dateOfBirth, String phoneNumber, String sex) {
        this.name = name;
        this.surName = surName;
        this.surName2 = surName2;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public static Person createPerson() {

        String namePerson = firstName.nameF();
        String secName = lastName.nameS();
        String thName = thirdName.nameT();
        String date = dob.dateOfBirth();
        String phoneNumber = telNumber.phoneNumber();
        String yoursex = yourSex.ySex();

        Person person = new Person(namePerson, secName, thName,
                date, phoneNumber, yoursex);

        return person;
    }
    public void getInfoPerson() {
        System.out.printf("Name: %s Surname: %s Surname2: %s DateOfBirth: %s PhoneNumber: %s Sex: %s", name, surName, surName2,
                dateOfBirth, phoneNumber, sex);
    }
    public String joinInfo() {
        String fullName = "<" + this.name + ">" + "<" + this.surName + ">" + "<" + this.surName2 + ">" + "<" + this.dateOfBirth + ">"
                + "<" +this.phoneNumber + ">" + "<" +this.sex + ">";
        return fullName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getSurName2() {
        return surName2;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }
}
