//package oopQuestions;
//
//abstract class X2 {
//	static String s1 = "STATIC";
//	String s2 = "NON-STATIC";
//	
//	abstract void methodX();
//	
//	static abstract class Y {
//		String s1 = "NON-STATIC";
//		static String s2 = "STATIC";
//		abstract void methodY();
//	}
//}
//
//public class MainClass {
//	public static void main(String[] args) {
//		new X2() {
//			@Override
//			void methodX() {
//				System.out.println(s1 + " " + s2);
//			}
//		}.methodX();
//		
//		new X.Y() {
//			@Override
//			void methodY() {
//				System.out.println(s1 + " " + s2);
//			}
//		}.methodY();
//	}
//
//}
