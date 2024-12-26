package ma.fstt.controller;


import ma.fstt.entity.Absence;
import ma.fstt.entity.Etudiant;
import ma.fstt.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.saveEtudiant(etudiant);
    }

    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable Long id){
        return etudiantService.findEtudiantById(id);
    }

    @GetMapping
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.finAllEtudiants();
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiant(id);
    }


}
