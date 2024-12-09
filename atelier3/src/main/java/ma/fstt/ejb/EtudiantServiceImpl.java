package ma.fstt.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ma.fstt.entities.Etudiant;

import java.util.List;

@Stateless
public class EtudiantServiceImpl implements EtudiantService {

    @PersistenceContext(unitName = "Etudiant")
    private EntityManager entityManager;

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        entityManager.persist(etudiant);
    }

    @Override
    public void supprimerEtudiant(Long id) {

    }

    @Override
    public List<Etudiant> listerEtudiants() {
        return entityManager.createQuery("SELECT e FROM Etudiant e", Etudiant.class).getResultList();
    }

    @Override
    public void modifierEtudiant(Etudiant etudiant) {
        entityManager.merge(etudiant);
    }

    @Override
    public void trouverEtudiant(Long id) {

    }

}
