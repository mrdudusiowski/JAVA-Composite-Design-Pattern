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
public class Ksiazka {


    public static void main(String[] args) {
      Rozdzial pierwszy = new Rozdzial("1.","Rodzial 1");
      pierwszy.dodaj(new Podrozdzial("1.1","Podrodzial 1"));
      pierwszy.dodaj(new Podrozdzial("1.2","Podrodzial 2"));
      
      Rozdzial drugi = new Rozdzial("2.","Rodzial 2");
      drugi.dodaj(new Podrozdzial("2.1","Podrodzial 1"));
      drugi.dodaj(new Podrozdzial("2.2","Podrodzial 2"));
      
      Rozdzial ksiazka = new Rozdzial("Ksiazka 1", "Title");
      
      ksiazka.dodaj(pierwszy);
      ksiazka.dodaj(drugi);
      
      ksiazka.wypiszInfo();
      
    }
    
}
