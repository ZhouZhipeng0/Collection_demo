import java.util.*;

/**
 * @Author :13340
 * @Date :Created in 2021-07-05-11:08
 * @Description: 一个集合的测试类，测试Collection类的方法
 **/


public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();

//      * 1.添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection);

//      * 2.删除元素
        collection.remove("榴莲");
        System.out.println("删除之后：" + collection.size());

//      * 3.遍历元素
        //3.1 使用增强for
        for (Object object : collection) {
            System.out.println(object);
        }
        //3.2 使用迭代器（迭代器专门用来遍历集合的一种方式）
        //hasnext();判断是否有下一个元素
        //next();获取下一个元素
        //remove();删除当前元素
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
            //删除操作
            //collection.remove(s);引发错误：并发修改异常
            //iterator.remove();应使用迭代器的方法

//      * 4.判断
            System.out.println(collection.contains("西瓜"));//true
            System.out.println(collection.isEmpty());//false
        }
    }
}
