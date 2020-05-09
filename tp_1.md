# Bases
### Exercice 1 : opérations
Écrire un programme qui transforme une durée donnée en secondes en heures, minutes et secondes. Vous pourrez tester avec 127452s = 35h 24min 12s
### Exercice 2 : itération
Écrire un programme qui affiche les carrés des entiers de 3 à 8.
### Exercice 3 : lecture au clavier, itération et tableau
On demande à un utilisateur le nombre de réels qu’il souhaite saisir au clavier. On lit ces éléments et on les place dans un tableau. Ensuite, on affiche les éléments du tableau.

### Exercice 4 : trouver le jour
Soit ∆=(j,m,a) la représentation d'une date où j est le jour, m le mois et a l'année. On désigne par
E(x) la partie entière d'un réel x. On définit les entiers t, b, c et d par :

t = m+10 si m ≤ 2  et m-2 sinon

b = a-1 si m ≤ 2 et a sinon

c = E(b/100) et d = b-100c

Alors, la formule suivante, due à Zeller :

w = j + E(2,6t-0,2) +d + E(d/4) + E(c/4) + 5c

permet de calculer le jour de la semaine correspondant à la date ∆. En effet, le reste de la division
entière de w par 7 est égal au numéro du jour de la semaine (0 pour Dimanche jusqu'à 6 pour Samedi).

Écrire un programme qui à partir du numéro du jour (de 1 à 31), du numéro du mois (de 1 à 12), de l'année (par exemple 1992) affiche le jour de la semaine.

### Exercice 5 : la série harmonique
Écrire un programme qui détermine le plus petit entier n tel que 

1 + 1/2 + 1/3 + ... + 1/n ≥ l

On pourra prendre pour l = 10

### Exercice 6 : entiers parfaits
Un entier est dit parfait s'il est égal à la somme de ses diviseurs autres que lui-même. Ses diviseurs sont aussi appelés diviseurs stricts ou aliquotes. Par exemple 6 est parfait car 6 = 1 + 2 + 3. Écrire un programme qui cherche tous les entiers parfaits de 2 à 9000.

### Exercice 7 : crible d'Eratosthène
Le crible d'Eratosthène est une méthode qui permet d'obtenir la liste des entiers premiers inférieurs à $n$. On rappelle qu'un entier est premier s'il n'est divisible que par 1 et par lui-même. On procède de la manière suivante :

* on prend la liste de tous les entiers de 1 à $n$ et on raye le 1 qui n'est pas premier
* on raye tous les multiples de 2 sauf 2
* on recherche, à partir du dernier nombre pour lequel on a rayé les multiples, le premier nombre non rayé
    k et on raye tous les multiples de k sauf k lui-même
* on répète le traitement jusqu'au dernier entier k vérifiant k ≤ sqrt(n)

A la fin, les nombres non rayés sont les nombres premiers inférieurs à n. En utilisant le crible d'Eratosthène, écrire un programme qui affiche la liste de tous les entiers premiers inférieurs à $n$. On pourra prendre n = 300
