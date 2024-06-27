package ma.ensa.heritagejpa.consultation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.heritagejpa.rendevous.Rendezvous;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String rapportdecosultation ;
    @OneToOne
    private Rendezvous rendezvous;
}

