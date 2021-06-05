package factoryMethodPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 5:42 PM
 */
public class Ship implements Transport {
    @Override
    public String deliver() {

        String delivery = "deliver by sea in a container";
        System.out.println(delivery);
        return delivery;
    }
}
