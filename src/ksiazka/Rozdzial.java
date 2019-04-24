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

    public Rozdzial(String nazwa, String numer) {
        super(nazwa, numer);
    }

    public void dodaj(JednostkaWzorcowa j) {
        skladowe.add(j);
    }

    @Override
    public void wypiszInfo() {
        System.out.println(numer + " " + nazwa + "    ");
        for (JednostkaWzorcowa j : skladowe) {
            j.wypiszInfo();
        }
    }

}
