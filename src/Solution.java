import java.util.ArrayList;
 
class Solution {
	
	// Class defintion of TreeNode, taken from LeetCode problem
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        getLeaves(left, root1);
        getLeaves(right, root2);
        
        return left.equals(right);
    }
    
    public void getLeaves(ArrayList<Integer> list, TreeNode root) {
    	if(root == null)
    		return;

    	getLeaves(list, root.left);
    	
        if(root.left == null && root.right == null)
            list.add(root.val);
        
        getLeaves(list, root.right);	
    }
}