package package2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//import java.io].FileInputStream;

public class FileIO {
    public static void main(String args[]) throws FileNotFoundException {
        int[] played=new int[9];
        int[] won=new int[9];
        int[] loss=new int[9];
        String[] name = new String[9];
        int[] tie=new int[9];
        int[] tot=new int[9];
        int mw=0,ml=0;
        int win=0,lost=0,ctot=0;
        int totpoint=12;
        Scanner sc=new Scanner(new File("text.txt"));
            for(int i=0;i<8;i++) {
                name[i]=sc.next();
                played[i] = sc.nextInt();
                won[i] = sc.nextInt();
                loss[i] = sc.nextInt();
                tie[i] = sc.nextInt();
                tot[i] = sc.nextInt();
                } 
            for(int i=0;i<8;i++) {
            	if(won[i]>mw) {
            		mw=won[i];
            		win=i;
            	}
            }
            for(int i=0;i<8;i++) {
            	if(loss[i]>ml) {
            		ml=won[i];
            		lost=i;
            	}
            }
            for(int i=0;i<8;i++) {
            	if(tot[i]==totpoint) {
            		ctot=i;
            	}
            }
        sc.close();
        System.out.println("Maximum Matches Won By: "+name[win]);
        System.out.println("Maximum Matches Lost By: "+name[lost]);
        System.out.println("Teams with 12 points:  "+name[ctot]);
    }
}



