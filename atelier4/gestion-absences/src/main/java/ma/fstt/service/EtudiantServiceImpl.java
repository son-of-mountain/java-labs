package ma.fstt.service;

import ma.fstt.entity.Etudiant;
import ma.fstt.repository.EtudiantRepository;
import ma.fstt.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

public interface EtudiantServiceImpl implements EtudiantService{

    @Autowired
    private EtudiantService etudiantService;

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant){
        return etudiantRepository.save(Etudiant);
    }

    @Override
    public Optional<Etudiant> findEtudiantById(Long id){
        return etudiantService.finAll();
    }

    @Override
    public void deleteEtudiantById(Long id){
        etudiantRepository.deleteById(id);
    }



}
