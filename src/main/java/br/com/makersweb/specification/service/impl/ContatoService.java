package br.com.makersweb.specification.service.impl;

import br.com.makersweb.specification.entity.Contato;
import br.com.makersweb.specification.repository.IContatoRepository;
import br.com.makersweb.specification.service.IContatoService;
import br.com.makersweb.specification.specification.ContatoSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anderson.aristides
 */
@Service
public class ContatoService implements IContatoService {

    @Autowired
    private IContatoRepository repository;

    @Override
    public List<Contato> findBySexoMaioridade(String sexo) {
        return repository.findAll(
                Specifications
                        .where(ContatoSpecification.sexo(sexo))
                        .and(ContatoSpecification.maioridade())
        );
    }

    @Override
    public long findByGenero(String sexo) {
        return repository.count(ContatoSpecification.sexo(sexo));
    }

    @Override
    public Contato findByNomeCompleto(String nome, String sobrenome) {
        return repository.findOne(
                Specifications
                        .where(ContatoSpecification.nome(nome))
                        .and(ContatoSpecification.sobrenome(sobrenome))
        );
    }

    @Override
    public List<Contato> findByMenoridadeAndGenero(String sexo) {
        return repository.findAll(
                Specifications
                        .not(ContatoSpecification.maioridade())
                        .and(ContatoSpecification.sexo(sexo))
        );
    }

    @Override
    public List<Contato> findByIdade(int idade) {
        return repository.findAll(ContatoSpecification.idade(idade));
    }
}
