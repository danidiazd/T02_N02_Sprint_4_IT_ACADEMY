package cat.itacademy.barcelonactiva.diazdiaz.dani.s04.t02.n02.model.domain;

import jakarta.persistence.*;

@Entity
@Table
public class Fruita {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantitatKg")
    private int quantitatKg;

    public Fruita(){
    }

    public Fruita(String name, int quantitatKg) {
        this.name = name;
        this.quantitatKg = quantitatKg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantitatKg() {
        return quantitatKg;
    }

    public void setQuantitatKg(int quantitatKg) {
        this.quantitatKg = quantitatKg;
    }
}
