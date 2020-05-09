# Conception : classes, héritage

### Exercice 1 : personnes
On souhaite créer une classe `Personne` possédant trois attributs :

* un prénom et un nom qui ne peuvent pas être modifiés
* un surnom qui peut être modifié mais qui peut ne pas exister

Il faudra pouvoir construire une personne avec un prénom et un nom mais également avec un prénom, un nom et un surnom. Il faut pouvoir accéder aux trois attributs et redéfinir la méthode `toString()` en tenant compte de l'existence ou non du surnom.

1. Implémenter la classe `Personne`.
2. Créer une instance de `Personne` avec un prénom et un nom seulement et l'afficher.
3. Créer deux instances de `Personne` avec un prénom, un nom et un surnom puis les afficher. Modifier le surnom de l'une d'elles et l'afficher.
4. Créer un tableau contenant les trois personnes et dans une boucle afficher le prénom de chacune.

### Exercice 2 : intervalles

On souhaite créer des objets représentant des intervalles fermés [a,b] où a et b sont des entiers. Pour simplifier, on admettra que a ≤ b. Par défaut, on devra avoir a = 0 et b = 1. Il faut des méthodes qui permettent de :

* obtenir la longueur d'un intervalle
* obtenir le milieu d'un intervalle
* savoir si un réel est ou non dans l'intervalle
* construire le symétrique d'un intervalle par rapport à 0
* afficher l'intervalle sous la forme [a,b]

Tester en créant plusieurs intervalles (dont un par défaut) et en appliquant les méthodes.

### Exercice 3 : triangles
On souhaite créer des objets représentant des triangles. Un triangle est caractérisé par ses trois longueurs non modifiables qui sont des nombres réels positifs. Pour le(s) constructeur(s), on admettra que le triangle existe, c'est à dire que le plus grand des trois nombres passés en paramètre est plus petit que la somme des deux autres. 

On souhaite également représenter des triangles rectangles que l'on caractérisera par les longueurs des deux côtés de l'angle droit. 

L'aire d'un triangle est donné par la formule de Héron (Héron d'Alexandrie, 1er siècle ap JC) dans laquelle a, b et c représentent les longueurs des côtés :

    p = (a+b+c)/2 et S = sqrt(p(p-a)(p-b)(p-c))
	
Il faut des méthodes qui permettent de :

* savoir si un triangle est équilatéral
* savoir si un triangle est rectangle
* obtenir l'aire d'un triangle
* obtenir l'hypoténuse d'un triangle rectangle

1. Implémenter les classes nécessaires.
2. Construire le triangle dont les côtés ont pour longueur 36, 77 et 85. Donner son aire et tester s'il est rectangle.
3. Construire le triangle rectangle dont les côtés de l'angle droit ont pour longueur 28 et 45. Donner la longueur de l'hypoténuse.
4. On souhaiterait créer un triangle connaissant un côté c et les deux angles ⍺ et β qui le bordent. Grâce à la formule des sinus, on sait trouver les deux autres côtés : 

        a = c.sin(⍺)/sin(⍺ + β) et  b = c.sin(β)/sin(⍺ + β)
  
Comment faire ? Pensez aux dates et heures ?
	