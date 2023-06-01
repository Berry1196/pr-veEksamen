package dtos;

import entities.Guide;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@Setter
@ToString
public class GuideDTO {
    private Long id;
    private String name;
    private String gender;
    private String birthYear;
    private TripDTO trip;

    public GuideDTO(Guide guide) {
        this.name = guide.getName();
        this.gender = guide.getGender();
        this.birthYear = guide.getBirthYear();
        this.trip = new TripDTO(guide.getTrip());
    }
}
