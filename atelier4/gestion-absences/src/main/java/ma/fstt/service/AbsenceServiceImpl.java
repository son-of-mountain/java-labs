package ma.fstt.service;
//
import ma.fstt.entity.Absence;
import ma.fstt.repository.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsenceServiceImpl implements AbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    @Override
    public Absence saveAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    @Override
    public List<Absence> findAllAbsences() {
        return absenceRepository.findAll();
    }

    @Override
    public Optional<Absence> findById(Long id) {
        return absenceRepository.findById(id);
    }
}