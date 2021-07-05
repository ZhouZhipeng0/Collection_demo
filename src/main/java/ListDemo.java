import java.util.*;

/**
 * @Author :13340
 * @Date :Created in 2021-07-05-15:57
 * @Description:
 **/


public class ListDemo {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        //1.添加元素
        list.add("tang");
        list.add("he");
        list.add(0,"yu");//插入操作
        System.out.println("元素个数："+list.size());
        System.out.println(list.toString());
        //2.删除元素
        list.remove(0);
        //list.remove("yu");结果同上
        System.out.println("删除之后："+list.size());
        System.out.println(list.toString());
        //3.遍历元素
        //3.1 使用for遍历
        for(int i=0;i<list.size();++i) {
            System.out.println(list.get(i));
        }
        //3.2 使用增强for
        for(Object object:list) {
            System.out.println(object);
        }
        //3.3 使用迭代器
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //3.4使用列表迭代器，listIterator可以双向遍历，添加、删除及修改元素。
        ListIterator listIterator=list.listIterator();
        //从前往后
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        //从后往前（此时“遍历指针”已经指向末尾）
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        //4.判断
        System.out.println(list.isEmpty());
        System.out.println(list.contains("tang"));
        //5.获取位置
        System.out.println(list.indexOf("tang"));
    }
}
