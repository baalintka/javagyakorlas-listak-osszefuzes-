
package gyakorlas;
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Gyakorlas {

   static int[] listam=new int[10];
   static int szorzat;
    public static void main(String[] args) {
      //  szavakhossza();
         sorozat();
         szorzata();
         parosszamok();
         listaosszefuz();
         szokereses();
        
    }

 //   private static void szavakhossza() {
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Kérek egy szót!");
       // String szo1=sc.nextLine();
      //  System.out.println("Kérek egy másik szót!");
     //   String szo2=sc.nextLine();
     //   int kivonas;
     //   if (szo1.length() < szo2.length()) {
   //         System.out.println("a hosszabb szó: "+szo2);
   //         kivonas=szo2.length()-szo1.length();
   //     }else{
   //         System.out.println("a hosszabb szó: "+szo1);
   //         kivonas=szo1.length()-szo2.length();
   //     }
        
  //      System.out.println("szavak hosszának különbsége: "+kivonas);
 //   }
//
    private static void sorozat() {
        
        Random rnd = new Random();
        int szam;
        int minimum=2021210;
        for (int i = 0; i < 10; i++) {
            szam=rnd.nextInt(100,200);
            listam[i]=szam;
            if (listam[i]<minimum) {
                minimum=listam[i];
            }
            System.out.println(szam);
    
        
        }
        System.out.println("legkisebb elem: "+minimum);
    }

    private static void szorzata() {
        
        for (int i = 0; i < listam.length; i++) {
            szorzat=listam[0]*listam[i];
        }
        System.out.println(szorzat);
    }

    private static void parosszamok() {
        int paros=0;
        for (int i = 0; i < listam.length; i++) {
            if (listam[i]%2==0) {
                paros+=1;
            }
        
        }
        System.out.println("páros számok : "+paros);    
    }

    private static void listaosszefuz() {
        int[]lista1=new int[10];
        int[]lista2=new int[10];
        int[]listaosszefuzott=new int[20];
        Random vmi = new Random();
        for (int i = 0; i < 10; i++) {
            lista1[i]=vmi.nextInt(100);
            lista2[i]=vmi.nextInt(100);
        }
        for (int j = 0; j < 10; j++) {
             
            listaosszefuzott[j]=lista1[j];   
        }
        for (int j = 10; j < 20; j++) {
             
            listaosszefuzott[j]=lista2[j-10];   
        }
        
        for (int i = 0; i < listaosszefuzott.length; i++) {
            System.out.println(listaosszefuzott[i]);
        }
       
        }

    private static void szokereses() {
        String[] listam=new String[1];
        String[] szolista=new String[1];
        
        String szoveg="Talán nem sokan tudják, hogy külön neve is van annak a jelenségnek, ha egy mondatot,Talán görög nem sokan tudják, hogy külön neve is van annak a jelenségnek, ha egy mondatot";
        ArrayList<String> Stringlistam = new ArrayList<String>();
        Stringlistam.add(szoveg);
        Stringlistam.toArray(listam);
        System.out.println(listam[0]);
        String ujszoveg=szoveg.replace(" ", "@");
        System.out.println(ujszoveg);
        for (int i = 0; i < szoveg.length(); i++) {
            String betu=szoveg.charAt(i);
        }
        
        
    }
    }
    

