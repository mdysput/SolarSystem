package MD;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> moons= new HashSet<>();

    public static void main(String[] args) {


        HeavenlyBody planet = new Planet("Mercury", 88);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        planet = new Planet("Venus", 225);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        planet = new Planet("Earth", 365);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon);

        planet = new Planet("Mars", 687);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        tempMoon = new Moon("Deimos", 1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon);
        planet = new Planet("Jupiter", 4332);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        tempMoon = new Moon("Io", 2);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 17);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        planet.addSatellite(tempMoon); // temp is still Jupiter

        planet = new Planet("Saturn", 10759);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        planet = new Planet("Uranus", 30660);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        planet = new Planet("Neptune", 165);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        planet = new Planet("Pluto", 248);
        solarSystem.put(planet.getKey(), planet);
        planets.add(planet);

        System.out.println("All Planets:");
        for(HeavenlyBody plan: planets){
            System.out.println(plan.getKey());
        }

        System.out.println("Moons: ");
        for(HeavenlyBody plan: planets){
            moons.addAll(plan.getSatellites());
        }
        for(HeavenlyBody moon: moons){
            System.out.println(moon.getKey());
        }

        System.out.println("All planets: ");
        for(HeavenlyBody heavenlyBody: solarSystem.values()){
            System.out.println(heavenlyBody);
        }


        System.out.println("Checking equals and hashCode: ");
        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);
        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

    }
}
