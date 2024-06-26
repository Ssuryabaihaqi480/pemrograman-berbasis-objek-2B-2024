// Kelas PersegiPanjang
public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void info() {
        System.out.println("Persegi Panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }
}
