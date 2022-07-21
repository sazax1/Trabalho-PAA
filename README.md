# Trabalho-POO

1) Crie a classe abstrata Pokemon contendo, além do atributo de nome, os atributos: HP,
Ataque, Defesa e Velocidade. Crie o construtor e os gets e sets correspondentes.
Crie um método abstrato habilidadeEspecial que não recebe nenhum parâmetro;  

2) Crie as classes PokemonTipoAgua, PokemonTipoFogo e PokemonTipoGrama herdando
de Pokemon.  

Para o tipo fogo, crie o método do tipo void LançaChamas que apenas imprime
“nomeDoPokemon utilizou Lança Chamas”.  
Sobrescreva o método habilidadeEspecial para imprimir “Aumenta potência de ataque
quando luta sobre a grama” e aumentar Ataque para +10.  

Para o tipo água, crie o método do tipo void JatoDeÁgua que apenas imprime
“nomeDoPokemon utilizou Jato de Água”.  
Sobrescreva o método habilidadeEspecial para imprimir “Aumenta HP quando sofre ataque
de água” e aumenta o HP em +10;  

Para o tipo grama, crie o método do tipo void FolhaNavalha que apenas imprime
“nomeDoPokemon utilizou Folha Navalha”.  
Sobrescreva o método habilidadeEspecial para imprimir “Aumenta defesa quando luta
sobre a grama” e aumenta Defesa para +10;  

3) Crie as interfaces Voador, Lutador e Venenoso.  
A interface Voador exige a implementação dos métodos do tipo void e sem parâmetros
“voar” e “aterrisar”.  
A interface Lutador exige a implementação dos métodos do tipo void e sem parâmetros
“socar” e “chutar”.  
A interface Venenoso exige a implementação dos métodos do tipo void e sem parâmetros
“ácido” e “gás venenoso”.  

4) Crie a classe Bulbasauro, que é um Pokemon do tipo Grama e Venenoso.  

5) Crie a classe Charizard, que é um Pokemon do tipo Fogo e Voador.  

6) Crie a classe Poliwrath, que é um Pokemon do tipo Água e Lutador.  

7) Crie a classe Blaziken, que é um Pokemon do tipo Fogo e Lutador.  

8) Crie a classe Zubat, que é um Pokemon do tipo Venenoso e Voador.  

9) Crie a classe PokeAgenda representando os Pokemons que você já capturou.  
A classe deve conter como atributos:  
  a) um objeto do tipo HashSet chamado listaCompleta;  
  b) e um objeto do tipo HashSet para cada um dos tipos como o nome listaTipo
(onde “Tipo” corresponde ao tipo especificado)  
  c) Crie um método addTipo para cada tipo especificado (Fogo, Água, Grama,
Voador, Venenoso) e que recebe como parâmetro um objeto do mesmo tipo. Esse método
deve adicionar o objeto do parâmetro na lista completa e depois na lista específica de seu
tipo.  
  d) Crie o método “mostrar” que recebe como parâmetro um Pokémon de qualquer
tipo e mostra seus dados básicos ou imprima “Pokemon não encontrado” caso este
Pokemon não esteja contido no conjunto.  
  e) Crie o método mostrarTodos para mostrar os dados básicos de cada pokémon
contido na listaCompleta.  
  f) Crie um método mostraTipo para cada tipo especificado. O método deve mostrar
o nome do Pokemon.  

10) Crie a classe TrabalhoPOO que contenha o método main. Instancie um objeto da
classe PokeAgenda e adicione nela dois Pokemons de cada espécie (dois Bulbasauros, dois
Charizards, etc…). Faça com que o programa mostre seus pokémons por tipos separados e
depois a lista completa de pokémons capturados. Ordene a lista de Pokemons por nome e
mostre em seguida a lista completa agora ordenada de maneira alfabética.  


## 🛠️ Construído com

* [NetBeans](https://netbeans.apache.org/)

## ✒️ Autores

* [Joao Vitor](https://github.com/sazax1)
