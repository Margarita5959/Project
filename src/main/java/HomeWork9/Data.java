package HomeWork9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        // Список курсов
        Course course1 = new Course("Основы Jira и Confluence");
        Course course2 = new Course("Системы сбора логов");
        Course course3 = new Course("Безопасность веб");
        Course course4 = new Course("HTML/CSS для тестировщиков");
        Course course5 = new Course("Автоматизация тестирования Web UI на Java");
        Course course6 = new Course("Тестирование backend на Java");
        Course course7 = new Course("Тестирование веб-приложений");
        Course course8 = new Course("Основы баз данных");
        Course course9 = new Course("Linux.Рабочая станция");
        Course course10 = new Course("Основы ручного тестирования");
        Course course11 = new Course("Основы тест-аналитики");
        Course course12 = new Course("Git. Базовый курс");

        // Список студентов
        Student student1 = new Student("Артур Полищук", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Александр Михеев", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Виталий Вакулин", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Елена Нурова", Arrays.asList(course2, course4, course8, course1, course3));
        Student student5 = new Student("Виктор Евдокимов", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Антон Славянский", Arrays.asList(course1, course3, course5));
        Student student7 = new Student("Лидия Бережная", Arrays.asList(course2, course6, course7));
        Student student8 = new Student("Константин Субботников", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Ксения Никулина", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Глеб Соловьев", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("Михаил Шушпанов", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("Виктория Никитина", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Анастасия Печенкина", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Евгения Юдина", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Ирина Тылькова", Arrays.asList(course10, course3, course1));
        Student student16 = new Student("Сергей Галкин", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Константин Федеров", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Вадим Захаров", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Павел Борзенков", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Сергей Савицкий", Arrays.asList(course9, course5, course3));
        Student student21 = new Student("Евгений Сергеев", Arrays.asList(course8, course6, course5));
        Student student22 = new Student("Максим Глазырин", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("Ксения Парфенова", Arrays.asList(course6, course1, course5));
        Student student24 = new Student("Владимир Квасков", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("Денис Кононович", Arrays.asList(course4, course12, course5));
        Student student26 = new Student("Мария Ушанкова", Arrays.asList(course3, course9, course5));
        Student student27 = new Student("Светлана Яковлева", Arrays.asList(course2, course6, course3));
        Student student28 = new Student("Максим Баучкин", Arrays.asList(course1, course9, course5));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25, student26, student27, student28);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<String> courses = Arrays.asList("Основы Jira и Confluence", "Системы сбора логов", "Безопасность веб",
                "HTML/CSS для тестировщиков", "Автоматизация тестирования Web UI на Java", "Тестирование backend на Java", "Тестирование веб-приложений",
                "Основы баз данных", "Linux.Рабочая станция", "Основы ручного тестирования",
                "Основы тест-аналитики", "Git. Базовый курс");
        return new Course(courses.get(random.nextInt(courses.size())));
    }
}