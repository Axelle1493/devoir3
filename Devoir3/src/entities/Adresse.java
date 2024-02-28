package entities;

public class Adresse {
    private int idAdresse;
    private String ville;
    private String quartier;
    private int numVilla;
    public Adresse() {
    }
    public int getIdAdresse() {
        return idAdresse;
    }
    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public int getNumVilla() {
        return numVilla;
    }
    public void setNumVilla(int numVilla) {
        this.numVilla = numVilla;
    }
    
}
