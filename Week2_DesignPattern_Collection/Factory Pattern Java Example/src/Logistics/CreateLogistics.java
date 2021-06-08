package Logistics;

import Logistics.Transport.SeaTransport;
import Logistics.Transport.Transport;
import Logistics.Transport.TruckTransport;

public class CreateLogistics implements LogisticsFactory {

    public Transport createTransport(String type) {
        switch (type) {
            case "SEA":
                return new SeaTransport();
            default:
                return new TruckTransport();
        }
    }
}
