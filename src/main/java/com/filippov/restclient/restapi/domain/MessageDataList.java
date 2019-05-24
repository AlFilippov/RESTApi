package com.filippov.restclient.restapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class MessageDataList {
    private String professionOnePart ;
    private String professionTwoPart ;
    @ElementCollection
    private List<Message> messageOnePart;
    @ElementCollection
    private List<MessageTwo> messageTwoPart;

}
