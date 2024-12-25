package ma.fstt.service;

import ma.fstt.entity.Absence;

import java.util.List;

public interface AbsenceService {
    Absence saveAbsence(Absence absence);
    List<Absence> findAllAbsences();

}
