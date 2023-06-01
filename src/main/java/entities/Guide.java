package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.inject.Named;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@NamedQuery(name = "Guide.deleteAllRows", query = "DELETE from Guide")
@Table(name = "Guide")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private String birthYear;

public Guide( String name, String gender, String birthYear) {
    this.name = name;
    this.gender = gender;
    this.birthYear = birthYear;
}
    @ManyToOne
    private Trip trip;

}
