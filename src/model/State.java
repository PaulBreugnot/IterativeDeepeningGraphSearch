package model;

import java.util.ArrayList;

import model.Action;

public interface State {
	@Override
	int hashCode();
	
	@Override
	boolean equals(Object stateActionPair);
	
	ArrayList<Action> getAvailableActions();
	
	boolean isTerminal();
}
