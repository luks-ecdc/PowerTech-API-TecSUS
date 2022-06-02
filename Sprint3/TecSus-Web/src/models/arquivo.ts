export interface Arquivo {
  id?: number,
  links?: {
    rel?: true,
    href?: true,
  },
  nome?: string,
  tamanho?: string,
  tipo?: string
}
