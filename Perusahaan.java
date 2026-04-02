public class Perusahaan {

    public final int jaketA = 100000;
    public final int jaketB = 125000;
    public final int jaketC = 175000;

    public int hitungJaketA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 95000;
        } else {
            return jumlah * jaketA;
        }
    }

    public int hitungJaketB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 120000;
        } else {
            return jumlah * jaketB;
        }
    }

    public int hitungJaketC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 160000;
        } else {
            return jumlah * jaketC;
        }
    }
}