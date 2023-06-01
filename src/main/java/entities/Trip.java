package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@NamedQuery(name = "Trip.deleteAllRows", query = "DELETE from Trip")
@Table(name = "Trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String date;
    private String location;
    private String duration;
    private String packingList;

    public Trip( String name, String date, String location, String duration, String packingList ) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.duration = duration;
        this.packingList = packingList;
    }
    @ManyToMany
    private List<User> userList = new ArrayList<>();

    @ManyToOne
    private Guide guide;

}
