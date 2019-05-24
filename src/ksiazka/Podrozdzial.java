package ksiazka;


class Podrozdzial extends JednostkaWzorcowa {
    
    protected java.util.List<JednostkaWzorcowa> skladowe = new java.util.ArrayList();
    
    
    public Podrozdzial(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wypiszInfo(int numer1, int numer2) {
        short numer3 = 1;
        
        
       
        System.out.println(" " + nazwa + "    ");
        for (JednostkaWzorcowa j : skladowe) {

            System.out.print("          " + numer1 + "." + numer2 + "." + numer3 + ")  ");

            j.wypiszInfo(numer1, numer2);
            numer3++;

        }
    }

}
