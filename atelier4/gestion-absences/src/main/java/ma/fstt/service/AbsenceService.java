package ma.fstt.service;

import ma.fstt.entity.Absence;

import java.util.List;
import java.util.Optional;

public interface AbsenceService {
    Absence saveAbsence(Absence absence);
    List<Absence> findAllAbsences();
    Optional<Absence> findById(Long id); // trouver l'absence par Id

}
