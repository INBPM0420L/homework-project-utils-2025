package puzzle;

import java.util.Set;

/**
 * Represents the state of a puzzle to be solved.
 *
 * @param <T> represents the moves that can be applied to the states
 */
public interface State<T> extends common.State<T>, Cloneable {

    /**
     * {@return whether the puzzle is solved}
     */
    boolean isSolved();

    /**
     * {@return the set of all moves that can be applied to the state}
     */
    Set<T> getLegalMoves();

    /**
     * {@return a copy of the state}
     */
    State<T> clone();

}
