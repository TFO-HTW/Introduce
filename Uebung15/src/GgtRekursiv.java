public class GgtRekursiv implements GgT {
    @Override
    public long berechneGgT(long a, long b) {
        if (a % b == 0)
            return b;
        else
            return berechneGgT(b, a % b);

    }
}



