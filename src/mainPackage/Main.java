package mainPackage;
import abiturientPackage.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


/*
* Abiturient: id, Прізвище, Ім'я, По батькові, Адреса, Телефон, Середній бал.
Скласти масив об'єктів. Вивести:
a) список абітурієнтів із вказаним іменем;
b) список абітурієнтів, середній бал у яких вище заданого;
c) вибрати задане число n абітурієнтів, що мають найвищий середній бал.

* */
public class Main {
    private static void swap(Abiturient[] array, int ind1, int ind2) {
        Abiturient tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    /**
     * Створення масиву абітурієнтів
     * @param size - кількість абітурієнтів
     * @return Array - масив абітурієнтів
     */
    static Abiturient[] CreateArrayOfObjects(int size) throws IOException
    {
        File file = new File("/Users/user/Desktop/Data_Lr_2.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Abiturient[] Array = new Abiturient[size];
        for (int i = 0; i < size; i++) // заповнення масиву даними
        {
            Array[i] = new Abiturient();
            Array[i].setId(Integer.parseInt(br.readLine()));
            Array[i].setSurname(br.readLine());
            Array[i].setName(br.readLine());
            Array[i].setMiddleName(br.readLine());
            Array[i].setAddress(br.readLine());
            Array[i].setPhoneNumber(br.readLine());
            Array[i].setAverageMark(Double.parseDouble(br.readLine()));
        }
        for (int i = 0; i < size; i++) // вивід всіх абітурієнтів
        {
            System.out.println(Array[i]);
        }
        br.close();
        return Array;
    }
    /**
     * Пошук списку абітурієнтів із вказаним іменем
     * @param scanner - сканер вводу
     * @param size - кількість абітурієнтів
     * @param Array - масив абітурієнтів
     */
    static void SearchName(Scanner scanner, int size, Abiturient[] Array) {
        System.out.print("\nSearch 1:\nEnter the name: ");
        String name = scanner.nextLine(); // ввід імені
        for (int i = 0; i < size; i++) // пошук імені
        {
            if (Objects.equals(name, Array[i].getName())) // умова на вивід
            {
                System.out.println(Array[i]);
            }
        }
    }
    /**
     * Пошук списку абітурієнтів, середній бал у яких вище заданого;
     * @param scanner - сканер вводу
     * @param size - кількість абітурієнтів
     * @param Array - масив абітурієнтів
     */
    static void SearchNameAverageMark(Scanner scanner, int size, Abiturient[] Array)
    {

        System.out.print("\nSearch 2:\nEnter the average mark: ");
        double averageMark = scanner.nextDouble(); // ввід середнього балу
        for (int i = 0; i < size; i++)
        {
            if (Array[i].getAverageMark() > averageMark) // умова на вивід
            {
                System.out.println(Array[i]);
            }
        }
    }

    /**
     * Пошук заданої кількості n абітурієнтів, що мають найвищий середній бал
     * @param scanner - сканер вводу
     * @param Array - масив абітурієнтів
     */
    static void SearchNHighestMark(Scanner scanner, Abiturient[] Array)
    {
        System.out.print("\nSearch 3:\nEnter the number of abiturients: ");
        int numberOfAbiturients = scanner.nextInt(); // ввід кількості абітурієнтів
        for (int i = 1; i < Array.length; i++)
        {
            if (Array[i].getAverageMark() > Array[i - 1].getAverageMark())
            {
                swap(Array, i, i-1);
            }
        }
        for (int i = 0; i < numberOfAbiturients; i++)
        {
            System.out.println(Array[i]);
        }
    }
    public static void main(String[] args) throws IOException {
        int size = 3;


        Abiturient[] Array = CreateArrayOfObjects(size);
        Scanner scanner = new Scanner(System.in);
        SearchName(scanner, size, Array);
        SearchNameAverageMark(scanner, size, Array);
        SearchNHighestMark(scanner, Array);
    }
}