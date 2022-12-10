import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class Value extends NodeAbstract {

    public double value;


    @Override
    public double evaluate() {
        return value;
    }
}
