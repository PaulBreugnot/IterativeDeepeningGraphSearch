package model;

import java.util.Collection;

public interface Problem {
    public State getInitialState();
    public boolean isGoal(State state);
    public Collection<Action> getActions(State state);
    public State getNextState(State state, Action action);
    public double getStepCost(Object start, Object action, Object dest);
}
