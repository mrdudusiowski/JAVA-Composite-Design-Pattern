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
abstract class JednostkaWzorcowa {

    protected String nazwa;
    protected String numer;

    public JednostkaWzorcowa(String nazwa, String numer) {
        this.nazwa = nazwa;
        this.numer = numer;
    }

    public abstract void wypiszInfo();
}
