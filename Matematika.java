public class Matematika {

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak bisa dibagi 0!");
            return 0;
        }
        return (double) a / b;
    }

    public void pecahan(int pembilang, int penyebut) {
        int fpb = mencariFPB(pembilang, penyebut);

        pembilang /= fpb;
        penyebut /= fpb;

        System.out.println("Hasil sederhana: " + pembilang + "/" + penyebut);
    }

    private int mencariFPB(int a, int b) {
        if (b == 0) return a;
        return mencariFPB(b, a % b);
    }
}