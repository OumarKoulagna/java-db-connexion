package projet_fevrier6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> maListe = new ArrayList<>();
        
        // Connexion à la base de données
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ionis?user=root&password=Root");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM etudiant")) {
            
            System.out.println("Connexion à la base de données réussie.");
            
            // Récupération des étudiants
            while (rs.next()) {
                Etudiant etudiant = new Etudiant(
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("mail"),
                    rs.getInt("age")
                );
                //Ajout de l'étudiant à la liste
                maListe.add(etudiant);
            }
            
        } catch (SQLException e) {
            System.err.println("Erreur SQL: " + e.getMessage());
            System.err.println("Code erreur: " + e.getErrorCode());
            System.err.println("État SQL: " + e.getSQLState());
            e.printStackTrace(); // Afficher la pile d'exécution pour plus de détails
        } catch (Exception e) {
            System.err.println("Une erreur inattendue est survenue: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Affichage de la liste des étudiants
        System.out.println("\nListe des étudiants récupérés:");
        for (Etudiant etudiant : maListe) {
            System.out.println(etudiant.toString());
        }
        
    }
}