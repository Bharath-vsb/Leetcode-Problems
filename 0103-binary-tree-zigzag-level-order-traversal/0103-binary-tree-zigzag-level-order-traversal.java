/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.left !=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            if(count %2==0){
                res.add(new ArrayList<>(temp));
            }
            else{
                Collections.reverse(temp);
                res.add(new ArrayList<>(temp));
            }
            count++;
        }
        return res;
    }
}