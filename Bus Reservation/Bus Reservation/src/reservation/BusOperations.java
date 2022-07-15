package reservation;

import java.util.*;

public class BusOperations {

    List<Bus> busList = new ArrayList<>();

    public void addBus(String busNumber, String operatorName, String source, String destination, int fare) {
        Bus bus = new Bus(busNumber,operatorName,source,destination,fare);
        busList.add(bus);
    }

    public List<Bus> searchBus(String source, String destination) {
        List<Bus> resultList = new ArrayList<>();
        for(Bus bus : busList) {
            if(source.equals(bus.getSource()) && destination.equals(bus.getDestination())) {
                resultList.add(bus);
            }
        }
        return resultList;
    }

}
