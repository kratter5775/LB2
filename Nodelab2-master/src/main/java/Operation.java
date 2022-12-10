import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Operation extends NodeAbstract {

    public NodeAbstract left;
    public NodeAbstract right;

    public void setLeft(NodeAbstract left) {
        this.left = left;
    }

    public void setRight(NodeAbstract right) {
        this.right = right;
    }

    public abstract double evaluate();
}
