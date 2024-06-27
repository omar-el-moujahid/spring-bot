package ma.ensa.heritagejpa.medcine;

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
public class Medcine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome ;
    private  String mail ;
    private  String specialete;
    @OneToMany( mappedBy = "medcine")
    private Collection<Rendezvous> rendezvous;
}
