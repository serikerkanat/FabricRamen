class SpicyRamen {
    public void cook() {
        System.out.println("Cooking spicy ramen");
    }
}

class VerySpicyRamen {
    public void cook() {
        System.out.println("Cooking very spicy ramen");
    }
}

class NonSpicyRamen {
    public void cook() {
        System.out.println("Cooking non-spicy ramen");
    }
}

class RamenFactory {
    public static Object createRamen(String ramenType) {
        switch (ramenType.toLowerCase()) {
            case "spicy":
                return new SpicyRamen();
            case "very spicy":
                return new VerySpicyRamen();
            case "non-spicy":
                return new NonSpicyRamen();
            default:
                throw new IllegalArgumentException("Invalid ramen type");
        }
    }
}

// Пример использования фабрики
public class Main {
    public static void main(String[] args) {
        SpicyRamen spicyRamen = (SpicyRamen) RamenFactory.createRamen("spicy");
        VerySpicyRamen verySpicyRamen = (VerySpicyRamen) RamenFactory.createRamen("very spicy");
        NonSpicyRamen nonSpicyRamen = (NonSpicyRamen) RamenFactory.createRamen("non-spicy");

        spicyRamen.cook();
        verySpicyRamen.cook();
        nonSpicyRamen.cook();
    }
}
