package MD;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private Key key;
    private int orbitalPeriod;
    private Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, BodyTypes bodyTypes, int orbitalPeriod) {
        this.key= new Key(name, bodyTypes);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites= new HashSet<>();
    }


    public Key getKey() {
        return key;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return satellites;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }


    public static Key makeKey(String name, BodyTypes bodyTypes){
        return new Key(name, bodyTypes);
    }

    @Override
    public String toString() {
        return this.key.getName()+": "+this.key.getBodyTypes()+"-> "+this.orbitalPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o instanceof HeavenlyBody){
            HeavenlyBody heavenlyBody= (HeavenlyBody) o;
            if(this.key.equals(heavenlyBody.getKey()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }
}
