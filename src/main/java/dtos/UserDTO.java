package dtos;

import entities.User;
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
public class UserDTO {
    private String user_name;
    private String user_pass;
    private List<String> roles;
    private String address;
    private String phone;
    private String email;
    private String birthYear;
    private String gender;
    private List<TripDTO> trips;

    public UserDTO(User user) {
        this.user_name = user.getUserName();
        this.user_pass = user.getUserPass();
        this.roles.add("user");
        this.address = user.getAddress();
        this.phone = user.getPhone();
        this.email = user.getEmail();
        this.birthYear = user.getBirthYear();
        this.gender = user.getGender();
        this.trips = TripDTO.getDTOs(user.getTripList());
    }

    public static List<UserDTO> getDTOs(List<User> users){
        List<UserDTO> userDTOs = new ArrayList<>();
        users.forEach(user -> userDTOs.add(new UserDTO(user)));
        return userDTOs;
    }

}
