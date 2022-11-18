package zadanie.lab3;

public abstract class Koktaj implements Jadalne, Pijalne {

    protected final int kcal;

    protected Koktaj(final int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }
}
