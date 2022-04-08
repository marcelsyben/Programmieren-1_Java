class Student{
    String vorname ="Eva";
    String nachname ="Mustermann";
    int matrikelnummer = 232323;
    
    Student(String vorname, String nachname
    , int matrikelnummer) {
        this.vorname = vorname;
        this.nachname= nachname;
        this.matrikelnummer = matrikelnummer;
    }
    String getVorname() {
        return vorname;
    }
    void setVorname(String vorname) {
        