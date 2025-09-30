# 📚 DIO - Bootcamp Portfolio (Conteúdo, Curso, Mentoria e Dev)

Este repositório reúne um **portfólio de aprendizado em Java e Programação Orientada a Objetos (POO)**, inspirado tanto pela estrutura de Bootcamps da [DIO](https://www.dio.me/) quanto pelos meus próprios estudos em **arquétipos, guerra cibernética e inteligência artificial** (documentados em arquivos como `GhostProtocol.md`, `CyberCthulu.Faca-seALuz.md` e `CN6.csv`).

---

## 🚀 O Projeto

O sistema foi construído em **Java**, utilizando **herança, polimorfismo e abstração** para modelar uma estrutura de Bootcamp:

- **Classe `Conteudo`**  
  Classe abstrata que representa qualquer conteúdo educacional. Define o **XP padrão** e obriga as subclasses a implementarem seu próprio cálculo de experiência.

- **Classe `Curso`**  
  Especialização de `Conteudo`. Possui uma **carga horária** que multiplica o XP.  
  → Aprendi como aplicar **sobrescrita de métodos** para customizar o cálculo de experiência.

- **Classe `Mentoria`**  
  Também herda de `Conteudo`. Aqui o XP é fixo: o valor base + bônus.  
  → Exercício de como **variar comportamentos em subclasses**.

- **Classe `Dev`**  
  Representa o desenvolvedor inscrito no Bootcamp.  
  - Pode se inscrever em cursos/mentorias.  
  - Pode **progredir** (avançando no aprendizado).  
  - Calcula o **total de XP acumulado**.  
  → Foi aqui que trabalhei **coleções (`Set`)**, **Optional**, **stream API** e **boas práticas de equals/hashCode**.

---

## 🧠 O que aprendi

1. **Programação Orientada a Objetos (POO)**  
   - Abstração, herança, encapsulamento e polimorfismo.  
   - Estrutura de classes reutilizáveis e organização de código.

2. **Java Moderno**  
   - Uso de `Optional` e `ifPresentOrElse`.  
   - API de Streams (`mapToDouble`, `sum`).  
   - Pattern matching em `instanceof`.

3. **Boas Práticas**  
   - Código mais limpo e conciso (refatoração dos getters/setters).  
   - Comentários documentados no estilo Javadoc/PEP8.  
   - Uso de `Set` para evitar duplicações e preservar ordem lógica (`LinkedHashSet`).

---

## 🔮 Conexão com os Arquivos CSV/MD

Os arquivos adicionais (`GhostProtocol.md`, `CyberCthulu.Faca-seALuz.md`, `CN6.csv`) foram usados como **inspiração conceitual** para entender e aplicar Java de forma mais profunda:

- **Ghost Protocol (Arquétipos Junguianos)**  
  Cada classe do projeto pode ser vista como um **arquétipo**:  
  - `Conteudo` → o **Sage** (sabedoria base).  
  - `Curso` → o **Warrior** (disciplina e repetição).  
  - `Mentoria` → o **Magician** (transforma conhecimento em prática).  
  - `Dev` → o **Rebel** (desafia, progride e transforma XP em poder).  

- **CyberCthulu (Caos e Luz)**  
  Assim como no texto, Java mostrou-se a **infraestrutura sólida** para manipular sistemas:  
  - Permite criar **ordem a partir do caos** (organizar o aprendizado em classes).  
  - Funciona como o **grimório pesado** que garante robustez.

- **CN6.csv (Mapeamento técnico)**  
  Mostra como é possível **modelar dados complexos em estruturas bem definidas**.  
  O mesmo raciocínio foi aplicado em Java: transformar linhas de conhecimento em **objetos com comportamento**.

---

## 🎯 Conclusão

Este portfólio é mais que um simples exercício:  
- É a síntese entre **aprendizado técnico em Java** e **exploração conceitual** de como sistemas (educacionais, cibernéticos ou arquetípicos) podem ser modelados.  
- Aprendi não apenas a escrever código, mas a enxergar a **programação como narrativa**: cada classe é um papel, cada método é uma ação, e o Bootcamp é a arena onde tudo se conecta.  

> *"Não criamos a maconha, mas fumamos a fumaça de servidores queimados."* – Ghost Protocol  

