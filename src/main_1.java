/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author SBS
 */
public class main_1 {
    public static void main( String[] args){
        System.out.println("Hello and welcome to my game");
        int k=0;
        Scanner clavier = new Scanner(System.in);
        int random;
        String pcmot="";
        for (int i=0;i<8;i++){
            do{
                random=(int)(Math.random()*100);
            }while(random <65 || random >90);
            pcmot=pcmot+(char)random;
            
            }
        //System.out.println(pcmot);
        String mot="";
        while(k<=8){
        
        
        String[] T=new String[8];
        do{
            System.out.println("give me a word humain");
            mot = clavier.nextLine();
        }while(mot.length()!=8);
        mot = mot.toUpperCase();
        int mismatched=0;
        int correct = 0;
        for (int i=0;i<8;i++){
            if(mot.charAt(i)==pcmot.charAt(i)){
                    correct=correct+1;
                    T[i]="[correct]";
                }
            else if(pcmot.indexOf(mot.charAt(i))!=-1){
                    mismatched=mismatched+1;
                    T[i]="[misplaced]";}
            else {
                    T[i]="[      ]";
                            }
            }
        System.out.println("You have "+ correct +  " letters correctly placed and " + mismatched + " letters misplaced.");
        for (int i=0;i<8;i++){
            System.out.print(T[i]+ ' ');
        }
        System.out.print("\n");
        if(pcmot.equals(mot)==true)
            break;
        k++;

        }
        if(k>7){
            System.out.println("You Died(dark souls reference :D ) and the correct word isssss : "+ pcmot);   
        }else if(pcmot.equals(mot)==true && k<=7  ){
            System.out.println("victory achieved ( an other dark souls reference -_- )");
        }
        System.out.println("wonna start an other playthrough Y/n ?");
        char response = clavier.next().charAt(0);
        if(response == 'Y'){
            System.out.println("ofc here we go again");
            main(args);
        }else
            System.out.println("thx for playing....                 \n sike git gud looser \n this is my last ds reference i swear hhh ");
                    
            
                
        
    }
}
