package org.example.departure;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="departures")
@NoArgsConstructor
@Getter
@Setter
public class Departure {
    @Id
    @SequenceGenerator(name = "departures_seq", sequenceName =
            "departures_sequence", allocationSize = 1)
    @GeneratedValue(generator = "departures_seq", strategy =
            GenerationType.SEQUENCE)
    private Long id;
    @Column(name="departure_type")
    private String type;
    @Column(name="departure_date")
    private String departureDate;

    public Departure(String type, String departureDate) {
        this.type = type;
        this.departureDate = departureDate;

    }
}
