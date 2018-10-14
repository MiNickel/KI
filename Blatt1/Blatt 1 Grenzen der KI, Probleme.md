## Blatt 1: Grenzen der KI, Probleme

### Aufgabe 1

###### Dame und Go:

- Computer kann alle Spielstellungen ausrechnen (bei Dame sind rund 500 Millionen Billionen Stellungen möglich)

- Monte-Carlo Tree Search für Go, Computer spielt aus einer Stellung heraus möglichst viele Partien mit Zufallszügen zu Ende, die Farbe die häufiger gewinnt hat logischerweise die bessere Stellung. Dadurch kann eine Stellung bewertet werden und macht dadurch eine sinnvolle Baumsuche möglich

###### Echtzeit-Übersetzung

- Datenbank mit Wertepaaren

- wird besser je länger er benutzt wird, ständiges Lernen der KI

- erkennen von Grammatik

###### Autonomie

- Sensoren (Radar, Video, Laser) und Aktoren (Motorsteuerung, Lenkung, Bremsen)
- über Sensordaten wird ein Bild der Umwelt geformt, wodurch automatische Fahrentscheidungen an die Aktoren weitergeleitet werden können
- große Datenmenge für die verschiedenen Verkehrszeichen nötig (Maschinelles Lernen)
- bereits heute einsetzbar (siehe Tesla etc)

###### Geschirrspüler

- Sensoren erkennen Position des Geschirrs und sprechen die Maschinen zum Ausräumen an

###### Gesichtserkennung

- Vermessung bestimmter Merkmale (Nase, Augen, Mund etc)

###### Tischfußball

- Computer verfolgt über Kamera das Geschehen und kann so Entscheidungen treffen

###### Komponieren von Musik

- KI liest andere Werke und lernt so dazu (Deep Learning)
- Eingaben werden über neuronale Netze verarbeitet

### Aufgabe 2

- Welches Handeln ist in Unfallsituationen moralisch zu rechtfertigen? (autonomes Fahren), Deutsche Verkehrsgerichtstag diskutierte über diese Dilemmasituationen

  http://moralmachine.mit.edu/

  ![MIT-Moral Machine](https://raw.githubusercontent.com/MiNickel/KI/Blatt1/Blatt1/bilder/MIT.jpg)

- KI kann die Arbeit eines Menschen ersetzen (Destabilisierung der Gesellschaft)

- Was passiert wenn KIs zu mächtig werden?  (Regulierungen)

- das Fachwissen kann durch Künstliche Intelligenz erweitert werden

- Wenn wir mehr Aufgaben an Computer übergeben, verlieren wir vielleicht wichtige Fähigkeiten

- kann eine KI politische Entscheidungen treffen? (Fragen der Ideologie und Ethik)


### Aufgabe 3

https://botster.lentech.org/ :

![Botster](https://raw.githubusercontent.com/MiNickel/KI/Blatt1/Blatt1/bilder/wtf.png)

https://www.cleverbot.com/ :

![cleverbot](https://raw.githubusercontent.com/MiNickel/KI/Blatt1/Blatt1/bilder/cleverbot.png)

http://www.electric-code.co.uk/talk2me.html :

![fbb71f15d61b4bc35df09067827a590a](https://raw.githubusercontent.com/MiNickel/KI/Blatt1/Blatt1/bilder/electric-code.png)

- zwei Arten von Chatbots: 1. Bots, die nach Regeln funktionieren, 2. Bots, die Machine Learning nutzen

### Aufgabe 4

Zustände:


| Ufer 1          | Pferd         | Ufer 2          |
| --------------- | ------------- | --------------- |
| 3 Elben, 3 Orks | -             | -               |
| 2 Elben, 2 Orks | 1 Elbe, 1 Ork | -               |
| 3 Elben, 1 Ork  | 2 Orks        | -               |
| 2 Elben, 2 Orks | 1 Ork         | 1 Elbe          |
| 2 Elben, 2 Orks | 1 Elbe        | 1 Ork           |
| 3 Elben, 1 Ork  | 1 Ork         | 1 Ork           |
| 2 Elben, 1 Ork  | 2 Orks        | 1 Elbe          |
| 2 Elben, 1 Ork  | 1 Elbe, 1 Ork | 1 Ork           |
| 2 Elben, 1 Ork  | 1 Ork         | 1 Elbe, 1 Ork   |
| 1 Elbe, 1 Ork   | 1 Elbe, 1 Ork | 1 Elbe, 1 Ork   |
| 1 Elbe, 1 Ork   | 1 Ork         | 2 Elben, 1 Ork  |
| 1 Ork           | 1 Ork, 1 Elbe | 2 Elben, 1 Ork  |
| 1 Elbe          | 2 Orks        | 2 Elben, 1 Ork  |
| 1 Ork           | 1 Ork         | 3 Elben, 1 Ork  |
| 1 Ork           | 1 Elbe        | 2 Elben, 2 Orks |
| 1 Elbe          | 1 Ork         | 2 Elben, 2 Orks |
| -               | 2 Orks        | 3 Elben, 1 Ork  |
| -               | 1 Elbe, 1 Ork | 2 Elben, 2 Orks |
| -               | -             | 3 Elben, 3 Orks |

SA = 1. Zeile, SE = letzte Zeile

Aktionen:

Pferd += 1 Elbe, 1 Ork; += 2 Orks; += 1 Elbe; += 1 Ork

Ufer 2 += 1 Elbe; += 1 Ork; += 2 Orks; += 1 Elbe, 1 Ork

![Problemgraph](https://raw.githubusercontent.com/MiNickel/KI/Blatt1/Blatt1/bilder/Problemgraph.jpg)