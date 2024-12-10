package org.example.godisgreat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="class_id")
    private Class class1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Column(name="name")
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


}
