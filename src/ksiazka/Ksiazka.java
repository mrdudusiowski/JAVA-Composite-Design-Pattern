package ksiazka;


public class Ksiazka extends JednostkaWzorcowa {

    protected java.util.List<JednostkaWzorcowa> skladowe = new java.util.ArrayList();
    
    public Ksiazka(String nazwa) {
        super(nazwa);
    }
    
    void dodaj(JednostkaWzorcowa j) {
        skladowe.add(j);
    }
    
    
    @Override
    public void wypiszInfo(int numer1, int podnumer2) {
        System.out.println(nazwa);

        for (JednostkaWzorcowa j : skladowe) {
            System.out.print("  " + numer1 + ") ");

            j.wypiszInfo(numer1, podnumer2);
            numer1++;
        }
    }
    
}
