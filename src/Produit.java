import java.util.List;
import java.util.ArrayList;

public class Produit {
    private String nom;
    private String description;
    private int prix;

    // Constructeur avec nom, description et prix
    public Produit(String nomProduit, String descriptionProduit, int prixProduit) {
        nom = nomProduit;
        description = descriptionProduit;
        prix = prixProduit;
    }

    // Constructeur avec nom et description seulement
    public Produit(String nomProduit, String descriptionProduit) {
        nom = nomProduit;
        description = descriptionProduit;
        // Prix non initialisé, donc par défaut à 0
    }

    // Méthode pour afficher les informations du produit
    public void afficher() {
        System.out.println("Nom du produit : " + nom);
        System.out.println("Description du produit : " + description);
        System.out.println("Prix du produit : " + prix);
    }

    public int getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
