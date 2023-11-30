package com.example.aula.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.aula.demo.Model.Pessoa;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController{
    /* rotas, acesso de urls */

     List <Pessoa> listaPessoa = new ArrayList<>();

    @GetMapping("/list") 
        public ModelAndView listarPessoas(){ // retorna a visualização
            ModelAndView mv = new ModelAndView("list"); // add modelAnd... as pessoas que estão na lista pessoas
            mv.addObject("listaPessoa", listaPessoa);
            return mv;
        }


    @GetMapping ("/create")
    public String create(){
        return "create"; // chama o hmtl criado

    }

    @PostMapping("/create")
    public String pegarInformacoesHtml (Pessoa pessoa){
        System.out.println("Meu nome é: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        //Pessoa pessoa1 = new Pessoa();
        //pessoa1.setNome("Gleice");
        //pessoa1.setTelefone("4002-8922");
        // coloca o id automatico de acordo com o tamanho da lista 
        int id = listaPessoa.size() +1; // add array pessoa ao objeto pessoa
        listaPessoa.add(new Pessoa(id, pessoa.getNome(), pessoa.getTelefone())); //add o id automatico de acordo com o tamanho da lista
        return "redirect:/list"; 

    }
}

