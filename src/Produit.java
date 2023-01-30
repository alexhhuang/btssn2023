import java.util.Scanner;

public class Produit {
    private String code_produit;
    private String nom;
    private double prix_unitaire;
    private int qtestock;
    private int stock_secu;

    public Produit(String code_produit, String nom, double prix_unitaire, int qtestock, int stock_secu) {

    }

    public void approvisionnement() {
    }

    public void ventestock(int qtestock) {
    }

    public void setQtestock(int val) {
        this.qtestock = qtestock;
    }

    public void setPrix_unitaire(int val) {
        this.prix_unitaire = prix_unitaire;
    }

    public void setStock_secu(double val) {
        this.stock_secu = stock_secu;
    }

    public void getCode_produit() {
    }

    public void getNom() {
    }

    public void getPrix_unitaire() {
    }

    public void getQtestock() {
    }

    public void getStock_secu() {
    }


}