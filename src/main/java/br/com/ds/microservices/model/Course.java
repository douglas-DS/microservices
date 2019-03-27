package br.com.ds.microservices.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Douglas Souza on 27/03/2019
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Course implements AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotNull(message = "The field 'title' is necessary")
    @Column(nullable = false)
    private String title;

}
