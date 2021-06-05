package factoryMethodPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 5:42 PM
 */
public class Truck implements Transport{
    @Override
    public String deliver() {
        String delivery =  "Deliver by land in a box";
        System.out.println(delivery);
        return delivery;
    }
}
