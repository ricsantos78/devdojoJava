package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");

    }

    public static AircraftSingletonLazy getInstance() {
        if (INTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INTANCE == null) {
                    INTANCE = new AircraftSingletonLazy("787-900");
                }
            }

        }
        return INTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
