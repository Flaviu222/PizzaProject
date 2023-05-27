package org.fasttrackit.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer price;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private TablePizza tableOf;
}
