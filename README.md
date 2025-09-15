# 💳 Sistema Bancário em Java

Este é um projeto simples de **sistema bancário em console**, desenvolvido em **Java** para praticar lógica de programação, estruturas de repetição e controle de fluxo.  
O programa permite simular operações básicas de uma conta bancária, como consultar saldo, depositar e transferir valores.

---

## 🚀 Funcionalidades

- Exibir os **dados do cliente** (nome, tipo de conta e saldo inicial).
- Menu interativo com as opções:
  - `1` → Consultar saldo
  - `2` → Receber valor (depósito)
  - `3` → Transferir valor (saque)
  - `0` → Sair do sistema
- Atualização em tempo real do saldo após cada operação.
- Validação para impedir transferências acima do saldo disponível.
- Loop que mantém o menu ativo até o usuário escolher **sair**.

---

## 🛠️ Tecnologias utilizadas

- **Java** (linguagem principal)
- **Scanner** (`java.util.Scanner`) para leitura de entradas do usuário
- **Estruturas de controle**:
  - `do-while` → manter o menu ativo
  - `switch-case` → tratar opções do menu
  - `if-else` → validar saldo antes de transferir
- **Interpolação de Strings** para exibir dados formatados no console
- **Saída de texto no console** (`System.out.println`)

---
