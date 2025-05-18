package puzzle;

/**
 * Represents the state of a puzzle whose moves are described by two objects,
 * i.e., {@code from} and {@code to}. From a user interface-centric viewpoint,
 * it is suitable for puzzles where moves are made from a source to a
 * target location. Thus, a move is specified in two phases, each requiring a
 * selection, e.g., two subsequent mouse clicks are needed.
 *
 * @param <T> represents the type of the source and the target of the moves
 */
public interface TwoPhaseMoveState<T> extends State<common.TwoPhaseMoveState.TwoPhaseMove<T>>, common.TwoPhaseMoveState<T> {

    TwoPhaseMoveState<T> clone();

}
