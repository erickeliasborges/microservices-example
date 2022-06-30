package br.edu.utfpr.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "properties")
public class ConfigServerEntity {
    @Id
    @SequenceGenerator(
            name = "PROPERTIES_id_sequence",
            sequenceName = "PROPERTIES_id_sequence"
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "PROPERTIES_id_sequence"
    )
    private Long id;

    private String application;

    private String profile;

    private String label;

    private String key;

    private String value;

}
