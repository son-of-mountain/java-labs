package ma.fstt.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_etudiant;

    private String nom;
    private String prenom;
    private String cne;
    private String adresse;
    private String niveau;
}