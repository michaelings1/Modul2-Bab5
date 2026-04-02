public class MainMatematika {
    public static void main(String[] args) {

        Matematika mtk = new Matematika();

        System.out.println("Penjumlahan : " + Matematika.penjumlahan(3, 3));
        System.out.println("Pengurangan : " + Matematika.pengurangan(60, 30));
        System.out.println("Perkalian : " + mtk.perkalian(7, 5));
        System.out.println("Pembagian : " + mtk.pembagian(20, 5));

        mtk.pecahan(20, 2);
    }
}