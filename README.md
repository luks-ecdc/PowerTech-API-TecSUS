<div align="center">
<img src="https://user-images.githubusercontent.com/102330791/163039449-5e73781f-a340-45b3-a42e-28d95e476e76.png" width="150px" />
</div>

<hr>
<p align="center">  
  •<a href ="#space_invader-quem-somos-nós">   Quem somos nós </a> • 
  <a href ="#wrench-dev-team">  Dev Team </a> • 
  <a href ="#speech_balloon-desafio">  Desafio </a> •   
  <a href ="#triangular_flag_on_post-proposta">  Proposta </a>  • 
  <a href ="#flags-backlog-do-produto"> Backlog do Produto </a>   • 
  <a href ="#tv-wireframe"> Wireframe </a>  • 
  <a href ="#thumbsup-tecnologias-utilizadas">  Tecnologias Utilizadas </a> 
  
 
  
<hr>

## Hi there <img src="https://raw.githubusercontent.com/iampavangandhi/iampavangandhi/master/gifs/Hi.gif" width="20px">  </h2>

###  :space_invader: Quem somos nós:

  Somos um grupo criado para o API do 3º Semestre de Analise e Desenvolvimento de Sistemas da Faculdade Tecnológica Prof. Jessen Vidal - FATEC São José dos Campos. Estamos na busca de solucionar o problema apresentado, adquirindo experiência na metodologia de aprendizado via API, conhecimento de novas tecnologias que até então desconhecidas por nós, com isso aplicaremos esse conhecimento da melhor forma para alcançar o objetivo do grupo.

<hr> 
  
###  :wrench: Dev Team


### Lucas Eduardo Cardoso da Costa  - P.O [![GitHub Badge](https://img.shields.io/github/followers/luks-ecdc?label=luks-ecdc&style=for-the-badge&color=black&link=https://github.com/luks-ecdc)](https://github.com/luks-ecdc)<br/>

### Thamires de Souza Barbosa - S.M [![GitHub Badge](https://img.shields.io/github/followers/Thamires-S0uza?label=Thamires-S0uza&style=for-the-badge&color=black&link=https://github.com/Thamires-S0uza)](https://github.com/Thamires-S0uza)<br/>

### Carlos Henrique Benício Costa - Dev. [![GitHub Badge](https://img.shields.io/github/followers/Carlos-Henrique39?label=Carlos-Henrique39&style=for-the-badge&color=black&link=https://github.com/Carlos-Henrique39)](https://github.com/Carlos-Henrique39)<br/>

### Vinicios dos Santos Almeida - Dev. [![GitHub Badge](https://img.shields.io/github/followers/ViniciosAlmeida?label=ViniciosAlmeida&style=for-the-badge&color=black&link=https://github.com/ViniciosAlmeida)](https://github.com/ViniciosAlmeida)<br/>

### Frederico Rabelo - Dev. [![GitHub Badge](https://img.shields.io/github/followers/fredrbo?label=fredrbo&style=for-the-badge&color=black&link=https://github.com/fredrbo)](https://github.com/fredrbo)<br/>

### Lucca Santiago Almeida - Dev. [![GitHub Badge](https://img.shields.io/github/followers/LuccaSantiagoDev?label=LuccaSantiagoDev&style=for-the-badge&color=black&link=https://github.com/LuccaSantiagoDev)](https://github.com/LuccaSantiagoDev)</br>

### Dante Demétrius Pereira Silva - Dev. [![GitHub Badge](https://img.shields.io/github/followers/dantesjc?label=dantesjc&style=for-the-badge&color=black&link=https://github.com/dantesjc)](https://github.com/dantesjc)<br/>

### Nicolas Lemuel Ayres de Lima - Dev. [![GitHub Badge](https://img.shields.io/github/followers/nlemuel?label=nlemuel&style=for-the-badge&color=black&link=https://github.com/nlemuel)](https://github.com/nlemuel)<br/>


<hr>

### :speech_balloon: Desafio

<div align="center">
<img src="https://user-images.githubusercontent.com/103540033/163196828-e4bc63cc-f045-4d7f-9860-b93ac6bed193.png" width="150px" />
</div>

  A TecSUS realiza a coleta e processamento de contas de energia, água e gás para diversas empresas dos setores do atacado e varejo. Cada conta coletada precisa ter todos os seus campos digitados e salvos em banco de dados para eventuais consultas e análises técnicas/financeiras que podem trazer ao cliente oportunidades de redução de custos e alteração de contratos. Cada unidade do cliente pode possuir vários contratos (água, energia ou gás), cada contrato pode possuir uma ou mais contas (faturas de água, energia ou gás) por mês. Todos esses contratos estão ligados a uma concessionária de abastecimento.
  
 É importante observar que a interface de digitação (cadastro) das contas, deve possuir um UX que facilite a operação de visualização da conta em PDF para digitação dos campos da conta, com uso de atalhos no teclado e navegação via teclas.



###  Requisitos Funcionais

<li>Cadastros de Unidades, Concessionárias, Contratos</li>
<li>Cadastro do usuário e seus perfis (administrador, gestor e digitador)</li>
<li>Cadastro (digitação) da conta de água, energia e gás</li>
<li>Registro de log de operações (cadastro e deleção)</li>
<li>Relatório de consumo total de água mensal, anual e média</li>
<li>Relatório de consumo total de energia mensal, anual e média</li>
<li>Relatório de consumo total de gás mensal, anual e média</li>  
<li>Geração de alertas de consumo acima da média (a média pode ser definida no cadastro 
do contrato)</li>


###  Requisitos Não Funcionais

<li>Prezar pelo UX da tela de digitação das contas</li>
<li>Incluir atalhos no teclado</li>
<li>Permitir navegação entre campos por TAB ou seta</li>


### User Story

 
| Usuário        | Quer/Precisa     | Para...|
| ------|-----|-----|
| Administrador, Gestor e Digitador  	| Ter Entrada no sistema com meu usuário e senha cadastrada. Quero ter Saída do sistema. 	| Entrar na sua própria página de trabalho e também dar saída da área de trabalho, para se ter um nível de segurança dos usuários.|
| Administrador, Gestor e Digitador  	| Quero fácil acesso e simplicidade para um bom entendimento em cada tela e teclas de atalho inteligente. 	| Para ser mais ágil e objetivo no trabalho. 	|
| Administrador, Gestor e Digitador	| Quero ter um modo para mudar informações do perfil de usuário. 	| Para poder atualizar informações pertinentes ao usuário, do mesmo modo fazer a modificação de senha de acesso.	|
| Administrador	| Quero poder cadastrar as concessionárias, clientes, contratos e novos usuários "Gestor e Digitador".| Para guardar no sistema e ter acesso a essas informações diariamente.|
| Administrador	| Quero ter acesso aos registros Data/Hora (Log) de atividades de todos os usuários colaboradores.| Para analisar possíveis erros e saber qual usuário cometeu esse erro.|
| Administrador	| Quero ter acesso a todos os Cadastros de clientes, contratos e concessionárias. 	| Para modificar, excluir os dados.|
| Administrador 	| Quero ter acesso a todas as áreas de trabalho (Gestão e Digitação) além da minha área. 	|  Para saber, auxiliar e analisar todas as telas de serviços prestados.	|
| Gestor	| Quero ter acesso a pasta de todos os contratos.	| Para visualizar a situação cadastral de cada contrato.|
| Gestor	| Quero adicionar e atualizar arquivo PDF de cada contrato com seu respectivo serviço de gerenciamento.	| Para outros colaboradores poder visualizar as informações. 	|
| Gestor	| Quero analisar gráficos de consumo mensal e anual de cada contrato.	|  Para poder reportar para o cliente os dados de consumos.	|
| Gestor	| Ter acesso a todas as faturas cadastradas no sistema e poder fazer possíveis modificações se necessário.	|  Para se ter uma análise individual dos serviços. Para analisar possíveis erros e corrigi-los.	|
| Digitador 	| Quero ter facilidade ao encontrar a minha pasta de clientes	|   Para acessar e visualizar informações do contrato.	|
| Digitador	| Quero ter acesso aos arquivos PDF que o Gestor adicionar no sistema.	| Para poder fazer o trabalho de preenchimento dos valores das faturas no sistema.	|
| Digitador	| Quero ter acesso as faturas já cadastradas no sistema.|  Para fazer modificações ou exclusões caso necessário. 	|
| Digitador	| Quero ter facilidade na digitação dos campos de cada serviço (Água, Energia e Gás).	|  Para acelerar a produtividade na parte da digitação.	|
| Digitador	| Quero ter busca de faturas no sistema através de filtros mensais e anuais.	| Para acelerar a busca dos dados necessários.	|
| Digitador	| Quero ter notificações de quando um Gestor adicionar um PDF no sistema.	| Para eu poder adicionar com rapidez os dados do PDF no sistema.	|


<hr>

###  :triangular_flag_on_post: Proposta

  A PowerTech fará um sistema de cadastro com os valores de faturas de energia, água e gás, onde o cliente da TecSUS envia suas faturas para a empresa e o digitador trabalhará digitando os campos da fatura que vai ser referente ao serviço contratado com a TecSUS, pois infelizmente as faturas são geradas em PDF/IMG formato que não tem como fazer um tratamento inteligente de dados. Após feito a digitação dos dados de consumo, faremos um Dashboard de alta complexidade que vai mostrar dados para as análises mensais e anuais e médias de consumo para o setor de Gestão contatar os clientes caso seja emitida um alerta de alto consumo.
 
 
  Criaremos uma forma de que os colaboradores (Administradores) da TecSUS consigam fazer alterações e deleções em contratos de concessionárias, cliente e contratos. O colaborador Administrador também terá acesso às outras áreas (Gestão e Digitação). Os Gestores não terão os mesmos acessos que o Administrador, mas poderão fazer alterações nos campos de faturas cadastradas no sistema. O usuário gestor vai ter acesso para fazer upload de faturas de PDF/IMG para o banco de dados e ela será atrelada ao contrato do cliente e terá data para sinalizar o período da fatura, feito isso, o colaborador Digitador receberá uma notificação de fatura nova para ser cadastrada no sistema.


  O colaborador Digitador terá uma área de trabalho quando entrar no sistema poderá acessar a lista de contratos e as faturas já cadastradas no sistema, ele poderá criar novas faturas para ser cadastradas e fazer alterações caso necessário. Todos os usuários terão um log de acesso com a data e hora da atividade.
Esse sistema tem seu principal objetivo melhorar o trabalho de digitação com um melhoramento no workspace prezando a UX, evitar problemas como atrasos e acúmulos de serviço com alertas e notificação de tarefas, e um dashboard com gráficos que mostrará o consumo do cliente e também emitirá um alerta de alto consumo podendo então avisar o cliente para ele estudar uma forma de redução de custos.

  

<hr>

###  :flags: Backlog do Produto

| Tarefas  |
| ------|
| Tela Login dos Colaboradores |
| Tela de trabalho Administrador|
| Tela de trabalho Gestor|
| Tela de trabalho Digitador|
| Cadastro Cliente|
| Cadastro de Concessionaria|
| Cadastro Contrato|
| Tela de upload de PDF/IMG|
| Visualização de faturas cadastradas|
| Tela digitação de cadastro Energia|
| Tela digitação de cadastro de água|
| Tela digitação de cadastro de gás|
| Lista de unidade e contratos cadastrados|
| Lista de concessionarias cadastradas|
| Dashboard de relatórios das contas cadastradas|
| Modificação e deleção de informações|
| Relatatório de falhas|
| Emissão de alertas para os setores|
|Refinamento do Sistema (UX)|


### Planejamento
- :heavy_check_mark: Kick-off - 14/03 a 18/03 - Concluído 
- :heavy_check_mark: [Sprint 1](https://github.com/luks-ecdc/PowerTech-API-TecSUS/tree/main/Sprint1)- 25/03 a 14/04 
- [ ] [Apresentação Sprint 1] - 26/04
- [ ] [Sprint 2] - 25/04 a 15/05
- [ ] [Sprint 3]-  16/05 a 05/06


### :runner: Sprint 1

| Tarefas  |
| ------|
| Documentação e Github |
| Organização de via de comunicação |
| Organização de Daylies |
| Organização de Wireframes|
| Burndown |
| Tela Login dos Colaboradores |
| Tela de trabalho Administrador|
| Tela de trabalho Gestor|
| Tela de trabalho Digitador|


### :runner: :runner: Sprint 2

| Tarefas  |
| ------|
| Cadastro Cliente|
| Cadastro de Concessionaria|
| Cadastro de Contrato|
| Tela de upload de PDF/IMG|
| Visualização de faturas cadastradas|
| Tela digitação de cadastro Energia|
| Tela digitação de cadastro de água|
| Tela digitação de cadastro de gás|
| Lista de unidade e contratos cadastrados|
| Lista de concessionarias cadastradas|

### :runner: :runner: :runner: Sprint 3

| Tarefas  |
| ------|
| Dashboard de relatórios das contas cadastradas|
| Modificação e deleção de informações|
| Relatatório de falhas|
| Emissão de alertas para os setores|
| Refinamento do Sistema (UX)|


### Competencias Trabalhadas

<li> Levantar e Registrar Requisitos usando técnicas de Métodos Ágeis e Tradicionais </li>
<li> Documentar adequadamente DoR e DoD </li>
<li> Modelar Processos de Negócio usando técnicas VPC e BPMN </li>
<li> Planejar Desenvolvimento de Software (Backlog de Produto e Backlog de Sprint) </li>
<li> Projetar Arquitetura Lógica de Software </li>
<li> Utilizar Filas, Pilhas, Árvores ou Ordenações </li>
<li> Revisar código vendo suas Estruturas de Dados (Coding Review) </li>
<li> Implementar Aplicação usando Conceitos de Orientação a Objetos (ORM) </li>
<li> Utilizar IDE´s na implementação de Aplicação em Java </li>

<hr>

###  :tv: Wireframe

<hr>

###  :thumbsup: Tecnologias Utilizadas

*  Ferramentas: Figma, IDE Eclipse, Excel , Visual Studio Code, GitHub, Trello;
*  Meios de Comunicação da Equipe: Discord, WhatsApp;
*  Programação Back-End: Java, Springboot;
*  Programação Front-End: JavaScript, Bootstrap, HTML, CSS;
*  Banco de Dados: PostgreSQL;

<hr>




