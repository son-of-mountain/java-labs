package ma.fstt.controller;


import ma.fstt.entity.Absence;
import ma.fstt.service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/absences")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    @PostMapping
    public Absence createAbsence(@RequestBody Absence absence){
        return absenceService.saveAbsence(absence);
    }

    @GetMapping
    public List<Absence> getAllAbsences(){
        return absenceService.findAllAbsences();
    }

    @PutMapping
    public Absence updateAbsence(@PathVariable Long id, @RequestBody Absence updatedAbsence){
        return absenceService.findById(id).map( absence -> {
            absence.setDate(updatedAbsence.getDate());
            absence.setMotif(updatedAbsence.getMotif());
            return absenceService.saveAbsence(absence);
        }).orElseThrow(()->new RuntimeException("Absence non trouvee avec l'id: "+id));
    }
}
