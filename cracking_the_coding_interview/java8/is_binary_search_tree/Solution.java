/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    int getMax(Node root) {
        int max = root.data;        
        
        // compare with maxLeft
        if (root.left != null) {
            int maxLeft = getMax(root.left);
            if (maxLeft > max)
                max = maxLeft;
        }
        
        // compare with maxRight
        if (root.right != null) {
            int maxRight = getMax(root.right);
            if (maxRight > max)
                max = maxRight;
        }
        return max;
    }

    int getMin(Node root) {
        int min = root.data;
        
        // compare with minLeft
        if (root.left != null) {
            int minLeft = getMin(root.left);
            if (minLeft < min)
                min = minLeft;
        }
        
        // compare with minRight
        if (root.right != null){
            int minRight = getMin(root.right);
            if (minRight < min)
                min = minRight;
        }
            
        return min;
    }

    boolean checkBST(Node root) {
        // check root
        if (root == null) {
            return true;
        }
        
        // checkBST for sub-tree
        if (!checkBST(root.left) || !checkBST(root.right)) {
            return false;
        }
        
        // get maxLeft
        // if maxLeft >= root.data => false
        if (root.left != null) {
            int maxLeft = getMax(root.left);
            if (maxLeft >= root.data) return false;
        }
        
        // get minRight
        // if minRight <= root.data => false
        if (root.right != null) {
            int minRight = getMin(root.right);
            if (minRight <= root.data) return false;
        }
        
        return true;
    }
