package interfacepractice;

public class Main {

    public static void main(String[] args) {
        AmericanGods americanGods = new AmericanGods("Starz");
        DeathNote deathNote = new DeathNote("Nippon TV");
        TheGoodPlace theGoodPlace = new TheGoodPlace("NBC");

        deathNote.displayCharacters();
        theGoodPlace.channelAired();
        System.out.println(americanGods.hasNonHumans());

        Jeopardy jeopardy = new Jeopardy("CBS & others");
        jeopardy.goal();
    }
}
