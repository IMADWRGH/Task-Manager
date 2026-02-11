package com.IMADWRGH.task_manager.entities;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "app_user")   // 'user' is a reserved keyword in many databases
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String firstName;

    @Column(length = 100, nullable = false)
    private String lastName;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(length = 200, nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean emailVerified = false;

    // Owner side of ManyToMany with Board
    @ManyToMany
    @JoinTable(
            name = "user_board",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "board_id")
    )
    @OnDelete(action = OnDeleteAction.CASCADE)   // delete join row when user/board is deleted
    private List<Board> boards = new ArrayList<>();

    // One User can be assigned to many Cards
    @OneToMany(mappedBy = "assignee")
    private List<Card> cards = new ArrayList<>();
}
