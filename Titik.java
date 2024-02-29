public class Titik {
    float absis;
    float ordinat;
    static float counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading konstruktor Titik
    // Titik (float absis, float ordinat){
    //     this.absis = absis;
    //     this.ordinat = ordinat;
    //     this.counterTitik = counterTitik++;
    // }

    public Titik (float newAbsis, float newOrdinat){
        absis = newAbsis;
        ordinat = newOrdinat;
        counterTitik++;
    }

    public void setAbsis(float a){
        absis = a;
    }
    public void setOrdinat(float o){
        ordinat = o;
    }
    public float getAbsis(){
        return absis;
    }
    public float getOrdinat(){
        return ordinat;
    }

    public static float getCounterTitik(){
        return counterTitik;
    }

    public float getJarakPusat(){
        return (float) Math.sqrt(absis*absis+ordinat*ordinat);
    }

    public void refleksiX(){
        this.ordinat = -(this.ordinat);
    }

    public void refleksiY(){
        this.absis = this.absis*(-1); 
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -(this.ordinat));
    }

    public Titik getRefleksiY(){
        // return new Titik(-(this.absis), this.ordinat);
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    }
}