public class Piano extends AlatMusik {
    public Piano(String nama) {
        super(nama);
    }
    
    public void bunyi(String pemain, String tempat) {
        System.out.println(pemain + " sedang memainkan " + nama + " di " + tempat);
    }
}