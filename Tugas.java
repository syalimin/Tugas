/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author windows8.1pro
 */
public class Tugas {

    /**
     * SYALIMIN E1E117026
     */
    public static void main(String[] args) {
      String st1 = "saya suka makan bakso";
      String st2 = "saya suka makan bakso";
      String st3 = "saya ";
      String st4 = "suka ";
      String st5 = "makan bakso";
      String st6 = st3+st4+st5;
      
        System.out.println("Perbedaan Method equals denga operator ==");
        System.out.println();
        System.out.println("Statement 1" +st1);
        System.out.println("Statement 2" +st2);
        System.out.println("Statement 3" +st3);
        System.out.println("Statement 4" +st4);
        System.out.println("Statement 5" +st5);
        System.out.println("Statement 6" +st6);
        System.out.println();
        System.out.println("membandingkan dengan equals  ");
        System.out.println("statement 1.equal(statement2)" + (st1.equals(st2)));
        System.out.println("statement 1.equal(statement6)" + (st1.equals(st6)));
        System.out.println("statement 2.equal(statement6)" + (st2.equals(st6)));
        
        System.out.println("Method equals membandingkan isi memori");
        System.out.println();
        System.out.println("membandingkan dengan operator == ");
        System.out.println("statement 1 == ( statement 2 )" + (st1==st2));
        System.out.println("statement 1 == ( statement 6)" + (st1==st6));
        System.out.println("statement 2 == ( statement 6)" + (st2==st6));
        System.out.println("Method equals membandingkan isi memori");
    }
}
