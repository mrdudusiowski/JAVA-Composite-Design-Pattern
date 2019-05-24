/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksiazka;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
class Rozdzial extends JednostkaWzorcowa {

    protected ArrayList<JednostkaWzorcowa> skladowe = new ArrayList();

    public Rozdzial(String nazwa) {
        super(nazwa);
    }

    public void dodaj(JednostkaWzorcowa j) {
        skladowe.add(j);
    }

    @Override
    public void wypiszInfo(int numer1, int numer2) {
         
        System.out.println(nazwa);
        
        for (JednostkaWzorcowa j : skladowe) {
            System.out.print("      " + numer1 + "." + numer2 + ")  ");

            j.wypiszInfo(numer1, numer2);
            numer2++;

        }
    }

}
