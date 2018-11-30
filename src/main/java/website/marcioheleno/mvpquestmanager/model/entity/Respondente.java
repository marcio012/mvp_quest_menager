package website.marcioheleno.mvpquestmanager.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Respondente {

    private int cdNumeroRegistro;
    private Integer cdIndividuo;
    private Integer cdFkTabFonte;
    private String cdCpf;
    private String nome;
    private String email;
    private String telefoneFixo;
    private String telefoneCel;
    private String cep;
    private Integer cdFkTabEstado;
    private Integer cdFkTabCidade;
    private Integer cdFkTabMunicipio;
    private Integer sexo;
    private Date dataNascimento;
    private Integer cdFKTabFaixaEtaria;
    private Integer cdFkTabEstadoCivil;
    private Character classeSocial;
    private Integer cdFkTabEducacao;
    private Integer cdFkTabRenda;
    private Integer cdFkTabProfissao;
    private Integer cdFkPosicaoTrabalho;
    private Integer moradia;
    private Integer moradiaLazer;
    private Integer auxiliarDoLar;
    private Boolean possuiCarro;
    private Integer raca;


}

