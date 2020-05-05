package model;

import javax.persistence.*;

@Entity
@Table(name = "documents", schema = "tables")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_document")
    private Long id;

    @Column
    private String name;

    @Column
    private int number;

    public Document() {
    }

    public Document(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int age) {
        this.number = age;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + number +
                '}';
    }
}
