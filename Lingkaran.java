
package UTS.Lingkaran;

public class Lingkaran {
    
    final double PHI = 22/7;
    double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    
    public double getLuasSetengahLingkaran(){
        return 0.5 * PHI * jari2 * jari2;
    }
}
