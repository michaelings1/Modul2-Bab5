public class MainPerusahaan {
    public static void main(String[] args) {

        Perusahaan phn = new Perusahaan();

        int hargaA = phn.hitungJaketA(105);
        int hargaB = phn.hitungJaketB(65);
        int hargaC = phn.hitungJaketC(175);

        int hargaSemua = hargaA + hargaB + hargaC;

        System.out.println("Total Harga Jaket A : " + hargaA);
        System.out.println("Total Harga Jaket B : " + hargaB);
        System.out.println("Total Harga Jaket C : " + hargaC);
        System.out.println("Total Harga Keseluruhan : " + hargaSemua);
    }
}