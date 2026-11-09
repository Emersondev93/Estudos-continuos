# ☕ Estudos de JPA e Hibernate

Repositório dedicado aos meus estudos, exercícios e projetos práticos sobre persistência de dados em Java utilizando a especificação **Jakarta Persistence (JPA)** e o framework **Hibernate**.

---

## 🎯 Objetivos de Aprendizado

- [ ] Configuração de projetos Java com Maven e `persistence.xml`
- [ ] Mapeamento Objeto-Relacional (ORM) básico (`@Entity`, `@Table`, `@Id`, `@Column`)
- [ ] Geração de chaves primárias (`GenerationType.IDENTITY`, `SEQUENCE`, `UUID`)
- [ ] Operações CRUD básicas com `EntityManager`
- [ ] Ciclo de vida das entidades (Transient, Managed, Detached, Removed)
- [ ] Relacionamentos entre entidades (`@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`)
- [ ] Estratégias de carregamento (`FetchType.LAZY` vs `FetchType.EAGER`) e operações em cascata (`CascadeType`)
- [ ] Consultas com JPQL (Jakarta Persistence Query Language) e Criteria API
- [ ] Controle de transações e concorrência (Lock Otimista e Pessimista)

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 21
- **Gerenciador de Dependências:** Apache Maven
- **ORM / Persistência:** Hibernate / Jakarta Persistence (JPA)
- **Banco de Dados:** MySQL
- **Testes:** JUnit

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Antes de começar, certifique-se de ter instalado em sua máquina:
- **JDK 21** ou superior
- **Apache Maven**
- **MySQL Server** (ou um container Docker rodando o MySQL)

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com
   cd seu-repositorio
   ```

2. **Configure o Banco de Dados:**
    - Crie um banco de dados no seu MySQL (ex: `estudos_jpa`).
    - Abra o arquivo `src/main/resources/META-INF/persistence.xml` e ajuste as propriedades de URL, usuário e senha conforme o seu ambiente local:
   ```xml
   <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/estudos_jpa"/>
   <property name="jakarta.persistence.jdbc.user" value="seu_usuario"/>
   <property name="jakarta.persistence.jdbc.password" value="sua_senha"/>
   ```

3. **Compile o projeto e baixe as dependências:**
   ```bash
   mvn clean compile
   ```

4. **Execute os testes ou as classes principais** diretamente pela sua IDE favorita (IntelliJ IDEA, Eclipse ou VS Code).

---

## 📚 Materiais de Apoio

- [Documentação Oficial do Hibernate ORM](https://hibernate.org)
- [Especificação Jakarta Persistence](https://jakarta.ee)
- Curso / Conteúdos de referência: AlgaWorks

---

## 📝 Licença

Este projeto é apenas para fins de estudo e aprendizado pessoal.
