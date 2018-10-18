## Blatt 2: Tiefen- und Breitensuche



### Aufgabe 1

Tiefensuche:

[W]

[WE, WF, WN]	W

[WF, WN]	W, E

[WFK, WFMa, WN]	W, E, F

[WFKM, WFMa, WN]	W, E, F, K

[WFMa, WN] -> WFKM gefunden

- Backtracking bei Erfurt

![Tiefensuche](https://raw.githubusercontent.com/MiNickel/KI/Blatt2/Tiefensuche.jpg)



Breitensuche:

[W]

[WE, WF, WN]	W

[WF, WN]	W, E

[WN, WFK, WFMa]	W, E, F

[WFK, WFMa, WNM, WNS]	W, E, F, N

[WFMa, WNM, WNS, WFKM] W, E, F, N, K

[WNM, WNS, WFKM, WFMaKar]	W, E, F, N, K, Ma

[WNS, WFKM, WFMaKar] -> WNM gefunden



### Aufgabe 2

[W 170]

[WE 186+400=586, WF 217+100=317, WN 103+537=640]

[WFMa 502, WFK 850, WE 586, WN 640]

[WFMaKar 392, WFK 850, WE 586, WN 640]

[WFMaKarA 632, WFK 850, WN 640]

[WFMaKarAM 716, WFK 850, WN 640]

[WNM 270, WNS 586, WFK 850, WFMaKarAM 716] -> WNM 270



Die geschätzten Restkosten von Nürnberg nach München müssen kleiner oder gleich 167 sein, damit gilt: h(n) &#8804; h*(n)



[W 170]

[WE 586, WF 317, WN 270]

[WNM 270, WNS 568, WE 568, WF 317]  -> WNM 270



### Aufgabe 3

- h<sub>1</sub> = Anzahl aller Rechtecke, welche sich in der falschen Position befinden
- h<sub>2</sub> = Summe aller Distanzen der Rechtecke zu ihrer Zielposition. Auch Manhatten-Distanz genannt



### Aufgabe 4

h<sub>1</sub>(n) dominiert h<sub>2</sub>(n) wenn h<sub>1</sub>(n) >= h<sub>2</sub>(n) für alle n (und beide zulässig sind)



### Aufgabe 5

L<sub>1</sub> sei eine optimale Lösung mit Kosten K* und L<sub>2</sub> eine suboptimale Lösung. Für jeden Zielknoten gilt: 

h(L<sub>2</sub>) = 0

Weiterhin gilt:

K<sub>2</sub> = f(L<sub>2</sub>) = g(L<sub>2</sub>) + h(L<sub>2</sub>) = g(L<sub>2</sub>) > K*

da L<sub>2</sub> eine suboptimale Lösung ist und somit die optimalen Kosten übersteigt.

Eine Heuristik schätzt die tatsächlichen Kosten oder unterschätzt sie, also muss zusätzlich gelten:

f(x) = g(x) + h(x) &#8804; K*

Also gilt:

f(x) &#8804; K* < f(L<sub>2</sub>)

Solange sich Knoten eines optimalen Pfades in der Liste befinden, wird die suboptimale Lösung nie gewählt,















