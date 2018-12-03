package website.marcioheleno.mvpquestmanager.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAdmin {


    int id;
    String username;
    String password;
    String role;
}
