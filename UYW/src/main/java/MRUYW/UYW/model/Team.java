package MRUYW.UYW.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Team")
@Getter @Setter
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tem_id")
    private int id;

    @Column(name = "tem_name", length = 100, nullable = false)
    private String name;

    @Column(name = "tem_scr", nullable = false)
    private int score;

    @Column(name = "tem_ipl", length = 100, nullable = false)
    private boolean isPlayer;

    @ManyToOne
    @JoinColumn(name = "tem_game_id", nullable = false)
    private Game game;
}
