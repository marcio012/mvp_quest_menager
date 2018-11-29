package website.marcioheleno.mvpquestmanager.model.entity;

public class Respondente {



}

/*

  `cd_numero_registro` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `cd_individuo` INT UNSIGNED NOT NULL,
  `cd_fk_tab_fonte` INT UNSIGNED NOT NULL,
  `cd_cpf` INT(11) UNSIGNED NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  `telefone_fixo` INT(30) NOT NULL,
  `telefone_cel` INT(30) NOT NULL,
  `cep` INT(8) NOT NULL,
  `cd_fk_tab_estado` INT UNSIGNED NOT NULL,
  `cd_fk_tab_cidade` INT UNSIGNED NOT NULL,
  `cd_fk_tab_municipio` INT UNSIGNED NOT NULL,
  `sexo` INT NOT NULL COMMENT 'Sexo Tipo Alpha Numerico \n1 -> Masculino\n2 -> Feminio\n3-> Indefinido',
  `data_nascimento` DATE NOT NULL,
  `cd_fk_tab_faixa_etaria` INT UNSIGNED NOT NULL,
  `cd_fk_tab_estado_civil` INT UNSIGNED NOT NULL,
  `classe_social` CHAR(1) NOT NULL COMMENT 'Tipos:\n1 -> A;\n2 -> B;\n3 -> C;\n4 -> D;\n5 -> E;',
  `cd_fk_tab_educacao` INT UNSIGNED NOT NULL,
  `cd_fk_tab_renda` INT UNSIGNED NOT NULL,
  `cd_fk_tab_profissao` INT UNSIGNED NOT NULL,
  `cd_fk_posicao_trabalho` INT UNSIGNED NOT NULL,
  `moradia` INT NOT NULL COMMENT 'Tipo:\n1 -> Casa Própria;\n2 -> Apartamemto Próprio\n3 -> Casa Alugada\n4 -> Apartemento Alugado',
  `moradia_lazer` INT NOT NULL COMMENT 'Tipo:\n\n1 -> Casa própria na praia;\n2 -> Casa própria no campo;',
  `auxiliar_do_lar` INT NOT NULL COMMENT 'Tipo:\n\n1 -> Empregada permanente;\n2 -> Diarista;',
  `possui_carro` TINYINT NOT NULL,
  `raca` INT NOT NULL COMMENT 'Tipo\n\n1 -> Branca\n2 -> Preta\n3 -> Amarela\n4 -> Parda\n5 -> Indígena\n\n',
  PRIMARY KEY (`cd_numero_registro`))
 */