package game;

/**
 * Represents the state of a game whose moves are described by two objects,
 * i.e., {@code from} and {@code to}. From a user interface-centric viewpoint,
 * it is suitable for games where moves are made from a source location to a
 * target location. Thus, a move is specified in two phases each of which
 * requires a selection, e.g., two subsequent mouse clicks are required.
 *
 * @param <T> represents the moves that can be applied to the states
 */
public interface TwoPhaseMoveState<T> extends State<common.TwoPhaseMoveState.TwoPhaseMove<T>>, common.TwoPhaseMoveState<T> {
}
