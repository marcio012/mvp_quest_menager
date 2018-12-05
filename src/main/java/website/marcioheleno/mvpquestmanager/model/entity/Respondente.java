package website.marcioheleno.mvpquestmanager.model.entity;

import lombok.Data;


@Data
public class Respondente {

    private int id;
    private int cod;
    private String nomeFonte;
    private String cpf;
    private String nome;
    private String email;
    private String telefoneFixo;
    private String telefoneCel;
    private String cep;
    private String estado;
    private String cidade;
    private String municipio;
    private int sexo;
    private String dataNascimento;
    private String faixaEtaria;
    private String estadoCivil;
    private Character classeSocial;
    private String nivelEducacao;
    private String rendaFamilia;
    private String profissao;
    private String cargo;
    private int moradia;
    private int moradiaLazer;
    private int auxiliarDoLar;
    private Boolean possuiCarro;
    private int raca;


}

