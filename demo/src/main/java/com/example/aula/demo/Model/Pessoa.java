package com.example.aula.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

    public Pessoa (int id, String telefone, String nome) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setId(id);

    }

    public Pessoa(){

    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String nome;
    private String telefone;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}