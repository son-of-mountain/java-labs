package ma.fstt.service;

import ma.fstt.entity.Etudiant;
import ma.fstt.repository.EtudiantRepository;
import ma.fstt.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Optional<Etudiant> findEtudiantById(Long id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public List<Etudiant> finAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(Long id) {
         etudiantRepository.deleteById(id);
    }
}