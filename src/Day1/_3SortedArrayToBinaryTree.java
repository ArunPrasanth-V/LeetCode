package Day1;

public class _3SortedArrayToBinaryTree {
	
public static void main(String argd[])
{
	int[]arr= {-10,-5,0,4,7,9};
	convertIT(arr,0,arr.length-1);
}
public static TreeNode convertIT(int arr[],int left,int right)
{
	if(left>right)return null;
	int mid=left+(right-left)/2;
	TreeNode node=new TreeNode(arr[mid]);
	node.left=convertIT(arr,left,mid-1);
	node.right=convertIT(arr,mid+1,right);
	return node;
}
}
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
