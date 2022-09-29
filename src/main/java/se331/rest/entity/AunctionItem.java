package se331.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AunctionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String description;
    String type;

    @OneToMany(mappedBy = "item")
    @Builder.Default
    List<Bid> bid = new ArrayList<>();

    @OneToOne
    Bid successfulBid;
}

