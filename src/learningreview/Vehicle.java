package learningreview;

public class Vehicle {
    private String color;
    private double consumption;
    private double drivenDistance;
    private double travelCosts;

    // Hier sollte Consumption in den Konstruktor gegeben werden
    // und dann gesetzt werden
    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Der Parameter "consumption" müssten Sie hier nicht an die Methode übergeben
    // Der Verbauch sollte in der InstanzVariable "this.consumption" abgespeichert sein
    // Der Verbrauch eines Autos sollte sich nicht ändern,
    // ähnlich wie zum Beispiel "Farbe" oder "Maximal Geschwindigkeit"
    public double getConsumption(double consumption, double drivenDistance) {
        // Sollte wie folgt aussehenen:
        // consumption = (this.consumption/100) * drivenDistance;
        // return consumption
        // Wichtig: "this." wird verwendet wenn wir die Instanzvariable der Klasse verwenden wollen.
        // In diesem Fall den Verbrauch auf 100km welchen wir in der Variable "consumption"
        // in Zeile 5 abspeichern
        // In dieser Methode erstellen Sie eine neue Variable "consumption" diese beschreibt den
        // Verbrauch auf der gesamten Strecken. Dies ist eine neue Variable, die wir nur
        // innerhalb der Methode erstellen um das Ergebnis der Rechnung ab zu speichern.
        // Deswegen hier nicht mit "this." die Instanz Variable referenzieren.
        // Das Problem ist hier auch Sie würden beim zweiten Ausführen dieser Methode ganz komische
        // Ergebnise bekommen, da sie die Variable "this.consumption" (Beschreibt den Verbrauch auf 100km)
        // überschreiben mit dem Wert den Sie hier berechnen.
        // Der Verbauch auf 100km sollte sich aber nicht ändern nur weil der Verbauch auf einer Strecke x berechnet wird.
        this.consumption = (consumption/100) * drivenDistance;
        return this.consumption;
    }

    // Der erste Parameter "consumption" sollte dieser Methode hier nicht benötigen. (Siehe Kommentar von oben)
    // Der dritte Parameter "travelCosts" beschreibt den Benzinpreis, hier könnte man sich einen
    // besseren Namen überlegen, vielleicht: "oilPrice"?
    public double getTravelCosts(double consumption, double drivenDistance, double travelCosts) {
        // Gleiches Problem wie in der Methode oben. Hier keine Variable
        // "this.travelCosts" erstellen sondern "travelCosts", da es sich hier nicht um eine
        // Instanzvariable handelt (Variable die das jeweilige Fahrzeug beschreibt) sondern
        // Um eine Variable, welche nur solange "lebt" wie die Methode noch andauert.
        // Beim zweiten Aufruf dieser Methode muss die Variable "travelCosts" wieder neu erstellt werden.
        this.travelCosts = ((consumption/100)*drivenDistance)*travelCosts;
        return this.travelCosts;
    }
}
