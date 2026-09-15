package Maps_Set_Map;
import kotlin.Pair;
import java.util.*;
class Solution {

    Node start;
    HashMap<Node, Node> parent;

    public int minTime(Node root, int target) {

        start = null;
        parent = new HashMap<>();

        dfs(root, target);

        Queue<pair> q = new LinkedList<>();

        q.add(new pair(start, 0));

        HashSet<Node> burned = new HashSet<>();
        burned.add(start);

        int time = 0;

        while (q.size() > 0) {

            pair front = q.remove();

            int dist = front.dist;
            Node node = front.node;

            time = Math.max(time, dist);

            // Left child
            if (node.left != null && !burned.contains(node.left)) {

                q.add(new pair(node.left, dist + 1));
                burned.add(node.left);
            }

            // Right child
            if (node.right != null && !burned.contains(node.right)) {

                q.add(new pair(node.right, dist + 1));
                burned.add(node.right);
            }

            // Parent
            if (parent.containsKey(node)
                    && !burned.contains(parent.get(node))) {

                q.add(new pair(parent.get(node), dist + 1));
                burned.add(parent.get(node));
            }
        }

        return time;
    }

    private void dfs(Node root, int target) {

        if (root == null)
            return;

        if (root.data == target)
            start = root;

        if (root.left != null)
            parent.put(root.left, root);

        if (root.right != null)
            parent.put(root.right, root);

        dfs(root.left, target);
        dfs(root.right, target);
    }
}