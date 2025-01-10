package entities;

import java.util.Objects;

public abstract class PhysicalObject {
    protected String name;

    public PhysicalObject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalObject that = (PhysicalObject) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "entities.PhysicalObject{name='" + name + "'}";
    }
}
