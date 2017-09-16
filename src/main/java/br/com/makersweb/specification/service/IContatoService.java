package br.com.makersweb.specification.service;

import br.com.makersweb.specification.entity.Contato;

import java.util.List;

/**
 * @author anderson.aristides
 */
public interface IContatoService {

    List<Contato> findBySexoMaioridade(String sexo);

    long findByGenero(String sexo);

    Contato findByNomeCompleto(String nome, String sobrenome);

    List<Contato> findByMenoridadeAndGenero(String sexo);

    List<Contato> findByIdade(int idade);
}
