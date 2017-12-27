package core;

import java.util.Collection;
import model.Node;
import model.Problem;
import model.Solution;

public interface Search {
    public Solution solve(Problem problem, int limit);
    public Collection<Node> expand(Node node, Problem problem);

}
