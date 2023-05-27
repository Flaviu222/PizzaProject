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
public class TablePizza {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private int tableNumber;

}
