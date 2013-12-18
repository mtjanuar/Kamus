/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamus;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Kamus {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner (System.in);
	Queue baru = new Queue();
	
	Data data;
	String fileName  = "kbbi.dict.csv";
	Scanner inputStream = null;
	
	try{
		inputStream = new Scanner(new File(fileName));
		
	}
	catch (FileNotFoundException e) {
		System.out.println("Error opening file !! ");
		System.exit(0);
	}
	
	while (inputStream.hasNextLine()){
		
		String line  = inputStream.nextLine();
		String tmp[] = line.split("\t");
		tmp [1] = tmp[1].replace("[pb]", "").replace("<br>", "");
		
		data = new Data();
		data.kata = tmp[0];
		data.makna = tmp [1];
		
		baru.insert(tmp[0], tmp[1]);
	
		
	}
	inputStream.close();
	
	System.out.println(" ===========================================");
	System.out.println(" KAMUS BESAR BAHASA INDONESIA (KBBI)");
	System.out.println(" ===========================================");
	System.out.print(" masukkan kata yang ingin dicari : ");
	String key = keyboard.nextLine();
	System.out.println("---------------------------------------");
	
	
	for (Data tmp = baru.front ; tmp != null ; tmp = tmp.next){
		
		if (tmp.kata.contains(key)){
			
			System.out.println(tmp.kata + "\t=\t" + tmp.makna);
		}
		
		
	}
    }
    
}
