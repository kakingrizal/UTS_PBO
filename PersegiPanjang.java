
package UTS.PersegiPanjang;

public class PersegiPanjang {
    int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getLuasPersegiPanjang(){
        return panjang * lebar;
    }
}
