package ProxyClasses;

import MasterClasses.ConcreteWeather;
import MasterClasses.Weather;

public class Proxy extends Weather {

    ConcreteWeather concreteWeather;

    @Override
    public void whoAmI() {
        System.out.println("\tMethod Call from " +
                this.getClass().getSimpleName() + " class");
        System.out.println("\t\tWeather forecast is overcast and rain\n");
        if (concreteWeather == null) {
            concreteWeather = new ConcreteWeather();
        }
        concreteWeather.whoAmI();
    }
}
