package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;

public class AVLTreeDemo {

    /*
     * An AVLTree is a special BinaryTree that is capable of balancing itself.
     * With a regular binary tree, depending on the elements inserted, you might
     * have a root with one very long right branch and one very long left branch
     * with nothing else in between.
     * 
     * 1.) Read through the AVLNode and AVLTree. Notice that the methods are
     * similar to those in BinaryTree with two important distinctions:
     * 
     * a) Each Node has a balance factor that keeps track of how many levels
     * "down" it is relative to the rest of the tree.
     * 
     * b) There are "rotate" helper methods used when a given node gets too
     * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
     * branches back into place.
     * 
     * 2.) Create a BinaryTree and an AVLTree.
     * 
     * 3.) Insert the same values into both trees and observe how they differ
     * using the print method. Make sure the values you pick unbalance the
     * binary tree.
     * 
     * 4.) Try removing elements from both and see how they change using one of
     * the print methods.
     */

    public static void main(String[] args) {

    	BinaryTree<Integer> bt = new BinaryTree<Integer>();
    	AVLTree<Integer> at = new AVLTree<Integer>();
    	
    	bt.insert(6);
    	bt.insert(2);
    	bt.insert(5);
    	bt.insert(1);
    	bt.insert(4);
    	bt.insert(9);
    	bt.insert(15);
    	bt.insert(12);
    	bt.insert(11);
    	
    	at.insert(6);
    	at.insert(2);
    	at.insert(5);
    	at.insert(1);
    	at.insert(4);
    	at.insert(9);
    	at.insert(15);
    	at.insert(12);
    	at.insert(11);
    	
    	bt.printVertical();
    	at.printVertical();
    	
    	
    	at.delete(5);
    	at.delete(9);
    	
    	bt.delete(5);
    	bt.delete(9);
    	
    	bt.printVertical();
    	at.printVertical();
    	
    }

}
