package website.marcioheleno.mvpquestmanager.model.entity;

import lombok.Data;


@Data
public class Respondente {

    private int cdNumeroRegistro;
    private int cdIndividuo;
    private int cdFkTabFonte;
    private String cdCpf;
    private String nome;
    private String email;
    private String telefoneFixo;
    private String telefoneCel;
    private String cep;
    private int cdFkTabEstado;
    private int cdFkTabCidade;
    private int cdFkTabMunicipio;
    private int sexo;
    private String dataNascimento;
    private int cdFkTabFaixaEtaria;
    private int cdFkTabEstadoCivil;
    private Character classeSocial;
    private int cdFkTabEducacao;
    private int cdFkTabRenda;
    private int cdFkTabProfissao;
    private int cdFkPosicaoTrabalho;
    private int moradia;
    private int moradiaLazer;
    private int auxiliarDoLar;
    private Boolean possuiCarro;
    private int raca;


}

