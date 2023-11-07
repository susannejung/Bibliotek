import java.util.ArrayList;

public class Laener {
    private int lNr;
    private String fnavn;
    private String enavn;

    private ArrayList<Integer> laenteBoeger=new ArrayList<>();

    public Laener() {
    }

    public Laener(int lNr, String fnavn, String enavn) {
        this.lNr = lNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
    }

    public int getlNr() {
        return lNr;
    }

    public void setlNr(int lNr) {
        this.lNr = lNr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public ArrayList<Integer> getLaenteBoeger() {
        return laenteBoeger;
    }

    public void setLaenteBoeger(ArrayList<Integer> laenteBoeger) {
        this.laenteBoeger = laenteBoeger;
    }

    public void laenBog(int bogId){
        this.laenteBoeger.add(bogId);
    }

    public void afleverBog(int bogId){
        this.laenteBoeger.remove((Integer)bogId);
    }

    @Override
    public String toString() {
        return "Laener{" +
                "lNr=" + lNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", laenteBoeger=" + laenteBoeger +
                '}';
    }
}
