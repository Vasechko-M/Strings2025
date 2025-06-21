import java.util.Arrays;

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
        String fullName = firstName + " " + middleName + " " + lastName; //конкатенация - склеивание строк
        System.out.println(fullName);

        //пример склеивания строк с помощью метода stringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append("Привет");
        sb.append(", ");
        sb.append("мир!");

        System.out.println(sb.toString()); // Вывод: Привет, мир!

        // Можно модифицировать содержимое
        sb.insert(8, "другой ");
        System.out.println(sb.toString()); // Вывод: Привет, другой мир!
        /**
         * Основные методы StringBuilder
         * append(String s) — добавляет строку или символ в конец.
         * insert(int offset, String s) — вставляет строку в указанную позицию.
         * delete(int start, int end) — удаляет часть строки.
         * replace(int start, int end, String s) — заменяет часть строки.
         * toString() — преобразует содержимое StringBuilder обратно в объект String.
         */
        //строку перевести в массив
        String splitStr = "1,2,3"; //создали строку
        String[] strings = splitStr.split(","); //создали массив для строки и выплали элемент по которому будет разделение ","
        System.out.println(strings[1]); //выводит на экран "2"
        System.out.println(Arrays.toString(strings)); //выводит на экран получившийся массив [1, 2, 3]

        //Task 2
        System.out.println("Task 2");
        String s1 = fullName.toUpperCase();
        System.out.println("анные Ф. И. О. сотрудника для заполнения отчета — " + s1);
        //Task 3
        System.out.println("Task 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);

        String test1 = "test1";
        String test2 = "test1";
        String test3 = "Test1";
        String test4 = new String("test1"); //будет folse
        test4 = test4.intern();             //принудительно положили в пул строк (станет thrue)
        System.out.println(test1 == test2); //проверяем пул строк (две переменные ведут на одну и ту же ячейку памяти)
        System.out.println(test3 == test1);
        System.out.println(test1 == test4);

    }
}