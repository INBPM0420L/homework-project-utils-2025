package common;

/**
 * Represents functionality shared between the state of puzzles and two-player
 * games.
 *
 * @param <T> represents the moves that can be applied to the states
 */
public interface State<T> {

    /**
     * {@return whether the move provided can be applied to the state}
     *
     * @param move represents the move to be made
     */
    boolean isLegalMove(T move);

    /**
     * Applies the move provided to the state. This method should be called if
     * and only if {@link #isLegalMove(Object)} returns {@code true}.
     *
     * @param move represents the move to be made
     */
    void makeMove(T move);

}
