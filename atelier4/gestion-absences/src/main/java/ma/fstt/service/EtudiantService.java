package ma.fstt.service;

import ma.fstt.entity.Etudiant;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface EtudiantService {
    Etudiant saveEtudiant(Etudiant etudiant);
    Optional<Etudiant> findEtudiantById(Long id);
    List<Etudiant> finAllEtudiants();
    void deleteEtudiant(Long id);
}
