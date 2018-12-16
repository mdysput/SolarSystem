package MD;

public final class Key {
    private String name;
    private BodyTypes bodyTypes;

    public Key(String name, BodyTypes bodyTypes) {
        this.name = name;
        this.bodyTypes = bodyTypes;
    }

    public String getName() {
        return name;
    }

    public BodyTypes getBodyTypes() {
        return bodyTypes;
    }

    @Override
    public boolean equals(Object o) {
        Key key= (Key) o;
        if(this.name.equals(key.getName())){
            return this.bodyTypes== key.getBodyTypes();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+57+ this.bodyTypes.hashCode();
    }

    @Override
    public String toString() {
        return this.name+": "+this.bodyTypes;
    }
}
