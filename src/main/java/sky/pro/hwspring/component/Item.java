package sky.pro.hwspring.component;

public class Item {
    final int id;
    final String name;
    static int nextId = 1;

    public Item(String name) {
        id = nextId++;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s", id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;

        return id == item.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getNextId() {
        return nextId;
    }
}
