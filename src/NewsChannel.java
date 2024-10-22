public class NewsChannel implements Observer {
    private String channelName;

    // The constructor accepts the channel name and initializes the corresponding field.
    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    // "update" method is called to notify the news channel of a new headline.
    @Override
    public void update(String headline) {
        System.out.println(channelName + " received headline: " + headline);
    }
}
