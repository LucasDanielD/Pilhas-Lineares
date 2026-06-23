# 📚 Pilhas Lineares - Exercícios de Estrutura de Dados

Este repositório contém a resolução de 6 exercícios práticos focados na estrutura de dados **Pilha (Stack)**, desenvolvidos em Java. O projeto explora diferentes abordagens de implementação (arrays dinâmicos, listas encadeadas) e aplicações reais do uso de pilhas.

## 🚀 Estrutura do Projeto e Resoluções

O projeto está organizado na classe `Main` que executa as demonstrações de dois blocos principais (A e B):

### Bloco A: Implementações Baseadas em Arrays e Filas
* **Questão 1: `QueueBasedStack`** Implementação de uma Pilha utilizando duas Filas (`Queue`). Simula perfeitamente o comportamento LIFO (Last-In-First-Out) manipulando as filas no momento do `push`.
* **Questão 2: `ArrayStack`** Pilha baseada em Array com o método de redimensionamento dinâmico (`ensureCapacity`). Quando o limite de capacidade é atingido, o array dobra de tamanho automaticamente de forma transparente.
* **Questão 3: `DualStack`** Implementação inteligente de duas pilhas compartilhando o mesmo array subjacente. A Pilha A cresce a partir do índice `0` (início) e a Pilha B cresce a partir do final do array, lançando uma exceção (`StackOverflowError`) apenas se elas se encontrarem.

### Bloco B: Implementações Baseadas em Nós e Aplicações
* **Questão 4: `LinkedStack` e `Node`** Implementação de uma Pilha baseada em Lista Encadeada (nós). Garante que as operações principais de inserção (`push`) e remoção (`pop`) ocorram com complexidade de tempo **O(1)**.
* **Questão 5: `StackOperations`** Algoritmo utilitário que recebe uma pilha e um elemento alvo. Ele remove a primeira ocorrência desse elemento e restaura a ordem original dos demais itens utilizando uma pilha temporária de buffer.
* **Questão 6: `PalindromeChecker`** Aplicação prática que verifica se uma frase ou palavra é um palíndromo (ignorando espaços, pontuações e case). Utiliza uma Pilha e uma Fila em conjunto para inverter e comparar a ordem dos caracteres lidos.

## 🛠️ Tecnologias Utilizadas
* **Java** (Paradigma Orientado a Objetos)
* Estruturas de Dados Lineares (Stacks, Queues, Linked Lists, Arrays)

## 💻 Como Executar

1. Certifique-se de ter o **Java JDK** instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/luckasdz7/pilhas-lineares.git](https://github.com/luckasdz7/pilhas-lineares.git)
