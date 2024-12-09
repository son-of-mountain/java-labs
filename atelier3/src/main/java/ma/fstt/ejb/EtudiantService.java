package ma.fstt.ejb;

import jakarta.ejb.Remote;
import ma.fstt.entities.Etudiant;

import java.util.List;

@Remote
public interface EtudiantService {
    void ajouterEtudiant(Etudiant etudiant);
    void supprimerEtudiant(Long id);
    void modifierEtudiant(Etudiant etudiant);
    void trouverEtudiant(Long id);
    List<Etudiant> listerEtudiants();

}
