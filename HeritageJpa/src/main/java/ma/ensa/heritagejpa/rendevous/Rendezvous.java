package ma.ensa.heritagejpa.rendevous;

import ma.ensa.heritagejpa.consultation.Consultation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.heritagejpa.medcine.Medcine;
import ma.ensa.heritagejpa.patient.Patient;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Temporal(TemporalType.DATE)
    private Date date ;
    @ManyToOne
    private Medcine medcine ;
    @ManyToOne
    private Patient patient;
    @OneToOne(mappedBy = "rendezvous")
    private Consultation consultation ;
}
