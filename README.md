Working Holiday Budget Tracker:
Ein Java-Konsolenprogramm zur Verwaltung von Guthaben und Ausgaben während meines Working-Holiday-Jahres in Japan.

Motivation
Während meines Auslandsjahres in Japan (Farm- und Hotelarbeit) wollte ich den Überblick über mein Guthaben und meine Ausgaben in verschiedenen Kategorien (Flüge, Unterkunft, Nahrung, Fortbewegung, Mitbringsel, Sonstiges) behalten. Gleichzeitig war es mein erstes eigenes Programmierprojekt, mit dem ich mir die Grundlagen von Java praktisch aneignen wollte(im Rahmen meiner Vorbereitung auf ein duales Studium der Wirtschaftsinformatik).

Funktionen
Erfassung von Startguthaben, Taschengeld und Gehalt
Erfassung von Geldgeschenken sowie Ausgaben in sechs Kategorien (Flüge, Unterkunft, Nahrung, Fortbewegung, Mitbringsel, Sonstiges)
Nutzer können pro Kategorie frei angeben, ob und wie viele Einträge sie machen möchten
Automatische Berechnung der Gesamtsumme aller Einnahmen sowie aller Ausgaben
Berechnung des verbleibenden Guthabens (Einnahmen minus Ausgaben)
Eingabeprüfung: Ungültige Eingaben (z. B. Text statt Zahl) führen nicht zum Programmabsturz, sondern zu einer erneuten Abfrage

Verwendete Java-Konzepte
Eigene Klassen und Objekte (Guthaben, Ausgaben)
Arrays zur Speicherung mehrerer Werte pro Kategorie
Eigene, wiederverwendbare Methoden zur Vermeidung von Code-Duplikation:
Rechnen.summe() – berechnet die Summe eines Arrays
Rechnen2.summe2() – befüllt ein Array mit Nutzereingaben
Fehler.sucheFehlernum() / Fehler2.sucheFehlerbol() – validieren Zahlen- bzw. Boolean-Eingaben
Fehlerbehandlung mit try/catch (InputMismatchException)
Bedingte Logik (if/else) und Schleifen (for, while)

Was ich gelernt habe
Dieses Projekt war mein erster Einstieg ins eigenständige Programmieren. Dabei habe ich unter anderem gelernt, wie man Wiederholung im Code durch eigene Methoden vermeidet, wie Nutzereingaben kontrolliert werden und wie man mit Objekten und Arrays strukturiert arbeitet.
