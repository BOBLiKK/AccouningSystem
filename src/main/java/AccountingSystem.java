import java.util.*;


public class AccountingSystem {
    public final ArrayList<House> house = new ArrayList<>();

    public House findHouseByNumber(int number) {
        for (House i : house) {
            if (i.getNumber() == number) {
                return i;
            }
        }
        System.out.println("Нет дома с таким номером.");
        House temp = new House("Пусто....");
        temp.setFlatCount(-1);
        return temp;
    }

    public Flat findFlatByNumber(House house, int number) {
        for (Flat i : house.getFlatArray()) {
            if (i.getNumber() == number) {
                return i;
            }
        }
        Flat temp = new Flat("Пусто...");
        temp.setNumber(-1);
        return temp;
    }

    public void addEmptyHouse(int numberOfHouse) {
        for (House i : house) {
            if (i.getNumber() == numberOfHouse) {
                System.out.println("Дом с таким номером уже существует.");
                return;
            }
        }
        House house = new House(numberOfHouse);
        this.house.add(house);
        System.out.println("Дом успешно добавлен.");
    }

    public void addHouse() {
        House house = new House();
        this.house.add(house);
        System.out.println("Дом успешно добавлен.");
    }

    public void addFlat(int numberOfHouse) {
        House temp = findHouseByNumber(numberOfHouse);
        if (temp.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует. ");
        } else {
            Flat tempFlat = new Flat();
            temp.addFlat(tempFlat);
            System.out.println("Квартира добавлена в  дом № " + numberOfHouse );
        }
    }

    public void addFlatAutomatically(int numberOfHouse) {
        House temp = findHouseByNumber(numberOfHouse);
        int number = 0;
        for (House i : house) {
            if (i.getNumber() == numberOfHouse) {
                break;
            }
            number++;
        }
        House house = this.house.get(number);

        if (temp.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
        } else {
            Flat tempFlat = new Flat(house);
            /* recurs(numberOfHouse,house,tempFlat);*/
            temp.addFlat(tempFlat);
            System.out.println("Квартира добавлена.");
        }
    }

    public void removeHouse(int numberOfHouse) {
        House temp = findHouseByNumber(numberOfHouse);
        if (temp.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        house.remove(temp);
    }

    public void removeFlat(int numberOfHouse, int numberOfFlat) {
        House temp = findHouseByNumber(numberOfHouse);
        if (temp.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        Flat temp1 = findFlatByNumber(temp, numberOfFlat);
        if (temp1.getNumber() == -1) {
            System.out.println("Квартира с таким номером не существует.");
            return;
        }
        temp.removeFlat(temp1);
    }

    public void compareFlat(int numberOfHouse1, int numberOfHouse2, int numberOfFlat1, int numberOfFlat2) {

        House house1 = findHouseByNumber(numberOfHouse1);
        if (house1.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        Flat flat1 = findFlatByNumber(house1, numberOfFlat1);
        if (flat1.getNumber() == -1) {
            System.out.println("Квартира с таким номером не существует.");
            return;
        }
        House house2 = findHouseByNumber(numberOfHouse2);
        if (house2.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        Flat flat2 = findFlatByNumber(house2, numberOfFlat2);
        if (flat2.getNumber() == -1) {
            System.out.println("Квартира с таким номером не существует.");
            return;
        }
        flat1.compare(flat2);
    }

    public void compareHouse(int numberOfHouseOne, int numberOfHouseTwo) {
        House houseOne = findHouseByNumber(numberOfHouseOne);
        if (houseOne.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        House houseTwo = findHouseByNumber(numberOfHouseTwo);
        if (houseTwo.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        houseOne.compare(houseTwo);
    }

    public void getFlatInformation(int numberOfHome, int numberOfApartment) {
        House temp = findHouseByNumber(numberOfHome);
        if (temp.getFlatCount() == -1) {
            System.out.println("Дом с таким номером не существует.");
            return;
        }
        Flat temp2 = findFlatByNumber(temp, numberOfApartment);
        if (temp.getNumber() == -1) {
            System.out.println("Квартира с таким номером не существует.");
            return;
        }
        temp2.printInfo();
    }

    public void getHouseInformation(int number) {
        House temp = findHouseByNumber(number);
       temp.printInfo();
        if (temp.getFlatArray().size() == 0) {
            System.out.println("В этом доме нет квартир((((");
        }
    }
}
