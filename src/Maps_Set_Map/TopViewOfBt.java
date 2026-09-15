package Maps_Set_Map;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
class pair{
 int dist;
 Node node;
 pair(Node node,int dist){
     this.dist=dist;
     this.node=node;
 }
}
public class TopViewOfBt {
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(q.size()>0){
            pair front =q.remove();
            Node node=front.node;
            int dist=front.dist;
            min=Math.min(min,dist);
            max=Math.max(max,dist);
            if(!map.containsKey(dist)) map.put(dist,node.data);
            if(node.left!=null) q.add(new pair(node.left,dist-1));
            if(node.right!=null) q.add(new pair(node.right,dist+1));
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
    }

}
