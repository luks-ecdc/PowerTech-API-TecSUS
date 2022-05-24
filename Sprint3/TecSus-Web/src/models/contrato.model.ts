import { Cliente } from "./cliente.model"
import { Concessionaria } from "./concessionaria.model"

export interface Contrato {
  instalacao_cont?: number,
  servico?: string,
  servico_cont?: string,
  rua_cont?: string,
  bairro_cont?: string,
  cidade_cont?: string,
  concessionaria?: Concessionaria,
  estado_cont?: string,
  numero_cont?: number,
  complemento_cont?: string,
  cep_cont?: number,
  consumo_cont?: number,
  Unidade_id_CPF?: number,
  Concessionaria_nome_conces?: string,
  unidade?: Cliente
}
