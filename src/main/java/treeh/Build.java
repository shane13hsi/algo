package treeh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by evanhsiwood on 9/13/14.
 */
public class Build {

    public static Map<String, Node> BuildTree(Collection<Department> collection) {

        Map<String, Node> lookup = new HashMap<>();
        for (Department depart : collection) {
            if (!lookup.keySet().contains(depart.toString())) {
                Node<Department> node = new Node<>();
                node.setValue(depart);
                lookup.put(depart.toString(), node);
            }
        }

        for (Node<Department> item : lookup.values()) {
            Node proposedParent;
            String itemPid = String.valueOf(item.getValue().getPid());
            if (lookup.containsKey(itemPid)) {
                proposedParent = lookup.get(itemPid);
                item.setParent(proposedParent);
                if (proposedParent.getChildren() == null) {
                    proposedParent.setChildren(new ArrayList<Node>());
                }
                proposedParent.getChildren().add(item);
            }

        }

        return lookup;
    }

}
