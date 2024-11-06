#Exemple de Code Associé au Design Pattern Adapter

Dans cet exemple, on dispose de 3 classe "Figures" pouvant etre dessinees sur un objet ** Graphics **, chacune avec une methode spécifique :

1. ** Circle **, avec une méthode * draw(Graphics g) *;
2. ** Rectangle **, avec une methode * render(Graphics g) *;
3. ** Line **, avec une methode *dessiner(Graphics g) *;

Nous disposons aussi d'une classe ** Screen ** permettant de dessiner les différentes figures. La classe hérite de ** JPanel ** fournissant les méthodes suivantes :

```
public void add(Shape shape);
protected void painComponent(Graphics g);
```

Shape est une inteface fournissant un seul service :

```
public void paint(Graphics g);
```

On demande de réaliser une architecture basée sur le Design Pattern Adapter et la solution : * Class Adapter *.

Les classes a ajouter sont : **CirecleAdapter **, **RectangleAdapter ** et ** LineAdapter **.