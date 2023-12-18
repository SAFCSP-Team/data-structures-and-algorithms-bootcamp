
import java.util.ArrayList;


public class TreeNode {

    // Node data
    // ** add your code here **
    // 1 - Declare name attribute as String

    // Node Children
    ArrayList<TreeNode> children = new ArrayList<TreeNode>();

    // Constructor to create the node
    TreeNode(int name){
        this.name = name;
    }

    public static void main(String[] args) {
        
        // Create the root
        TreeNode root = new TreeNode("Mohammed");

        // Create TreeNodes
        TreeNode child1 = new TreeNode("Ahmed");
         // ** add your code here **
        // 2 - craete {child2} with the name Khalid and {child3} with the name Abdullah 


        // Add the TreeNodes as the root children
        root.children.add(child1);
           // ** add your code here **
        // 3 - add {child2} and {child3} to the root children 


        // Print the root and the children data
        System.out.println(root.name);
        System.out.println(root.children.get(0).name);
        System.out.println(root.children.get(1).name);
            // ** add your code here **
        // 4 - print root child2 name
    }

    
}
