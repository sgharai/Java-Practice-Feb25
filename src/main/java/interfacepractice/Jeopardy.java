package interfacepractice;

public class Jeopardy extends GameShow {
    public Jeopardy(String channel) {
        super(channel);
    }

    @Override
    void goal() {
        System.out.println("The goal is to answer the trivia questions before your opponents.");
    }
}
