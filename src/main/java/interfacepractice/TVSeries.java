package interfacepractice;

public class TVSeries {
    public String channel;

    public TVSeries(String channel) {
        this.channel = channel;
    }

    public void channelAired() {
        System.out.println("Aired on channel " + channel);
    }

}
