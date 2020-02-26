package interfacepractice;

abstract class GameShow extends TVSeries{
    public GameShow(String channel) {
        super(channel);
    }

    abstract void goal();
}
