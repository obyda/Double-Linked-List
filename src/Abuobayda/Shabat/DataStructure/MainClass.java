/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        DListInterface<Integer> myList = new DList<Integer>();
        
        System.out.println("============Testing addFront method=======");
        myList.addToFront(4);
        myList.addToFront(6);
        myList.display();
        
        System.out.println("==========Testing removeFront=============");
        int val = myList.removeFront();
        System.out.println("Value of the removed node: "+ val);
        myList.display();
        int val2 = myList.removeFront();
        System.out.println("Value of the removed node: "+ val2);
        myList.display();
        
        System.out.println("==========Testing addToBack method===============");
        myList.addToBack(10);
        myList.addToBack(20);
        myList.addToBack(30);
        myList.display();
        
        System.out.println("==============Testing remove Back================");
        int val3 = myList.removeBack();
        myList.display();
        System.out.println("value of the  removed node: "+ val3);
        int val4 = myList.removeBack();
        myList.display();
        System.out.println("value of the  removed node: "+ val4);
        int val5 = myList.removeBack();
        myList.display();
        System.out.println("value of the  removed node: "+ val5);
        myList.addToBack(10);
        myList.display();

        System.out.println("=========Testing numOfItems method========");
        System.out.println("Number Of Item in the List: "+ myList.numOfItems());
        
        System.out.println("==========Testing clear method=======");
        myList.clear();
        System.out.println("Numer of Items in the List: "+ myList.numOfItems());



    }
}
