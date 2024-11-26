package ru.nipsuma.aston.lesson6;

public class Person {

    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private Double зарплата;
    private Integer возраст;

    public Person(String ФИО, String должность, String email, String телефон, Double зарплата, Integer возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + ФИО + '\'' +
                ", должность='" + должность + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + телефон + '\'' +
                ", зарплата=" + зарплата +
                ", возраст=" + возраст +
                '}';
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000.0, 30);
        persArray[1] = new Person("Иванов Денис", "Бухгалтер", "ivivan2@mailbox.com", "892312314", 15000.0, 45);
        persArray[2] = new Person("Денисов Иван", "Уборщик", "ivivan3@mailbox.com", "84234231745", 10000.5, 70);
        persArray[3] = new Person("Васильев Денис", "Главный инженер", "ivivan4@mailbox.com", "893512612", 31000.0, 60);
        persArray[4] = new Person("Денисов Святополк", "Начальник", "ivivan5@mailbox.com", "892312312", 300000.0, 20);
    }
}
