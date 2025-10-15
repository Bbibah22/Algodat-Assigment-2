public class Gitar extends AlatMusik {
    public Gitar(String nama) {
        super(nama);
    }
    
    public void bunyi(String pemain, String tempat) {
        System.out.println(pemain + " sedang bermain " + nama + " di " + tempat);
    }
} 
