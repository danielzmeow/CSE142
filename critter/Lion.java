public class Lion extends Critter {
    // This defines how a Lion critter behaves in the simulation.
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.LEFT;
        }
    }

    // This defines the string of the Lion critter.
    public String toString() {
        return "🦁";
    }
}