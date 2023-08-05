package package2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
		System.out.println("Cuurent location of the file: "+raf.getFilePointer());
		System.out.println("the kength of the file is: "+ raf.length());
		
		raf.writeInt(8989898); //4 bytes
		System.out.println(raf.getFilePointer());
		raf.writeUTF("This is Mine!!"); //1 byte
		System.out.println(raf.getFilePointer()
				);
		System.out.println("after writing position "+raf.getFilePointer());
		
		System.out.println("after writing length "+raf.length());
		
		raf.seek(0);      //beginning of the file
		System.out.println(raf.readInt()+" "+raf.readUTF()+raf.length());
		
		raf.seek(0); 
		
		raf.seek(4);   // 4 bytes of int at the start
		
		System.out.println(raf.readUTF());
		raf.seek(0);
		
		raf.close();  //once the file length is increased, it doesn't go down even if we delete
		
		
		
		
	}

}
