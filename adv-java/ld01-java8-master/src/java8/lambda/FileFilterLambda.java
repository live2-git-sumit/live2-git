package java8.lambda;

import java.io.File;

public class FileFilterLambda {
	public static void main(String[] args) {
		// THE TRADITIONAL WAY
//		FileFilter fileFilter = new FileFilter() {
//
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".java");
//			}
//		};
//
		File directoryFile = new File(
				"C:\\Users\\Enzo\\Desktop\\live1-git\\adv-java\\ld01-java8-master\\src\\java8\\lambda");
//		File[] files = directoryFile.listFiles(fileFilter);
//		for (File file : files) {
//			System.out.println(file.getName());
//		}
		
//		FileFilter lambdaFileFilter = (File pathname) ->  pathname.getName().endsWith(".java");
//		FileFilter lambdaFileFilter = (pathname) ->  pathname.getName().endsWith(".java");
//		FileFilter lambdaFileFilter = pathname ->  pathname.getName().endsWith(".java");
//		File[] files = directoryFile.listFiles(lambdaFileFilter);
//		for (File file : files) {
//		System.out.println(file.getName());
		

		File[] files = directoryFile.listFiles(pathname ->  pathname.getName().endsWith(".java"));
		for (File file : files) {
		System.out.println(file.getName());
		
		
	}
	}
}
