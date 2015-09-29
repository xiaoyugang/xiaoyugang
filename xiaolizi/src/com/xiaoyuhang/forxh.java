package com.xiaoyuhang;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 上午11:41:10
 */
public class forxh {
	public static void  Test(){
        System.out.println("=============算术右移 >> ===========");
        int i=0xC0000000;
        System.out.println("移位前：i= "+i+" = "+Integer.toBinaryString(i)+"(B)");
        i=i>>28;
        System.out.println("移位后：i= "+i+" = "+Integer.toBinaryString(i)+"(B)");

        System.out.println("---------------------------------");

        int j=0x0C000000;
        System.out.println("移位前：j= "+j+" = "+Integer.toBinaryString(j)+"(B)");
        j=j>>24;
        System.out.println("移位后：j= "+j+" = "+Integer.toBinaryString(j)+"(B)");

        System.out.println("\n");
        System.out.println("==============逻辑右移 >>> =============");
        int m=0xC0000000;
        System.out.println("移位前：m= "+m+" = "+Integer.toBinaryString(m)+"(B)");
        m=m >>> 28;
        System.out.println("移位后：m= "+m+" = "+Integer.toBinaryString(m)+"(B)");

        System.out.println("---------------------------------");

        int n=0x0C000000;
        System.out.println("移位前：n= "+n+" = "+Integer.toBinaryString(n)+"(B)");
        n=n>>24;
        System.out.println("移位后：n= "+n+" = "+Integer.toBinaryString(n)+"(B)");

        System.out.println("\n");
        System.out.println("==============移位符号的取模===============");
        int a=0xCC000000;
        System.out.println("移位前：a= "+a+" = "+Integer.toBinaryString(a)+"(B)");
        System.out.println("算术右移32：a="+(a>>32)+" = "+Integer.toBinaryString(a>>32)+"(B)");
        System.out.println("逻辑右移32：a="+(a>>>32)+" = "+Integer.toBinaryString(a>>>32)+"(B)");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		Integer i = new Integer(1);
//		for (;;) {
//			if(i==10){
//				break;
//			}
//			i++;
//            System.out.println((12) >>> (1));
//        }
		Test();
	}

}
