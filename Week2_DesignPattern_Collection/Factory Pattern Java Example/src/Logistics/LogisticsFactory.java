package Logistics;

import Logistics.Transport.Transport;

public interface LogisticsFactory {
    public Transport createTransport(String type);
}
