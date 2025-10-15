public abstract class AlatMusik {
    protected String nama;

    public AlatMusik(String nama) {
        this.nama = nama;
    }

    public abstract void bunyi(String pemain, String tempat);
    
    public String getNama() {
        return nama;
    }
}