package MRUYW.UYW.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Administrator")
@Getter @Setter
public class Administrator {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adm_id")
    private int id;

    @Column(name = "adm_log", length = 100, nullable = false)
    private String login;

    @Column(name = "adm_pwd", length = 100, nullable = false)
    private String password;
}
