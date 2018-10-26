#### Blatt 3: Lokale Suche, GA



##### 1 Modellierung von GA

######  a)

Kodierung: zufällige Reihenfolge einer Rundreise wobei, jedes Element außer dem ersten und dem letzten nur einmal vorkommen darf (z. B [3, 4, 5, 2, 8, 6, 7, 1, 9, 3])

Fitnessfunktion: In Abhängigkeit von der Gesamtdistanz einer Rundreise -> 1/Kosten wobei Kosten=Gesamtdistanz

Selektion: Hier kann die Fitnessproportionale Selektion (Roulette Wheel Selection) genutzt werden, so dass die Individuen mit einer guten Fitness auch eine gute Auswahlwahrscheinlichkeit erhalten

Crossover: Wähle einen zufälligen Kreuzungspunkt, der erste Teil ist identisch zum alten Teil und der zweite Teil wird so bestimmt, dass der zweite Vektor vom Anfang bis zum Ende gescannt wird und immer die Zahl in den zweiten Teil eingefügt wird, welche noch nicht im ersten Teil verfügbar ist

​	Beispiel:		3	6	5	2	8	7	9	4	1	10	3

​				7	8	10	2	1	3	6	9	4	5	7

​	der erste Vektor wird nach der 7 geteilt, also entsteht folgender neue Vektor

​				3	6	5	2	8	7	10	1	9	4	3

​	beim durchgehen des zweiten Vektors beim durchsuchen nach Zahlen die noch nicht im ersten Teil des 	

​	ersten Vektors vorkommt

Mutation: zwei Arraypositionen werden innerhalb eines Individuums vertauscht, Auswahl des Paares ist zufällig



###### b)

Kodierung:



