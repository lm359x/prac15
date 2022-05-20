package org.example.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @SequenceGenerator(name = "users_seq", sequenceName =
            "users_sequence", allocationSize = 1)
    @GeneratedValue(generator = "users_seq", strategy =
            GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName = lastName;
    }
}
