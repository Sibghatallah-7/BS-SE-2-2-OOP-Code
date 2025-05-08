abstract class marks {
    abstract double getpercentage();
}

class a extends marks {
    private int m1, m2, m3;

    a(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    double getpercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}

class b extends marks {
    private int m1, m2, m3, m4;

    b(int p, int q, int r, int s) {
        m1 = p;
        m2 = q;
        m3 = r;
        m4 = s;
    }

    double getpercentage() {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}

public class Main {
    public static void main(String[] args) {
        a student1 = new a(50, 70, 60);
        b student2 = new b(112, 98, 78, 69);

        System.out.println("Percentage of Student A: " + student1.getpercentage() + "%");
        System.out.println("Percentage of Student B: " + student2.getpercentage() + "%");
    }
}
