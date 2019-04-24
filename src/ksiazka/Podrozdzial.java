/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksiazka;

/**
 *
 * @author Student
 */
class Podrozdzial extends JednostkaWzorcowa {

    public Podrozdzial(String nazwa, String numer) {
        super(numer, nazwa);
    }

    @Override
    public void wypiszInfo() {
        System.out.println("    "+numer + " " + nazwa);
    }

}
