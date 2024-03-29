package Planes.vao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data @NoArgsConstructor
public class User {

    public User(Planes.dto.User dto) {
        setName(dto.name());
        setSurname(dto.surname());
        setEmail(dto.email());
        setPassword(dto.password());
        setCountry(dto.country());
    }

    public User(String name, String surname, String email, String password, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.country = country;
    }

    public void updateFrom(Planes.dto.User dto) {
        setName(dto.name());
        setSurname(dto.surname());
        setEmail(dto.email());
        setPassword(dto.password());
        setCountry(dto.country());
    }

    public Planes.dto.User toDto() {
        return new Planes.dto.User(
                getId(),
                getName(),
                getSurname(),
                getEmail(),
                getPassword(),
                getCountry());
    }

    @Id
    protected String id;
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String country;

}
