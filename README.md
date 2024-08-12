# Projeto Banco Digital em Java

Este projeto é uma simulação de um banco digital desenvolvido em Java, seguindo o paradigma de Orientação a Objetos (POO). O objetivo do projeto é demonstrar a criação de um sistema bancário básico com operações como criação de contas, depósitos, saques, transferências e exibição de extratos.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Banco**: Representa o banco, que gerencia as contas dos clientes.
- **Conta**: Classe abstrata que define os métodos comuns para as contas.
- **ContaCorrente**: Subclasse de `Conta` que representa uma conta corrente.
- **ContaPoupanca**: Subclasse de `Conta` que representa uma conta poupança.
- **Cliente**: Representa um cliente do banco.
- **Transacao**: Representa uma transação bancária, como depósitos e saques.

## Funcionalidades

- **Criar Conta**: O banco pode criar contas correntes e poupança para seus clientes.
- **Depósito**: Os clientes podem depositar dinheiro em suas contas.
- **Saque**: Os clientes podem sacar dinheiro de suas contas, desde que tenham saldo suficiente.
- **Transferência**: Os clientes podem transferir dinheiro entre suas contas ou para outras contas.
- **Extrato**: É possível imprimir o extrato de uma conta, mostrando o saldo atual e as operações realizadas.

## Tecnologias Utilizadas

- **Java 8**: Linguagem de programação utilizada para desenvolver o projeto.
- **Paradigma de Orientação a Objetos (POO)**: Utilização de conceitos como encapsulamento, herança e polimorfismo.

## Como Executar o Projeto

1. **Pré-requisitos**: Certifique-se de ter o Java 8 ou superior instalado em sua máquina.
2. **Clone o repositório** ou baixe os arquivos do projeto.
3. **Compile as classes Java**:
   ```bash
   javac Main.java
