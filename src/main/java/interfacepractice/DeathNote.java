package interfacepractice;

public class DeathNote extends TVSeries implements Fantasy{

    public DeathNote(String channel) {
        super(channel);
    }

    @Override
    public boolean hasNonHumans() {
        return true;
    }

    @Override
    public void displayCharacters() {
        System.out.println("Light, L, Ryuk, Misa");

    }

}
