package com.IMADWRGH.task_manager.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "board")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    // Bidirectional ManyToMany – User is the owner (has @JoinTable)
    @ManyToMany(mappedBy = "boards")
    private List<User> users = new ArrayList<>();

    // One Board has many Swimlanes
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Swimlane> swimlanes = new ArrayList<>();
}
