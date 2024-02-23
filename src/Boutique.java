import java.util.List;
import java.util.ArrayList;
public class Boutique {
    // Liste pour stocker les produits disponibles dans la boutique
    private List<Produit> produits;

    // Constructeur de la classe Boutique
    public Boutique() {
        produits = new ArrayList<>();
    }

    // Méthode pour ajouter un produit à la boutique
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    // Méthode pour obtenir la liste des produits disponibles dans la boutique
    public List<Produit> getProduits() {
        return produits;
    }

    // Méthode pour afficher le stock de la boutique
    public void afficherStock() {
        System.out.println("Stock de la boutique :");
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println(); // Ajoute une ligne vide pour séparer les produits
        }
    }
}