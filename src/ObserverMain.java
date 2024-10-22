// TEST

public class ObserverMain {
    public static void main(String [] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        newsAgency.setHeadline("Breaking News!");
    }
}
