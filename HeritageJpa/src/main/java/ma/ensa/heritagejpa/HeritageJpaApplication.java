package ma.ensa.heritagejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ma.ensa.heritagejpa.patient.Patient;
import ma.ensa.heritagejpa.repo.PatientRepo;



@SpringBootApplication
public class HeritageJpaApplication implements CommandLineRunner {
    @Autowired
    private PatientRepo patientRepo;
    public static void main(String[] args)
    {
        SpringApplication.run(HeritageJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepo.save(new Patient("omar","omar",null));
    }
}
