
import java.util.ArrayList;
import java.util.Scanner;


public class House {

    protected int number;
    protected int flatCount;
    protected int floorCount;
    protected double square;
    protected  int residents;
    public ArrayList<Flat> flats = new ArrayList<>();


    public House() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер дома: ");
        this.number = input.nextInt();
        System.out.println("Введите количество квартир: ");
        this.flatCount = input.nextInt();
        int counter1=0;
        double counter2=0;
        for(int i=0;i<this.flatCount;i++) {
            Flat flat = new Flat();
            flats.add(flat);
            counter1+=flat.getResidents();
            counter2+=flat.getSquare();
        }
        this.setResidents(counter1);
        this.setSquare(counter2);
        this.floorCount = this.findMaxFloor(flats);
        System.out.println("Дом добавлен со следующими параметрами: ");
        System.out.println("Номер:             " + this.number);
        System.out.println("Количество квартир:         " + this.flatCount);
        System.out.println("Количество этажей:         " + this.floorCount);
        System.out.println("Количество жильцов:         " + this.residents);
        System.out.println("Общая площадь:         " + this.square);
    }

    //создание пустого дома
    public House(int number) {
        System.out.println("Введите номер дома: ");
        this.number = number;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество квартир: ");
        this.flatCount = input.nextInt();
        System.out.println("Введите количество этажей: ");
        this.floorCount = input.nextInt();
        this.setResidents(0);
        this.setSquare(0);
    }
    public House(String s) {

    }

    public void printInfo() {
        System.out.println("Информация о доме: ");
        System.out.println("Номер дома: " + this.getNumber());
        System.out.println("Количество этажей: " + this.getFloorCount());
        System.out.println("Количество квартир: " + this.getFlatCount());
        System.out.println("Количество жильцов: " + this.getResidents());
        System.out.println("Общая площадь: " + this.getSquare());
    }

    public void removeFlat(Flat temp) {
        flats.remove(temp);
    }

    public void addFlat(Flat newFlat) {
        flats.add(newFlat);
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getNumber() {
        return number;
    }

    public int getFlatCount() {
        return flatCount;
    }

    public void setFlatCount(int flatCount) {
        this.flatCount = flatCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public ArrayList<Flat> getFlatArray() {

        return flats;
    }


    public void setFlat(ArrayList<Flat> flat) {
        this.flats = flat;
    }

    public int findMaxFloor(ArrayList<Flat> flats){
        int max =0;
        for(Flat i: flats){
            if(i.getFloor()>=max){
                max=i.getFloor();
            }
        }
        return max;
    }
    public void compareFlatsNumber(House obj) {
        int dif;
        if (this.getFlatCount()>=obj.getFlatCount()) {
            dif=this.getFlatCount()-obj.getFlatCount();
            System.out.println("В первом здании на " + dif + " квартир больше");
        }
        else {
            dif=obj.getFlatCount()-this.getFlatCount();
            System.out.println("Во втором здании на " + dif + " квартир больше");
        }
    }

    public void compareFloorsNumber(House obj) {
        int dif;
        if (this.getFloorCount()>=obj.getFloorCount()) {
            dif=this.getFloorCount()-obj.getFloorCount();
            System.out.println("В первом здании на " + dif + " этажей больше");
        }
        else {
            dif=obj.getFloorCount()-this.getFloorCount();
            System.out.println("Во втором здании на " + dif + " этажей больше");
        }
    }

    /*сравнение общей жилплощади двух домов*/
    public void compareSquare(House obj) {
        double dif;
        if(this.getSquare()>=obj.getSquare()) {
            dif=this.getSquare()/obj.getSquare();
            System.out.println("Площадь первого здания больше в " + dif + " раз");
        }
        else {
            dif=obj.getSquare()/this.getSquare();
            System.out.println("Площадь второго здания больше в " + dif + " раз");
        }
    }

    /*сравнение числа жителей в двух домах*/
    public void compareResidentsNumber(House obj) {
        int dif;
        if(this.getResidents()>=obj.getResidents()) {
            dif=this.getResidents() - obj.getResidents();
            System.out.println("В первом здании  на " + dif + " больше людей");
        }
        else {
            dif=obj.getResidents() - this.getResidents();
            System.out.println("Во втором здании   на " + dif + "  больше людей");
        }
    }

    //сравнение домов в ас
    public void compare(House obj){
        this.compareResidentsNumber(obj);
        this.compareSquare(obj);
        this.compareFloorsNumber(obj);
        this.compareFlatsNumber(obj);
    }
}
