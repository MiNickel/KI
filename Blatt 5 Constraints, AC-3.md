### Blatt 5: Constraints, AC-3

#### 1 Logikrätsel

V = { 1, 2, 3, 4, 5 } (Häuser 1 bis 5)



N<sub>i</sub> = { Engländer, Spanier, Norweger, Ukrainer, Japaner }

F<sub>i</sub> = { rot, gelb, blau, grün, elfenbein }

H<sub>i</sub> = { Hund, Fisch, Schnecken, Pferd, ... }

G<sub>i</sub> = { O-Saft, Tee, Kaffee, Milch, ... }

Z<sub>i</sub> = { Kools, Chesterfields, Winston, Lucky-Strike, Parliaments }



- N<sub>1</sub> = Norweger, N<sub>3</sub> = Engländer, 

- G<sub>3</sub> = Milch, G<sub>5</sub> = Kaffee, 
- F<sub>5</sub> = grün, F<sub>4</sub> = elfenbein, F<sub>2</sub> = blau, F<sub>1</sub> = gelb, F<sub>3</sub> = rot
- Z<sub>1</sub> = Kools, 
- H<sub>2</sub> = Pferd, 
- Spanier = Hund, Spanier != 2, gelb = Kools, Chesterfields != Fisch, Winston = Schnecken, Lucky-Strike = O-Saft, Ukrainer = Tee, Japaner = Parliaments



#### 3 Forward Checking und Kantenkonsistenz

/* V = { v1, v2, v3, v4, v5, v6 }



C = Dv1 != Dv



D<sub>v1</sub> = { 2 }

D<sub>v2</sub> = { 4 }

D<sub>v3</sub> = D<sub>v4</sub> = D<sub>v5</sub> = D<sub>v6</sub> = { 1, 2, 3, 4, 5, 6 } */



b)

| v1   | v2   | v3   | v4   | v5   | v6         |
| :--- | ---- | ---- | ---- | ---- | :--------- |
| 2    | 4    | 1, 6 | 1,3  | 3, 5 | 1, 3, 5, 6 |
| 2    | 4    | 1    | 3    | 5    | -          |
| 2    | 4    | 6    | 3    | 5    | -          |
| 2    | 4    | 6    | 1    | 5    | -          |
| 2    | 4    | 6    | 1    | 3    | 5          |



