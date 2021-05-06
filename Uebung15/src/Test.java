import java.util.Locale;

public class Test {
//private  GgtIterativ n;

    public static void main(String[] args) {
        Test t = new Test();
        //System.out.print(t.berechneGgT(50230, 200) + "\n" +
        // t.berechneGgT2(50230, 200));
        long time = System.currentTimeMillis();
        System.out.print(t.istPalindrom("a"));
        System.out.print(System.currentTimeMillis()- time);

       // System.out.print(System.currentTimeMillis());
        //n.berechneGgT(300,20);


    }

    private long berechneGgT(long a, long b) {
        var x = a;
        var y = b;


        while (y != 0) {
            long z = 0;
            z = x % y;
            x = y;
            y = z;
        }


        return x;

    }

    public long berechneGgT2(long a, long b) {
        if (a % b == 0)
            return b;
        else
            return berechneGgT2(b, a % b);

    }

    public boolean istPalindrom(String Wort) {
       // long  startTime = System.nanoTime();
        String reverse = "";
        String test = Wort.toLowerCase().strip();

        int leange = test.length();

        for (int i = leange - 1; i >= 0; i--) {
            reverse = reverse + test.charAt(i);

        }
        if (test.equals(reverse)) {
            long  endTime = System.nanoTime();
           // System.out.print(endTime-startTime);
            return true;

        }
        else
        {
            long  endTime = System.nanoTime();
            //System.out.print(endTime-startTime);
            return false;
        }
    }


}



