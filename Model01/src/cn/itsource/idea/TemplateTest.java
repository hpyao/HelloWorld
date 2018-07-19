package cn.itsource.idea;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/7/19-18:03
 *
 *
 */
public class TemplateTest {

    //模板6：psf
    public static final int INITNAL_SIZE = 10;

    //变形1:psfi
    public static final int HEHE_YYY = 10;

    //变形2：psfs
    public static final String INDEX = "agigou";


    //模板1：psvm main函数
    public static void main(String[] args) {

        //模板2：sout 变形：soutp soutm soutv xx.sout
        System.out.println("hello");

        System.out.println("args = [" + args + "]");

        System.out.println("TemplateTest.main");

        int num1 =10;
        System.out.println("num1 = " + num1);
        int num2 =20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //模板三：fori
        String[] names = new String[]{"TOM","Jarry","laozho","laoyao"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }
        //变形1：iter增强for
        for (String name : names) {
            System.out.println(name);
        }
        //变形2:itar普通循环
        for (int i = 0; i < names.length; i++) {
            String name = names[i];

        }
    }

    public void method(){
        System.out.println("TemplateTest.method");

        //模板四：list.for
        List<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("zl");

        for (String str : list) {
            System.out.println(str);
        }

        //变形1:list.fori
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        //变形2：list.forr 倒序
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        
        //模板五：ifn inn list.nn list.null
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }



    }
}
