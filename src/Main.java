import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de Boutique
        Boutique boutique = new Boutique();

        // Création d'instances de ProduitElectronique, ProduitAlimentaire et ProduitBoisson avec des prix
        ProduitElectronique produitElectronique = new ProduitElectronique("Ordinateur portable", "Puissant ordinateur portable pour le travail et les loisirs", 1000, 24);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("Lait", "Lait pasteurisé", LocalDate.of(2024, 3, 15), 2); // Prix du lait: 2€
        ProduitBoisson produitBoisson = new ProduitBoisson("Eau minérale", "Eau minérale naturelle", 1000, 1); // Prix de l'eau minérale: 1€

        // Ajout des produits à la boutique
        boutique.addProduit(produitElectronique);
        boutique.addProduit(produitAlimentaire);
        boutique.addProduit(produitBoisson);

        // Affichage du stock de la boutique
        boutique.afficherStock();

        // Création d'un panier
        Panier panier = new Panier();

        // Ajout des produits au panier
        panier.ajouterProduit(produitElectronique);
        panier.ajouterProduit(produitAlimentaire);
        panier.ajouterProduit(produitBoisson);

        // Affichage du prix total du panier
        System.out.println("Prix total du panier : " + panier.prixTotalPanier() + "€");
    }
}
