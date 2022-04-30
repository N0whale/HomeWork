package Students;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class StudentMain {
    public static void main(String[] args) throws IOException {

        List<Student> students = new ArrayList<>();

        fillStudents(students);            // задание 1+2
        System.out.println("Задание 1 и 2");
        printStudents(students);


        List<Student> studentsOldAndSmart = new ArrayList<>();
        sortStudents(students, studentsOldAndSmart);
        System.out.println();
        System.out.println("Задание 3");
        printStudents(studentsOldAndSmart);               //задание 3

        double avg = avgStudents(studentsOldAndSmart);
        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Средний возраст равен " + roundDouble(avg, 2));     // задание 4


        studentsOldAndSmart.sort(new ComparatorNames());
        top10LastNames(studentsOldAndSmart);
        System.out.println();
        System.out.println("задание 5 Сортировка по длине имен среди отфильтрованых");
        printStudents(studentsOldAndSmart);                        //задание 5


        sortStudents(students, studentsOldAndSmart);
        studentsOldAndSmart.sort(new ComparatorGrades());
        top10GradesStart(studentsOldAndSmart);
        System.out.println();
        System.out.println("6 задание топ 10 по оценке среди отфильтрованых");
        printStudents(studentsOldAndSmart);                  //задание 6


        sortStudents(students, studentsOldAndSmart);
        studentsOldAndSmart.sort(new ComparatorAge().thenComparing(new ComparatorGrades()));
        sortTop10parametrs2(studentsOldAndSmart);
        System.out.println();
        System.out.println("задание 7");
        printStudents(studentsOldAndSmart);      //задание 7
    }


    /**
     * Создание коллекции с данными
     *
     * @param a входная коллекция
     * @throws IOException
     */
    public static void fillStudents(List a) throws IOException {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10000; i++) {
            Student student = new Student();
            student.setNumber(i + 1);
            student.setName(randomStudentName());
            student.setAge(rnd.nextInt(7,18));
            double grade = rnd.nextDouble(10);
            grade = roundDouble(grade, 1);
            student.setGrade(grade);
            student.setOlymic(rnd.nextBoolean());
            a.add(student);
        }

    }

    /**
     * Метод сортировки старше 12 и оценка выше 8
     * @param a изначальная коллекция
     * @param b коллекция, в которую перенесуться данные
     */
    public static void sortStudents(List<Student> a, List<Student> b) {
        for (Student student : a) {
            if (student.getAge() >= 12 & student.getGrade() >= 8) {
                b.add(student);
            }
        }
    }

    /**
     * Вывод коллеции в консоль
     *
     * @param a коллекция
     */
    public static void printStudents(List a) {
        for (Object o : a) {
            System.out.println(o);
        }
    }

    /**
     * подсчет среднего возраста студентов
     *
     * @param a
     * @return средний возраст студентов
     */
    public static double avgStudents(List<Student> a) {
        double avg = 0;
        double ageCombibed = 0;
        for (Student student : a) {
            ageCombibed += student.getAge();
        }
        avg = ageCombibed / a.size();
        return avg;
    }

    /**
     * выбор случайной строки из файла
     *
     * @return случайное имя из файла
     * @throws IOException
     */
    public static String randomStudentName() throws IOException {
        File file = new File("d:/Idea/JavaProjects/ClassWork/src/Students/NamesRus.txt");
        final RandomAccessFile f = new RandomAccessFile(file, "r");
        final long randomLocation = ThreadLocalRandom.current().nextLong(0, f.length());
        f.seek(randomLocation);
        String randomName = f.readLine();
        randomName = f.readLine();
        String randomName1;
        f.close();
        if (randomName == null) {
            return "Авдей";            //цикл на случай, если рандом попадает в последнюю строку, пишет первое имя
        } else
            randomName1 = new String(randomName.getBytes("ISO-8859-1"), "UTF-8");
        return randomName1;
    }

    /**
     * метод удаляет из коллекции все элементы, кроме 10 максимальных
     * @param a изначальная коллекиця
     */
    public static void top10LastNames(List<Student> a) {
        if (a.size() >= 10) {
            for (int i = a.size() - 11; i >= 0; i--) {
                a.remove(i);
            }
        }
    }

    /**
     * метод удаляет все элементы коллекции после 10, если они есть
     * @param a коллекция
     */
    public static void top10GradesStart(List<Student> a){

        for (int i = 10; i < a.size(); i++) {
            if (a.size() >= 11) {
                a.remove(i);
                i -= 1;
            }
        }
    }

    /**
     * метод удаляет элементы после 10 для каждого возраста
     * @param a коллекция
     */
    public static void sortTop10parametrs2(List<Student> a) {
        for (int i = 0; i < a.size(); i++) {

            if (i > 9 && a.get(i).getAge() == 12) {
                a.remove(i);
                i -= 1;
            }
            if (i > 19 && a.get(i).getAge() == 13) {
               a.remove(i);
                i -= 1;
            }
            if (i > 29 && a.get(i).getAge() == 14) {
                a.remove(i);
                i -= 1;
            }
            if (i > 39 && a.get(i).getAge() == 15) {
                a.remove(i);
                i -= 1;
            }
            if (i > 49 && a.get(i).getAge() == 16) {
                a.remove(i);
                i -= 1;
            }
            if (i > 59 && a.get(i).getAge() == 17) {
                a.remove(i);
                i -= 1;
            }
        }
    }

    /**
     * Сокращение дробного до 2 знаков после запятой
     *
     * @param value
     * @param places
     * @return
     */
    public static double roundDouble(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


}
