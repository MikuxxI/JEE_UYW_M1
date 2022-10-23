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
@Table(name = "Ressource")
@Getter @Setter
public class Ressource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rsc_id")
    private int id;

    @Column(name = "rsc_name", length = 100, nullable = false)
    private String name;

    @Column(name = "rsc_uri")
    private String uri;

    @Column(name = "rsc_quest", length = 200, nullable = false)
    private String question;

    @Column(name = "rsc_type", nullable = false)
    private String type;

    
    public String getFullUri(){
        return this.uri + this.name;
    }

    public String getExtensionLessName(){
        return this.name.split("\\.")[0];
    } 
}
