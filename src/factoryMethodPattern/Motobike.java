package factoryMethodPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 6:21 PM
 */
public class Motobike implements Transport{
    @Override
    public String deliver() {
        String delivery = "deliver by motobike";
        System.out.println(delivery);
        return delivery;
    }
}
