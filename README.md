# Passo a Passo para iniciar
## 1. Faça o download da IDE de sua preferência
Escolha uma IDE que se adapte ao seu estilo de trabalho. Algumas opções populares incluem IntelliJ IDEA, Eclipse, ou VS Code.

Dica:
Se você optar por usar o **IntelliJ IDEA**, ele facilita o processo de configuração do **JDK**. Durante a instalação ou criação de um novo projeto, o IntelliJ
permite que você faça o download do JDK 
diretamente pela IDE e o configure automaticamente, tornando o ambiente de desenvolvimento pronto para uso sem complicações.
### Caso escolha o **Eclipse**:
Se você optar pelo **Eclipse**, será necessário baixar o **JDK** manualmente e configurar as variáveis de ambiente.

## Tecnologias Usadas
- Java
---

## 📘 Exercício CarRental

### 
Uma locadora brasileira de carros cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela.
### Uml
#### Domain Layer Design(entities) 
<img width="800px" heigth="800px" src="Exerc-CarRental.svg" alt="CarRental-entitie"/>

#### Service Layer Design
<img width="800px" heigth="800px" src="https://github.com/user-attachments/assets/c7d72086-3911-451b-957c-d06e80cfc0e9" alt="CarRental-service"/>

## 📘 Exercício Contract
###
Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
número de meses desejado.
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o número de meses para
parcelamento do contrato, e daí gerar os registros de parcelas a serem paga (data e valor),
meses após o contrato e assim por diante.Mostrar os dados das parcelas na tela.

### Uml

#### Service Layer Design
=






