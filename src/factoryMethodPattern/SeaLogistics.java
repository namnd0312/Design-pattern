package factoryMethodPattern;

import common.TransportType;

/**
 * @author nam.nd
 * @created 05/06/2021 - 6:23 PM
 */
public class SeaLogistics extends Logistic {
    @Override
    public Transport createTransport(TransportType transportType) {
        switch (transportType) {
            case SHIP:
                return new Ship();
            default:
                return null;
        }
    }
}
