
public class Persegi extends BangunDatar {
     private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }
    public void info() {
        System.out.println("Persegi dengan sisi " + sisi);
    }
}
        
        
    

