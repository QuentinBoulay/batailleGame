# Projet Bataille de Cartes en Java

Ce projet est une implémentation du jeu de cartes traditionnel "Bataille" en Java. Il permet à deux joueurs de s'affronter en comparant la valeur des cartes tirées de leur paquet respectif.

## Structure du Projet

Le projet se compose de trois classes principales :

1. **Bataille** : Classe principale qui contient la méthode `main` pour exécuter le jeu.
2. **Joueur** : Classe représentant un joueur dans le jeu.
3. **Carte** : Classe représentant une carte à jouer.

### Classe Bataille

La classe `Bataille` initialise deux objets `Joueur` et deux `ArrayList` pour représenter les cartes et la pile (qui stocke les cartes en cas d'égalité). Elle crée ensuite un paquet de cartes, le mélange, et distribue les cartes équitablement entre les deux joueurs. Un boucle de jeu est ensuite exécutée, où chaque joueur tire une carte, compare les valeurs, et le gagnant prend les deux cartes ainsi que les cartes dans la pile, le cas échéant. En cas d'égalité, les cartes sont placées dans la pile. Si un joueur perd toutes ses cartes lors d'un tour d'égalité, les cartes de la pile sont ajoutées au paquet de l'autre joueur. Finalement, le vainqueur est déterminé en comparant le nombre de cartes restantes.

### Classe Joueur

La classe `Joueur` contient une `ArrayList` pour stocker les cartes du joueur, ainsi qu'un compteur pour suivre le nombre de cartes. Elle a également deux méthodes, `ajouteCarte` pour ajouter une carte à la main du joueur, et `tireCarte` pour tirer la carte du dessus du paquet.

### Classe Carte

La classe `Carte` contient les attributs pour la couleur et la valeur de la carte, ainsi que les méthodes pour obtenir ces attributs. Elle a également une méthode `compareCartes` qui compare la valeur des cartes de deux joueurs et met à jour leur main, la pile, et le compteur en conséquence.

## Comment le jeu fonctionne

1. Deux joueurs sont créés.
2. Un paquet de cartes est créé et mélangé.
3. Les cartes sont distribuées équitablement entre les deux joueurs.
4. Les joueurs tirent chacun une carte et comparent leur valeur.
5. Le joueur avec la carte de plus haute valeur prend les deux cartes et les ajoute à son paquet, ainsi que les cartes de la pile si elle n'est pas vide.
6. En cas d'égalité, les cartes sont ajoutées à une pile séparée.
7. Si un joueur perd toutes ses cartes lors d'un tour d'égalité, l'autre joueur reçoit toutes les cartes de la pile.
8. Le jeu continue jusqu'à ce qu'un joueur n'ait plus de cartes.
9. Le vainqueur est le joueur avec le plus de cartes à la fin du jeu.
