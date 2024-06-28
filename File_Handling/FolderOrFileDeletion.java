package chapter2;

public class FolderOrFileDeletion {

	public static void main(String[] args) {
		
		java.io.File f = new java.io.File("D:\\nandhaclg\\files\\sample2.mp4");
		
		f.delete();
		
		System.out.println("Success...");
	}
}
