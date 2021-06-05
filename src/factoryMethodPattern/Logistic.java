package factoryMethodPattern;

import common.TransportType;

/**
 * @author nam.nd
 * @created 05/06/2021 - 5:45 PM
 */
public abstract class Logistic {

    public abstract Transport createTransport(TransportType transportType);

}
