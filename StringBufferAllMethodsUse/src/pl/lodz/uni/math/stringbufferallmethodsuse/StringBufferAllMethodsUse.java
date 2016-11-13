/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.stringbufferallmethodsuse;

/**
 *
 * @author micha
 */
public class StringBufferAllMethodsUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer strBuff=new StringBuffer("JAVA");
        
        System.out.println("Length: "+strBuff.length());
        System.out.println("Capacity: "+strBuff.capacity());
        
        strBuff.ensureCapacity(128);
        strBuff.setLength(8);
        System.out.println("New length: "+strBuff.length());
        System.out.println("New capacity: "+strBuff.capacity());
        
        System.out.println("CharAt 1: "+strBuff.charAt(1));
        strBuff.setCharAt(1, 'B');
        System.out.println("CharAt 1 after setCharAt: "+strBuff.charAt(1));
        
        char[] chars=new char[3];
        strBuff.getChars(0, 3, chars, 0);
        System.out.println("GetChars 0-2: ");
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }
        
        strBuff.append("JAVA");
        System.out.println("\nAfter append 'JAVA': "+ strBuff);
        
        strBuff.insert(3, "java");
        System.out.println("\nAfter insert on index 3: "+ strBuff);
        
        strBuff.reverse();
        System.out.println("After reverse: "+strBuff);
        
        strBuff.delete(0, 2);
        System.out.println("After delete chars 0-2: "+strBuff);
        
        strBuff.deleteCharAt(0);
        System.out.println("After deleteCharAt 0: "+strBuff);
        
        strBuff.replace(0, 1, "01");
        System.out.println("After replace 0-1: "+strBuff);
        
        String subStr=strBuff.substring(0, 2);
        System.out.println("Substring 0-2: "+subStr);
        
        System.out.println("codePointAt 1: "+strBuff.codePointAt(1));
        System.out.println("codePointBefore 1: "+strBuff.codePointBefore(1));
        System.out.println("codePointCount 0-2: "+strBuff.codePointCount(0,2));
        System.out.println("indexOf 'V': "+strBuff.indexOf("V"));
        System.out.println("lastIndexOf 'a': "+strBuff.indexOf("a"));
        System.out.println("offsetByCodePoints(0,8): "+strBuff.offsetByCodePoints(0, 8));
        
        strBuff.trimToSize();
        System.out.println("Size after trim: "+strBuff.capacity());
    }
    
}
