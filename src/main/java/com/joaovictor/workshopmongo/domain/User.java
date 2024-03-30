package com.joaovictor.workshopmongo.domain;


import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User implements Serializable {
    @EqualsAndHashCode.Include
    private String id;
    private String name;
    private String email;

}
