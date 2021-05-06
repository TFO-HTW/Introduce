public class GgtIterativ implements GgT
{
private long a = 0;
private long b = 0;





    @Override
    public  long berechneGgT(long a, long b)
    {
        long x = a;
        long y = b;


        while (y != 0)

        {
            long z = 0;
            z = x%y;
            x = y;
            y = z;
        }


        return x;

    }

}
