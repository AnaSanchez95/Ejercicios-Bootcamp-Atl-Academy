package sanchez.ana.newsketters.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "subscriptor")
public class Subscriptor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;
}
