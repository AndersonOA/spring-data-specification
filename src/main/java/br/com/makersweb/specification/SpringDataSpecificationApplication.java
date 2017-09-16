package br.com.makersweb.specification;

import br.com.makersweb.specification.repository.IContatoRepository;
import br.com.makersweb.specification.service.IContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataSpecificationApplication implements CommandLineRunner {

    @Autowired
    private IContatoRepository repository;
    @Autowired
    private IContatoService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataSpecificationApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        //System.out.println("|-- Lista todos por nome --|");
        //repository.findByNome("Bruna").forEach(System.out::println);

        //System.out.println("|-- Lista todos por sobrenome --|");
        //repository.findBySobrenome("Silva").forEach(System.out::println);

        //System.out.println("|-- Lista todos de maioridade --|");
        //repository.findByMaioridade().forEach(System.out::println);

        //System.out.println("|-- Lista todos por genero --|");
        //repository.findBySexo("F").forEach(System.out::println);

        //System.out.println("|-- Lista todos por genero e maioridade --|");
        //repository.findBySexoMaioridade("F").forEach(System.out::println);
        //service.findBySexoMaioridade("F").forEach(System.out::println);

        //System.out.println("|-- Total de genero masculino --|");
        //System.out.printf("%s contatos são do sexo masculino\n", service.findByGenero("M"));
        //System.out.printf("%s contatos são do sexo feminino\n", service.findByGenero("F"));

        //System.out.println("|-- Lista por nome completo --|");
        //System.out.println(service.findByNomeCompleto("Bruna", "Ribeiro"));

        //System.out.println("|-- Lista todos de menoridade --|");
        //service.findByMenoridadeAndGenero("M").forEach(System.out::println);

        System.out.println("|-- Lista por idades de forma ascendente --|");
        service.findByIdade(34).forEach(System.out::println);
    }

}
