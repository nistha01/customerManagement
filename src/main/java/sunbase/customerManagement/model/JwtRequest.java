package sunbase.customerManagement.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
public class JwtRequest {
    private String userName;
    private String password;

    public String getUsername() {
        return this.userName;
    }
}
