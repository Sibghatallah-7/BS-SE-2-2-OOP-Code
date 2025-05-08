abstract class bank {
    abstract int getbalance();
}

class bankA extends bank {
    private int balance = 100;

    int getbalance()
    {
        return balance;
    }
}

class bankB extends bank {
    private int balance = 150;

    int getbalance()
    {
        return balance;
    }
}

class bankC extends bank {
    private int balance = 200;

    int getbalance()
    {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        bankA bankA = new bankA();
        bankB bankB = new bankB();
        bankC bankC = new bankC();

        System.out.println("Balance in Bank A: " + bankA.getbalance());
        System.out.println("Balance in Bank B: " + bankB.getbalance());
        System.out.println("Balance in Bank C: " + bankC.getbalance());
    }
}
