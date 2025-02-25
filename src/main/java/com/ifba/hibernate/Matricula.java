package com.ifba.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula_id")
    private int id;
    
    private String curso;
    private LocalDateTime dataMatricula;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")  
    private Aluno aluno;

    @Override
    public String toString() {
        return "matrícula_id: " + this.id + ", Curso: " + this.curso + ", Aluno: " + this.aluno.getNome();
    }
}