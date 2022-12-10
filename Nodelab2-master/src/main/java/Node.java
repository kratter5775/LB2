import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Node {

    public NodeAbstract left;
    public NodeAbstract right;
    public char operator;
    public double value;

    public double evaluate(){
        switch (operator){
            case '+': return left.evaluate() + right.evaluate();
            case '-': return left.evaluate() - right.evaluate();
            case '*': return left.evaluate() * right.evaluate();
            case '/': return left.evaluate() / right.evaluate();
            case '#': return value;
        }
        throw new RuntimeException();
    }

}
