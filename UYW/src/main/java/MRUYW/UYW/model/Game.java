package MRUYW.UYW.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Game")
@Getter @Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gam_id")
    private int id;

    @Column(name = "gam_date", nullable = false)
    private LocalDateTime date;

    @OneToMany(mappedBy = "game")
    private List<Team> details;

}
