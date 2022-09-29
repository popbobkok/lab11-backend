package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AunctionItemOwnEventsDTO {
    Long id;
    String name;
    String type;
    String description;
    String location;
    String date;
    String succesfulBid;

}
