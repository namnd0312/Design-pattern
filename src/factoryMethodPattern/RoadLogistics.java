package factoryMethodPattern;

import common.TransportType;

/**
 * @author nam.nd
 * @created 05/06/2021 - 6:19 PM
 */
public class RoadLogistics extends Logistic {
    @Override
    public Transport createTransport(TransportType transportType) {

        switch (transportType) {
            case TRUCK:
                return new Truck();
            case MOTOBIKE:
                return new Motobike();
            default:
                return null;
        }
    }
}
