package dtos;

import entities.Trip;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TripDTO {
    private Long id;
    private String name;
    private String date;
    private String location;
    private String duration;
    private String packingList;
    private GuideDTO guide;
    private List<UserDTO> userList = new ArrayList<>();

    public TripDTO(Trip trip) {
        this.id = trip.getId();
        this.name = trip.getName();
        this.date = trip.getDate();
        this.location = trip.getLocation();
        this.duration = trip.getDuration();
        this.packingList = trip.getPackingList();
        this.guide = new GuideDTO(trip.getGuide());
        this.userList = UserDTO.getDTOs(trip.getUserList());
    }

    public static List<TripDTO> getDTOs(List<Trip> trips){
        List<TripDTO> tripDTOs = new ArrayList<>();
        trips.forEach(trip -> tripDTOs.add(new TripDTO(trip)));
        return tripDTOs;
    }

}
