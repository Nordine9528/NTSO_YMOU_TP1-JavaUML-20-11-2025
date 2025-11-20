# NTSO_YMOU_TP1-JavaUML-20-11-2025
Réalisé par Nordine TSOULI et Yeemen MOUBOUNGOULOU MANIONGUI. Il consiste à créer un petit moteur de jeu 2D permettant d’afficher un donjon en console, de gérer des collisions simples entre objets et de modéliser différents éléments du décor et des personnages avec une architecture orientée objet.

# TP Java – Petit moteur de jeu et donjon

## 1. Présentation du projet

Ce TP a été réalisé avec mon binôme dans le cadre d’un cours de programmation Java. Il consiste à créer un petit moteur de jeu 2D permettant :

* d’afficher un donjon en console de manière statique,
* de modéliser des éléments du décor et des personnages,
* de gérer des collisions simples entre les objets.

Le projet est principalement pédagogique et sert à comprendre la conception orientée objet, l’héritage, et les notions de physique élémentaire en 2D.

## 2. Organisation des classes

### 2.1 HitBox

* Modélise un rectangle pour gérer les collisions.
* Attributs : `x`, `y`, `width`, `height`.
* Méthode clé : `boolean intersect(HitBox anotherHitBox)` vérifiant si deux hitboxes se chevauchent.

### 2.2 TileManager

* Représente les tuiles du donjon.
* Attributs : `height` et `width` (pixels par tuile).
* Méthodes : getters pour accéder à la hauteur et largeur des tuiles.

### 2.3 Dungeon

* Représente le donjon avec un tableau 2D de caractères.
* Attributs : `char[][] map`, `height`, `width`, `TileManager tileManager`, tableau dynamique de `Things`.
* Méthodes :

  * `displayDungeonInConsole(HitBox hero)` : affiche le donjon en console avec le héros positionné.
  * `fillThingsArray()` : génère les objets `Things` et `SolidThings` en fonction de la map.

### 2.4 Cascade d’héritage – Things

* **Things** : objets intangibles du décor (sol, décor).
* **SolidThings** : objets solides avec `HitBox` (murs, coffres).
* **AnimatedThings** : objets animés (torches, effets).
* **DynamicThings** : objets animés et mobiles avec `speedX` et `speedY`.

## 3. Fonctionnalités implémentées

* Initialisation d’un donjon avec des murs (`W`) et des espaces (` `).
* Affichage du donjon en console.
* Gestion de collisions simples entre HitBoxes.
* Création d’une structure modulaire d’objets du donjon avec héritage.

## 4. Comment tester

* **Test de HitBox** : vérifier que la méthode `intersect` fonctionne correctement avec différents rectangles.
* **Test de TileManager** : s’assurer que les getters renvoient les bonnes dimensions.
* **Test de Dungeon** :

  * Initialiser un donjon avec `new Dungeon(height, width, tileManager)`.
  * Appeler `displayDungeonInConsole(hero)` et vérifier visuellement la position du héros.
  * Utiliser le debugger pour vérifier que les objets du tableau `Things` sont correctement instanciés.

## 5. Exécution

1. Compiler toutes les classes :

```
javac *.java
```

2. Lancer le programme principal (`TestC_Dungeon` ou autre main de test) :

```
java TestC_Dungeon
```

3. Observer les sorties dans la console et vérifier le comportement du héros et des objets.

## 6. Remarques

* Ce projet est une base pour des TP plus avancés de jeu 2D.
* La visualisation en console est volontairement simple pour se concentrer sur la logique et les collisions.
