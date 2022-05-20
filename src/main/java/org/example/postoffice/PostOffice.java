package org.example.postoffice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="post_offices")
@Getter
@Setter
public class PostOffice {

    @Id
    @SequenceGenerator(name = "offices_seq", sequenceName =
            "offices_sequence", allocationSize = 1)
    @GeneratedValue(generator = "offices_seq", strategy =
            GenerationType.SEQUENCE)
    private Long id;

    @Column(name="office_name")
    private String OfficeName;
    @Column(name="city_name")
    private String CityName;

    public PostOffice(String officeName, String cityName) {
        OfficeName = officeName;
        CityName = cityName;
    }
}
