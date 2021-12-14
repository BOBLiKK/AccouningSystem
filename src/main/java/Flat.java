import java.util.Scanner;

public class Flat {
    private double square;
    private int residents;
    private int countRooms;
    private int number;
    private int floor;

    public Flat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        this.number = input.nextInt();
        System.out.println("Введите номер этажа: ");
        this.floor = input.nextInt();
        System.out.println("Введите площадь: ");
        this.square = input.nextInt();
        System.out.println("Введите количество комнат: ");
        this.countRooms = input.nextInt();
        System.out.println("Введите количество жильцов: ");
        this.residents = input.nextInt();
        System.out.println("Квартира добавлена со следующими параметрами:");
        System.out.println("Номер:         " + this.number);
        System.out.println("Этаж:               " + this.floor);
        System.out.println("Площадь:              " + this.square);
        System.out.println("Количество комнат:      "  + this.countRooms);
        System.out.println("Количество жильцов: " + this.residents );
    }

    public Flat(House house) {
        this.number = (int)(1 + Math.random() * 300);
        this.floor = (int)(1 + Math.random() * house.floorCount );
        this.square = (int)(1 + Math.random() * 120);
        this.countRooms = (int)(1 + Math.random() * 5);
        this.residents = (int)(1 + Math.random() * 5);

        System.out.println("Квартира добавлена со следующими параметрами:");
        System.out.println("Номер:              " + this.number);
        System.out.println("Этаж:             " + this.floor);
        System.out.println("Площадь:                      " + this.square);
        System.out.println("Количество комнат:             "  + this.countRooms);
        System.out.println("Количество жильцов:         " + this.residents );

    }

    Flat(String empty) {
    }

    public void printInfo() {
        System.out.println("Информация о квартире:");
        System.out.println("Номер:       " + this.getNumber());
        System.out.println("Этаж:                " + this.getFloor());
        System.out.println("Количество комнат:      " + this.getCountRooms());
        System.out.println("Площадь:               " + this.getSquare());
        System.out.println("Количество жильцов  :  " + this.getResidents());
    }


    public double getSquare() {
        return this.square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getResidents() {
        return this.residents;
    }

    public void setResidents(int roomer) {
        this.residents = roomer;
    }

    public int getCountRooms() {
        return this.countRooms;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return this.floor;
    }

    public void compareSquare(Flat obj) {
        double difference;
        if(this.getSquare()>=obj.getSquare()) {
            difference=this.square/obj.square;
            System.out.println("Площадь первой квартиры больше в " + difference + " раз");
        }
        else {
            difference=obj.getSquare()/this.getSquare();
            System.out.println("Площадь второй квартиры больше в " + difference + " раз");
        }
    }

    public void compareNumberOfRooms(Flat obj) {
        int difference;
        if(this.getCountRooms()>=obj.getCountRooms()) {
            difference=this.getCountRooms() - obj.getCountRooms();
            System.out.println("В первой квартире на " + difference + " комнат больше");
        }
        else {
            difference=obj.getCountRooms() - this.getCountRooms();
            System.out.println("Во второй квартире на " + difference + " комнат больше");
        }

    }

    /*сравнение количества жителей двух квартир*/
    public void compareResidents(Flat obj) {
        int difference;
        if(this.getResidents()>=obj.getResidents()) {
            difference=this.getResidents() - obj.getResidents();
            System.out.println("В первой квартире на " + difference + " людей больше");
        }
        else {
            difference=obj.getResidents() - this.getResidents();
            System.out.println("Во второй квартире на " + difference + " людей больше");
        }
    }

    public void compare(Flat obj){
        this.compareResidents(obj);
        this.compareSquare(obj);
        this.compareNumberOfRooms(obj);
    }
}
