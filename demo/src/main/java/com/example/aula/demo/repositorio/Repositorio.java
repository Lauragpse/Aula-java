package com.example.aula.demo.repositorio;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.aula.demo.Model.Pessoa;
 
//Importar @Repository do Spring
@Repository
//alterem de class para interface
//Extendam a classe CrudRepository do Spring
//Importem a classe Pessoa
public interface Repositorio extends CrudRepository<Pessoa,Integer> {
 
   
   
}
