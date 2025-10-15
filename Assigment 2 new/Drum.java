public class Drum extends AlatMusik {
    public Drum(String nama) {
        super(nama);
    }
    
    public void bunyi(String pemain, String tempat) {
        System.out.println(pemain + " sedang memukul " + nama + " di " + tempat);
    }
}