# Bewerberaufgabe - SuperDuperMarkt

Der Kunde SuperDuperMarkt benötigt eine Anwendung zur Verwaltung von Produktien, deren Preise, deren Qualität und 
gegebenenfalls Verfallsdaten.

Produkte werden normalerweise beim Einräumen ins Regal in der Anwendung erfasst und ändern anschließend täglich 
ihre Qualität und eventuell ihren Preis. Bei Unterschreitung eines bestimmten Qualitätsniveaus oder Erreichen des 
Verfallsdatums werden Produkte aus dem Regal entfernt bzw. entsorgt. Die Anwendung soll den Regalpflegenden dabei 
helfen, Produkte auszupreisen und alte Produkte rechtzeitig zu entfernen, sodass keine minderwertige Ware in den 
Reagelen liegt.

## Ein Produkt hat folgende Eigenschaften
* Bezeichnung
* Qualität
* Verfallsdatum
* Preis

## Verarbeitungsregeln

Es gibt allgemeine sowie spezielle Regeln für Käse und Wein. Diese sind in der folgenden Tabelle detailliert 
beschrieben.

| Allgemein                                                                  | Käse                                                                                                                                           | Wein                                                                                                                               |
|----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| Jedes Produkt hat einen fixen, nicht variablen Grundpreis.                 | Käse benötigt ein minimales Qualitätsniveau von 30, um im Regal eingeräumt zu werden, bzw. wird ausgeräumt sobald die Qualität unter 30 sinkt. | Für Wein wird jedes nicht-negative Qualitätsniveau akzeptiert.                                                                     |
| Der Tagespreis wird durch Qualität bestimmt: Grundpreis +0,10€ * Qualität  | Käse hat ein Verfallsdatum, das zwischen 50 und 100 Tagen in der Zukunft liegt.                                                                | Wein verliert nicht an Qualität, sondern gewinnt ab dem Stichtag alle 10 Tage +1 Qualität hinzu, bis die Qualität 50 erreicht ist. |
|                                                                            | Käse verliert täglich einen Qualitätspunkt.                                                                                                    | Wein verfällt nicht.                                                                                                               |
|                                                                            | Käse hat einen tagesaktuellen Preis.                                                                                                           | Weine verändern ihren Pres nicht, nachdem sie ins Regal eingeräumt wurden.                                                         |

## Wichtig
Mechanismen zur Dateneingabe sind __NICHT__ gefordert. Produkte können als Liste/ Array/ etc. im Code hinterlegt sein, um die verschiedenen Anforderungen zu demonstrieren.

## Pflicht
* Erstelle eine Konsolenanwendung.
* Gib zunächst die Produkte deines Sortiments und deren Startwerte aus.
* Gib iterativ für alle fort folgenden Tage eine Übersicht aller Produkte aus. Die tägliche Übersicht soll Namen, 
  Preis, Qualität und die Information, ob ein Produkt entsorgt werden muss, beinhalten.

## Kür (optional)
* Arbeite testorientiert (nicht "Test-Driven") und schreibe Tests für die Verarbeitungsregeln.
* Verwende passende Muster des "objektorientierten" Designs.
* Begründe deine Wahl verwendeter Design Patterns.
* Lies Produktdaten aus einer `.csv`-Datei ein.
* Gestalte die Anwendung modular, sodass neue Produkttypen und alternative Datenquellen für den Import der 
  Produktdaten integriert werden können, ohne den zentralen Steuerungs-Code zu modifizieren.
* Erstelle ein Modul für einen neuen Produkttypen (gestalte das Produkt und die Verarbeitungsregeln selbst).
* Erstelle ein Modul für eine weitere Datenquelle (SQL).
* Gestalte die Anwendung so, dass sie im laufenden Betrieben modular um zuvor genannte Module erweitert werden kann.
