# Utilisation de classes des API Java

Les API (Application Programming Interfaces) Java contiennent un nombre extrêmement important de classes. Dans les exercices proposés, vous aurez à utiliser des constructeurs, des méthodes, des attributs de quelques-unes de ces classes. 

Vous devez avoir ouverte dans un navigateur la documentation de ces API. Elle est consultable à l'URL [https://docs.oracle.com/javase/8/docs/api/]() et téléchargeable à l'URL [http://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html]()

### Exercice 1 : chaînes de caractères

On considère la phrase suivante :
 
*Before you start coding, it’s a good idea to sit down and think about your problem*

1. Créer une instance de la classe \texttt{String} avec le contenu ci-dessus.
2. Déterminer le nombre de caractères.
3. Déterminer le premier et le dernier caractère.
4. Écrire la chaine en majuscule.
5. Déterminer la première position du caractère "r".
6. Déterminer le nombre de caractères "a". On pourra au préalable créer un tableau constitué des caractères de la chaine.

### Exercice 2 : classes permettant de représenter des données primitives avec des objets

En plus des types primitifs, il existe des classes qui leur correspondent. Ce sont :

| Types primitifs | Classes correspondantes |
|:----------------|:------------------------|
| byte | Byte |
| short | Short |
| int  | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

Ces classes enveloppes (appelées aussi `wrappers`) sont nées d'un besoin de pouvoir encapsuler des types primitifs dans des objets afin de pouvoir par exemple les mettre dans une collection. Les six premières classes enveloppes numériques ont des méthodes semblables qui sont `parseXXX`, `toString` et `valueOf`.

A l'aide de la classe `Integer` :

1. À partir de la chaîne de caractère `"1580"`, créer le type primitif entier de même valeur et l'objet de type `Integer` de même valeur
2. À partir de l'entier 45789, construire la chaine de caractères représentant la même valeur
3. Écrire l'entier 14526 sous forme binaire et hexadécimale

### Exercice 3 : tableaux dynamiques

La classe `ArrayList` permet de gérer des tableaux dynamiques et possèdent des méthodes pour les manipuler. Les instances de la classe `ArrayList` ne peuvent contenir que des objets. Il faudra donc penser éventuellement à utiliser les `wrappers` vus à l'exercice précédent si l'on manipule des nombres.

1. Créer une instance vide nommée `list1` de la classe `ArrayList` contenant des entiers et lui ajouter successivement les entiers 4, 7 et 3 puis l'afficher.
2. Créer le tableau d'entiers suivants : `int[] tab = {1,6,9,3,5}`. Créer une deuxième instance nommée `list2` de `ArrayList` contenant les éléments du tableau puis l'afficher.
3. Ajouter `list2` à `list1` puis afficher `list1`.
4. Déterminer si `list1` contient l'entier 3 et si c'est le cas, donner l'index de la première occurence.
5. Donner l'élément d'index 5
6. Supprimer le deuxième élément de `list1`
7. Donner la taille de `list1`
8. On souhaite trier `list1` dans l'ordre croissant ou décroissant. Pour cela, on peut utiliser la méthode `sort`. Avec celle-ci, il faut passer un objet d'une classe qui implémente l'interface `Comparator`. Java sait trier des nombres et des chaines de caractères et cette interface \texttt{Comparator} possède deux méthodes de classe nommées `naturalOrder()` et `reverseOrder()` qui répondent à notre souhait. Trier `list1` dans l'ordre décroissant et l'afficher.

### Exercice 4 : dates et heures
La gestion des dates et des heures est un problème difficile dans les langages. Avec Java 8 vient une nouvelle API de gestion du temps nommée `java.time`. Dans l'exercice suivant, vous allez utiliser quelques classes.

1. Créer une instance de la classe `LocalDateTime` représentant le moment présent. ⍺⍺⍺β
2. À l'aide de la classe `DateTimeFormatter`, créer un format de date et heure sous une forme permettant un affichage comme par exemple " samedi 11 février 2017 14:35 " et afficher le moment présent.
3. Ajouter 2 heures et 45 minutes à ce moment présent et afficher le résultat.
4. Créer une instance de la classe `LocalDate` représentant votre date de naissance puis créer un format d'affichage et afficher votre date de naissance.
5. À l'aide de la classe `Period`, déterminer votre âge en nombre d'années, de mois et de jours.