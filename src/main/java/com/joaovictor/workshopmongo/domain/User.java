package com.joaovictor.workshopmongo.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
public class User implements Serializable {
    @EqualsAndHashCode.Include
    @Id
    private String id;
    private String name;
    private String email;

}
