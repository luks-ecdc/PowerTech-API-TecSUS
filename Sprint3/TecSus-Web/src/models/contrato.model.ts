import { Cliente } from "./cliente.model"
import { Concessionaria } from "./concessionaria.model"

export interface Contrato {
  bairro_cont?: string,
  cep_cont?: string,
  cidade_cont?: string,
  complemento_cont?: string,
  concessionaria?: Concessionaria,
  consumo_cont?: number,
  estado_cont?: string,
  instalacao_cont?: number,
  numero_cont?: string,
  rua_cont?: string,
  servico?: string,
  unidade?: Cliente
}
