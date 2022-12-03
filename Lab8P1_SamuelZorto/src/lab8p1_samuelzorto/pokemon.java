package lab8p1_samuelzorto;


public class pokemon {
    public String nomb;
    public int hitP;
    public int atk;
    public int lck;

    public pokemon(String nomb, int hitP, int atk, int lck) {
        this.nomb = nomb;
        this.hitP = hitP;
        this.atk = atk;
        this.lck = lck;
    }

    

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getHitP() {
        return hitP;
    }

    public void setHitP(int hitP) {
        this.hitP = hitP;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getLck() {
        return lck;
    }

    public void setLck(int lck) {
        this.lck = lck;
    }
    
    
}
