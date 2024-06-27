package ma.ensa.heritagejpa.repo;

import ma.ensa.heritagejpa.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
    // Your repository methods
}
