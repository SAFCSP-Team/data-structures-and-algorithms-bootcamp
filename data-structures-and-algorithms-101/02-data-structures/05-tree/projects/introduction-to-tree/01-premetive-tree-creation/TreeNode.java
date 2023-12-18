
import java.util.ArrayList;


public class TreeNode {

    // Node Data
    int number;
    // Node Children
    ArrayList<TreeNode> children = new ArrayList<TreeNode>();

    // Constructor to create the node
    TreeNode(int number){
        this.number = number;
    }

    public static void main(String[] args) {
        
        // Create the root
        TreeNode root = new TreeNode(1);

        // Create TreeNodes
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        TreeNode child3 = new TreeNode(4);

        // Add the TreeNodes as the root children
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Print the root and the children data
        System.out.println(root.number);
        System.out.println(root.children.get(0).number);
        System.out.println(root.children.get(1).number);
        System.out.println(root.children.get(2).number);

    }

    
}
