interface display {
    void show();
}

interface Aircraft extends display {
    String aircraftType();
    int calculateCapacity();
}

class PassengerJet implements Aircraft {
    int rows, seatsPerRow;

    PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    public String aircraftType() {
        return "Passenger Jet";
    }

    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity());
        System.out.println("_________________________________________");
    }
}

class CargoPlane implements Aircraft {
    double length, width;

    CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String aircraftType() {
        return "Cargo Plane";
    }

    public int calculateCapacity() {
        double area = length * width;
        double capacityPerPerson = 4.0;
        return (int) (area / capacityPerPerson);
    }


    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Equivalent Capacity: " + calculateCapacity());
        System.out.println("_________________________________________");
    }
}

class PrivateJet implements Aircraft {
    int seats;

    PrivateJet(int seats) {
        this.seats = seats;
    }

    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Luxury Seats: " + calculateCapacity());
        System.out.println("_________________________________________");
    }
}

public class Main {
    public static void main(String[] args) {
        Aircraft a1 = new PassengerJet(25, 6);
        Aircraft a2 = new CargoPlane(20, 5);
        Aircraft a3 = new PrivateJet(10);

        a1.show();
        a2.show();
        a3.show();
    }
}
