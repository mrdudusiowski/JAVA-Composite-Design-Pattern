package ksiazka;


public class Kompozyt {
    
       public static void main(String[] args) {
        
        Ksiazka ksiazka = new Ksiazka("Przykladowa ksiazka II");

        Rozdzial rozdzialI = new Rozdzial("Rozdział pierwszy");
        Podrozdzial podrozdzialI = new Podrozdzial("Podrozdział pierwszy - rozdzialu I");
        Podrozdzial podrozdzialII = new Podrozdzial("Podrozdział drugi - rozdzialu I");
        
        
        Rozdzial rozdzialII = new Rozdzial("Rozdział drugi");
        Podrozdzial podrozdzial2I = new Podrozdzial("Podrozdział  pierwszy - rozdzialu II");
        Podrozdzial podrozdzial2II = new Podrozdzial("Podrozdział drrugi- rozdzialu II");

        Rozdzial rozdzialIII = new Rozdzial("Rozdział trzeci");
        Podrozdzial podrozdzial3I = new Podrozdzial("Podrozdział pierwszy - rozdzialu III");
        Podrozdzial podrozdzial3II = new Podrozdzial("Podrozdział drugi - rozdzialu III");
        Podrozdzial podrozdzial3III = new Podrozdzial("Podrozdział trzeci - rozdzialu III");
        
        ksiazka.dodaj(rozdzialI);
        rozdzialI.dodaj(podrozdzialI);
        rozdzialI.dodaj(podrozdzialII);
        
        
        ksiazka.dodaj(rozdzialII);
        rozdzialII.dodaj(podrozdzial2I);
        rozdzialII.dodaj(podrozdzial2II);


        ksiazka.dodaj(rozdzialIII);
        rozdzialIII.dodaj(podrozdzial3I);
        rozdzialIII.dodaj(podrozdzial3II);
        rozdzialIII.dodaj(podrozdzial3III);

        ksiazka.wypiszInfo(1, 1);
      
      
    }


}
