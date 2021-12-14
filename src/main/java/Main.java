import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountingSystem accountingSystem = new AccountingSystem();
        int choice = input.nextInt();
        int number;
        System.out.println("Выберите действие: ");
        System.out.println("Введите 1 для добавления пустого дома: ");
        System.out.println("Введите 2 для добавления дома: ");
        System.out.println("Введите 3 для добавления квартиры: ");
        System.out.println("Введите 4 для добавления квартиры с рандомными параметрами: ");
        System.out.println("Введите 5 для удаления квартиры: ");
        System.out.println("Введите 6 для удаления дома: ");
        System.out.println("Введите 7 для сравнения домов:");
        System.out.println("Введите 8 для сравнения квартир:");
        System.out.println("Введите 9 для получения информации о доме:");
        System.out.println("Введите 10 для получения информации о квартире:");
        switch (choice) {
            case 1 -> {
                System.out.println("Введите номер дома: ");
                number = input.nextInt();
                accountingSystem.addEmptyHouse(number);

            }
            case 2 -> accountingSystem.addHouse();

            case 3 -> {
                System.out.println("Введите номер дома: ");
                number = input.nextInt();
                accountingSystem.addFlat(number);
            }

            case 4 -> {
                System.out.println("Введите номер дома: ");
                number = input.nextInt();
                accountingSystem.addFlatAutomatically(number);
            }
            case 5 -> {
                System.out.println("Введите номер дома и квартиры: ");
                accountingSystem.removeFlat(input.nextInt(),input.nextInt());
            }
            case 6 -> {
                System.out.println("Введите номер дома: ");
                accountingSystem.removeHouse(input.nextInt());
            }
            case 7 -> {
                System.out.println("Введите номер первого дома: ");
                int numberOfHouseOne = input.nextInt();
                System.out.println("Введите номер второго дома: ");
                int numberOfHouseTwo = input.nextInt();
                accountingSystem.compareHouse(numberOfHouseOne,numberOfHouseTwo);
            }
            case 8 -> {
                System.out.println("Введите номер первого дома и квартиры: ");
                int numberOfHouse1 = input.nextInt();
                int numberOfFlat1 = input.nextInt();
                System.out.println("Введите номер второго дома и квартиры: ");
                int numberOfHouse2 = input.nextInt();
                int numberOfFlat2 = input.nextInt();
                accountingSystem.compareFlat(numberOfHouse1,numberOfHouse2,numberOfFlat1,numberOfFlat2);
            }
            case 9 -> {
                System.out.println("Введите номер дома: ");
                accountingSystem.getHouseInformation(input.nextInt());
            }
            case 10 -> {
                System.out.println("Введите номер дома и квартиры: ");
                accountingSystem.getFlatInformation(input.nextInt(), input.nextInt());
            }
            default -> System.out.println("Вы ввели несуществующую команду. ");
        }
    }

}
