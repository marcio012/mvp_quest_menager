create procedure SP_Respondente_count(IN varRespondente smallint(6))
  SELECT CONCAT('Nome do Respresentante é ', Respondente.nome) as Respondente
  FROM Respondente
  WHERE cd_numero_registro = varRespondente;

CALL SP_Respondente_count(2);


DELIMITER //
CREATE TRIGGER `TRG_SaidaRepresentante` AFTER DELETE ON `Respondente`
  FOR EACH ROW
BEGIN
  CALL SP_AtualizaEstoque (old.id_produto, old.qtde * -1, old.valor_unitario);
END //
DELIMITER ;