package kg.megacom.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Long id;
    @NotEmpty(message = "First name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    @Pattern(regexp="^[A-Za-z]*$")
    private String name;
    @NotBlank
    @Size(min = 2, max = 18, message = "Family name must not be blank")
    @Pattern(regexp="^[A-Za-z]*$")
    private String familyName;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email pattern")
    private String email;
    @Size(min = 8, max = 20, message = "Password should be minimum 8 characters")
    @Pattern(regexp = "[a-zA-Z0-9!-&]*")
    private String password;
    private boolean isActive;

    public User(Long id, String name, String familyName, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}