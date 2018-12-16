package MD;

public class Planet extends HeavenlyBody {
    public Planet(String name, int orbitalPeriod) {
        super(name, BodyTypes.PLANET, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyTypes()== BodyTypes.MOON) {
            return super.addSatellite(moon);
        }
        return false;
    }
}
