package interfacepractice;

public class AmericanGods extends TVSeries implements Fantasy {

    public AmericanGods(String channel) {
        super(channel);
    }

    @Override
    public boolean hasNonHumans() {
        return true;
    }

    @Override
    public void displayCharacters() {
        System.out.println("Shadow, Old Gods, New Gods, Laura");

    }
}
