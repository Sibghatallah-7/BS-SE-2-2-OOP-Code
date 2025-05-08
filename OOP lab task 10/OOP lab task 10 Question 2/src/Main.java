abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

class VIPPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 5000;
    }
}

class FamilyPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 2000;
    }
}

class GeneralPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 1000;
    }
}

public class Main {
    public static void main(String[] args) {
        VisitorPass vip = new VIPPass();
        VisitorPass family = new FamilyPass();
        VisitorPass general = new GeneralPass();

        int vipTotal = vip.calculateTicketPrice(2);
        int familyTotal = family.calculateTicketPrice(4);
        int generalTotal = general.calculateTicketPrice(3);

        System.out.println("VIP Ticket Total: " + vipTotal);
        System.out.println("Family Ticket Total: " + familyTotal);
        System.out.println("General Ticket Total: " + generalTotal);
    }
}


