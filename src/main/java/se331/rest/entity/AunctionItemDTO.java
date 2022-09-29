package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AunctionItemDTO{
    Long id;
    String succesfulBid;
    String location;
    String date;
    List<AunctionItemOwnEventsDTO> ownEvents = new ArrayList<>();
}

