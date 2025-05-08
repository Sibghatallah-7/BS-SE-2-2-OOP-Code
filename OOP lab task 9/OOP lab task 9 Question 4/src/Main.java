abstract class Seat {
    abstract int Calculate_Seat_Price(int nofseats);
}

class BusinessClass extends Seat {
    int priceperseat = 5000;

    int Calculate_Seat_Price(int nofseats) {
        return nofseats * priceperseat;
    }
}

class FirstClass extends Seat {
    int priceperseat = 3500;

    int Calculate_Seat_Price(int nofseats) {
        return nofseats * priceperseat;
    }
}

class EconomyClass extends Seat {
    int priceperseat = 2000;

    int Calculate_Seat_Price(int nofseats) {
        return nofseats * priceperseat;
    }
}

public class Main {
    public static void main(String[] args) {
        Seat business = new BusinessClass();
        Seat first = new FirstClass();
        Seat economy = new EconomyClass();

        int businessSeats = 2;
        int firstSeats = 3;
        int economySeats = 4;

        System.out.println("--- The price for 1 business class seat is : 5000 ");
        System.out.println("So The Price for " + businessSeats + " Bussiness Class seats is: " + business.Calculate_Seat_Price(businessSeats));
        System.out.println("__________________________________________________________________");

        System.out.println("--- The price for 1 first class seat is : 3500 ");
        System.out.println("So The price for " + firstSeats + " First Class seats is: " + first.Calculate_Seat_Price(firstSeats));
        System.out.println("__________________________________________________________________");

        System.out.println("--- The price for 1 economy class seat is : 2000 ");
        System.out.println("So The price for " + economySeats + " Economy Class seats is: " + economy.Calculate_Seat_Price(economySeats));
    }
}
