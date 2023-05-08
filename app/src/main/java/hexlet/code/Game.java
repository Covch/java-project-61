package hexlet.code;

public interface Game {

    int getOrdinal();

    String getName();

    default void printGame() {
        System.out.println(getOrdinal() + " - " + getName());
    }
}
