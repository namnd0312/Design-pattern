package factoryMethodPattern;

import common.TransportType;

/**
 * @author nam.nd
 * @created 05/06/2021 - 6:25 PM
 */
public class Test {
    public static void main(String[] args) {
        Logistic roadLogistics = new RoadLogistics();
        Transport transport = roadLogistics.createTransport(TransportType.TRUCK);
        transport.deliver();
    }
}
