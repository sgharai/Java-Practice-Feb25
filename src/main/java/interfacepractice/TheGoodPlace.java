package interfacepractice;

public class TheGoodPlace extends TVSeries implements Fantasy{

    public TheGoodPlace(String channel) {
        super(channel);
    }

    @Override
    public boolean hasNonHumans() {
        return true;
    }

    @Override
    public void displayCharacters() {
        System.out.println("Eleanor, Chidi, Michael, etc.");
    }
}
