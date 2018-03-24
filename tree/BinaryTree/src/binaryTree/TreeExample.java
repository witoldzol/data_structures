/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;
import java.util.*;

public class TreeExample {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Node theNode1 = new Node(50);
        Node theNode2 = new Node(25);
        Node theNode3 = new Node(75);
        Node theNode4 = new Node(12);
        Node theNode5 = new Node(30);
        Node theNode6 = new Node(60);
        Node theNode7 = new Node(80);
        Node theNode8 = new Node(26);
       /*
        Node theNode9 = new Node(29);
        Node theNode10 = new Node(51);
        Node theNode11= new Node(52);
        Node theNode12 = new Node(76);
        Node theNode13 = new Node(77);
        Node theNode14 = new Node(73);
        Node theNode15 = new Node(18);
        Node theNode16 = new Node(1003);
        Node theNode17 = new Node(9111);
        Node theNode18 = new Node(11);
        Node theNode19 = new Node(124);
        Node theNode20 = new Node(999);
        Node theNode21 = new Node(2100);
        Node theNode22 = new Node(12);
        Node theNode23 = new Node(55);
        Node theNode24 = new Node(861);
        Node theNode25= new Node(21);
        Node theNode26 = new Node(184);
        Node theNode27 = new Node(1299);
        Node theNode28 = new Node(1211);
*/
        //create the binary tree and insert(add) the nodes created above
        BinaryTree bst = new BinaryTree();
        bst.insertNode(bst.root, theNode1);
        bst.insertNode(bst.root,theNode2);
        bst.insertNode(bst.root,theNode3);
        bst.insertNode(bst.root,theNode4);
        bst.insertNode(bst.root,theNode5);
        bst.insertNode(bst.root,theNode6);
        bst.insertNode(bst.root,theNode7);
        bst.insertNode(bst.root,theNode8);
      /*
        bst.insertNode(bst.root,theNode9);
        bst.insertNode(bst.root,theNode10);
        bst.insertNode(bst.root,theNode11);
        bst.insertNode(bst.root,theNode12);
        bst.insertNode(bst.root,theNode13);
        bst.insertNode(bst.root,theNode14);
        bst.insertNode(bst.root,theNode15);
        bst.insertNode(bst.root,theNode16);
        bst.insertNode(bst.root,theNode17);
        bst.insertNode(bst.root,theNode18);
        bst.insertNode(bst.root,theNode19);
        bst.insertNode(bst.root,theNode20);
        bst.insertNode(bst.root,theNode21);
        bst.insertNode(bst.root,theNode22);
        bst.insertNode(bst.root,theNode23);
        bst.insertNode(bst.root,theNode24);
        bst.insertNode(bst.root,theNode25);
        bst.insertNode(bst.root,theNode26);
        bst.insertNode(bst.root,theNode27);
        bst.insertNode(bst.root,theNode28);
*/

        System.out.println("In-order Traversal-  The listing of nodes is: ");
        bst.inOrderTraversal(bst.root);

        Node foundNode = bst.search(theNode5.getElement(), bst.root() );
        if (foundNode == null)
            System.out.println("The node "+ theNode5.getElement() +" DOES NOT exist in the tree! ");
        else
            System.out.println("The node "+ theNode5.getElement() +" exists in the tree! ");


        /*
        System.out.println("Pre-order Traversal-  The listing of nodes is: ");
        bst.preOrderTraversal(bst.root);

        System.out.println("Post-order Traversal-  The listing of nodes is: ");
        bst.postOrderTraversal(bst.root);

        System.out.println("No. of nodes is " + bst.countNodes(bst.root));

	  System.out.println("The height of the tree is " + bst.height(bst.root));

        //find the height of theNode2 that has value 25
        Node node = bst.search(theNode2.getElement(), bst.root());
        System.out.println("The height of the node with the value 25 is " + bst.height(node));

        */

     }
}
