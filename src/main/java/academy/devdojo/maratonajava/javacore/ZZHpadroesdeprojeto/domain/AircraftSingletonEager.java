package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager AIRCRAFT_SINGLETON_EAGER = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats =  new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonEager getInstance(){
        return AIRCRAFT_SINGLETON_EAGER;
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
