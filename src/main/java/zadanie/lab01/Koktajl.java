package zadanie.lab01;

public abstract class Koktajl implements Jadalne, Pijalne{

    protected final int kcal;

    protected Koktajl(final int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }



}
