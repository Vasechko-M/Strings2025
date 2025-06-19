public class Main {
    public static void main(String[] args) {
        String phone = "+9604-1575 37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("ОШИБКА, слишком много символов");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Не хватает символов");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
/**
 * Дополнительный пример использования метода replace()
 String street = "манежная";
 String streetTrue = street.replace("м", "М");
 System.out.println(streetTrue);
 */
        System.out.println("HW");
        //Task 1
        System.out.println("Task 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        //Task 2
        System.out.println("Task 2");
        String s1 = fullName.toUpperCase();
        System.out.println("анные Ф. И. О. сотрудника для заполнения отчета — " + s1);
        //Task 3
        System.out.println("Task 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);
    }
}