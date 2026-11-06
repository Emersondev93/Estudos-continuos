# Estudos de JUnit 5

## Objetivo

Aprender a desenvolver testes automatizados utilizando JUnit 5 em aplicações Java.

## Conteúdos estudados

- Introdução aos testes automatizados.
- Anotação `@Test`.
- Assertions: `assertEquals`, `assertTrue` e `assertFalse`.
- Testes de exceções com `assertThrows`.
- Ciclo de vida dos testes.
- `@BeforeEach` e `@AfterEach`.

## Prática desenvolvida

Criação de uma classe `Calculadora` e implementação de testes para verificar:

- Soma.
- Subtração.
- Multiplicação.
- Divisão.
- Verificação de números positivos.
- Verificação de números pares.

## Aprendizados

Compreendi como criar testes automatizados, verificar resultados esperados e utilizar o ciclo de vida dos testes para preparar objetos antes de cada execução.

## Próximos passos

- Estudar `@BeforeAll` e `@AfterAll`.
- Aprofundar testes de exceções.
- Realizar testes de integração.
- Aplicar JUnit em projetos com JPA.

## Como executar

Com o Maven instalado e disponível no PATH, entre nesta pasta e execute:

```bash
mvn test
```
