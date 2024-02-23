import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {
    private LocalDate dateExpiration;

    public ProduitAlimentaire(String nom, String description, LocalDate dateExpiration, int prix) {
        super(nom, description, prix);
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Date d'expiration : " + dateExpiration);
    }
}

