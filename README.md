# Estudo Spring Data Specification
O Specification nada mais é do que um padrão de projeto que foi desenvolvido por Eric Evans.

Um padrão de especificação descreve uma regra comercial que é combinável com outras regras comerciais. Nesse padrão, uma unidade de lógica de negócios herda sua funcionalidade da classe de especificação composta agregada abstrata. A classe de especificação composta tem uma função chamada IsSatisfiedBy que retorna um valor booleano. Após a instanciação, a especificação é "acorrentada" com outras especificações, criando novas especificações de fácil manutenção, ainda que altamente personalizável, lógica de negócios. Além disso, após a instanciação, a lógica de negócios pode, por meio de invocação de método ou inversão de controle , ter seu estado alterado para se tornar um delegado de outras classes, como um repositório de persistência.

# O padrão Specification no Spring-Data JPA
O padrão de projeto Specification foi elaborado para situações em que diferentes regras, usadas na seleção de um objeto, possam ser combinadas com o uso de elementos da lógica booleana. Por conta disso, o padrão vem sendo utilizado com mais frequência em operações relacionadas a banco de dados, possibilitando uma maneira mais concisa de expressar certos tipos de regras que são necessárias ao elaborar uma consulta. De modo geral, podemos entender que essas regras são formadas por elementos relacionados à construção da consulta, como a lista de argumentos de um método, os critérios e até mesmo os operadores lógicos. A partir disso, pode-se dizer que o objetivo básico desse padrão é separar cada uma dessas regras em um objeto próprio, de modo que elas possam ser combinadas a qualquer momento. A esses objetos damos o nome de predicado.

Nesse contexto, cada predicado é uma regra especifica que vai representar uma parte da instrução que compõe a consulta.

### Fonte 
Pode-se ver mais sobre o padrão Specification do link abaixo de onde foi retirado alguns textos.

http://www.devmedia.com.br/spring-data-e-o-padrao-specification-simplifique-a-construcao-e-o-reuso-de-consultas/38103