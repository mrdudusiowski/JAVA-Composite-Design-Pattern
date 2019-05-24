package ksiazka;


abstract class JednostkaWzorcowa {

    protected String nazwa;

    public JednostkaWzorcowa(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract void wypiszInfo(int numer1, int numer2);
}
