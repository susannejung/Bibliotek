public class Bog {
    private int bogId;
    private String titel;
    private String forfatter;
    private boolean udlant;
    private String udlaensDato;
    private int lId;

    

    public Bog() {
    }

    public Bog(int bogId, String titel, String forfatter) {
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udlant = false;
        this.udlaensDato = "";
        this.lId = 0;
    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int bogId) {
        this.bogId = bogId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public boolean isUdlant() {
        return udlant;
    }

    public void setUdlant(boolean udlant) {
        this.udlant = udlant;
    }


    public String getUdlaensDato() {
        return udlaensDato;
    }

    public void setUdlaensDato(String udlaensDato) {
        this.udlaensDato = udlaensDato;
    }

    public int getLaener() {
        return lId;
    }

    public void setLaener(int lId) {
        this.lId = lId;
    }

    public void udlaenBog(int lId,String udlaensDato){
        this.lId=lId;
        this.udlaensDato=udlaensDato;
        udlant=true;
    }

    public void afleverBog(){
        lId=0;
        this.udlaensDato="";
        udlant=false;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udlant=" + udlant +
                ", udlaensDato='" + udlaensDato + '\'' +
                ", laener=" + lId +
                '}';
    }
}

