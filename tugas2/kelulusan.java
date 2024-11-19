/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
    public class kelulusan {//modifier

    int[] Hilmi = {80, 70, 90};
    int[] Brandon = {70, 90, 90};
    int[] Agus = {30, 50, 60};

    public double rata(int[] nilai) {//parameter
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;//fungsi
    }

    public static boolean ceklulus(double rata) {//static
        return rata >= 70;
    }

    public void hasil() {//method
        double ratahilmi = rata(Hilmi);
        double ratabrandon = rata(Brandon);
        double rataagus = rata(Agus);

        System.out.println("Nama            : Hilmi");
        System.out.println("Rata-Rata Nilai : " + ratahilmi);
        System.out.println("Keterangan      : " + (ceklulus(ratahilmi) ? "LULUS" : "TIDAK LULUS"));
        System.out.println("\n");

        System.out.println("Nama            : Brandon");
        System.out.println("Rata-Rata Nilai : " + ratabrandon);
        System.out.println("Keterangan      : " + (ceklulus(ratabrandon) ? "LULUS" : "TIDAK LULUS"));
        System.out.println("\n");
        
        System.out.println("Nama            : Agus");
        System.out.println("Rata-Rata Nilai : " + rataagus);
        System.out.println("Keterangan      : " + (ceklulus(rataagus) ? "LULUS" : "TIDAK LULUS"));
    }

    public static void main(String[] args) {
        kelulusan sk = new kelulusan();
        sk.hasil();
    }
}
 