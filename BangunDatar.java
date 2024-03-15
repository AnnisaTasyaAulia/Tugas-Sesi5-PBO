
public class BangunDatar {
    int p, l, s;
    
    BangunDatar (int s) {
        this.s = s;
    }
    
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setPL (int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setS (int s) {
        this.s = s;
    }
    
    int getP(){
        return p;
    }
    
    int getL() {
        return l;
    }  
    
    int getS(){
        return s;
    }  
}
