package ma.ensa.heritagejpa.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.heritagejpa.rendevous.Rendezvous;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome ;
    private  String mail ;
    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Collection<Rendezvous>rendezvous;

    public Patient(String nome, String mail, Collection<Rendezvous> rendezvous) {
        this.nome = nome;
        this.mail = mail;
        this.rendezvous = rendezvous;
    }
}

