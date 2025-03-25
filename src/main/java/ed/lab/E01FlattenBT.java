package ed.lab;

import java.util.LinkedList;
import java.util.Stack;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root)
    {
        LinkedList<Object> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null)
        {
            return;
        }

        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            result.add(node.value);

            if (node.right != null) // hola
            {
                stack.push(node.right);
            }

            if (node.left != null)
            {
                stack.push(node.left);
            }

            node.left = null;

            if (!stack.isEmpty())
            {
                node.right = stack.peek();
            }
        }
    }
}