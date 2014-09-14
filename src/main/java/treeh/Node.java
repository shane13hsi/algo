package treeh;

import java.util.List;

/**
 * Created by evanhsiwood on 9/13/14.
 */
public class Node<T> {

    private T value;
    private Node parent;
    private List<Node> children;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
