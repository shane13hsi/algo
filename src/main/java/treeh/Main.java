package treeh;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DepartmentRepo repo = new DepartmentRepo();
        List<Department> departmentList = repo.loadAllDepartments();
        System.out.println(departmentList.size());
        Map<String, Node> nodesMap = Build.BuildTree(departmentList);
        System.out.println(nodesMap.size());

        int level = 1;
        int departid = 2133;
        Node<Department> node = nodesMap.get(String.valueOf(departid));

        while (node != null && node.getParent() != null) {
            node = node.getParent();
            level++;
        }

        System.out.println(level);
    }
}
