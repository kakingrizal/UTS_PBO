import UTS.PersegiPanjang.PersegiPanjang;
import UTS.Lingkaran.Lingkaran;

public interface HitungLuasArsiran {
    public static void main(String[] args) {
        double LuasArsir;
        
        PersegiPanjang PP = new PersegiPanjang(12, 7);
        Lingkaran lingkaran = new Lingkaran(7);
        
        LuasArsir = PP.getLuasPersegiPanjang() - lingkaran.getLuasSetengahLingkaran();
        System.out.println("Jadi, Luas area yang berwarna ungu adalah " + LuasArsir + " cm");
    }
}
