import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * @Author :13340
 * @Date :Created in 2021-07-06-11:20
 * @Description:
 **/

public class LambdaDemoTest {
    @Test
    public void test1(){
        Consumer<String> consumer = (a)-> System.out.println("消费者接收到"+a);
        consumer.accept("这是周志鹏打的字");
    }

    @Test
    public void test02(){
        List<Integer> list = new ArrayList<>();
        List<Integer> integers = Arrays.asList(1,2,3);
        list.addAll(integers);
        //Supplier<T>
        Supplier<Integer> supplier = () -> (int)(Math.random() * 10);
        list.add(supplier.get());
        System.out.println(supplier);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
    @Test
    public void test03(){
        //Function<T, R>
        String oldStr = "abc123456xyz";
        Function<String, String> function = (s) -> s.substring(1, s.length()-1);
        //test
        System.out.println(function.apply(oldStr));
    }
    @Test
    public void test04(){
        //Predicate<T>
        Integer age = 35;
        Predicate<Integer> predicate = (i) -> i >= 35;
        if (predicate.test(age)){
            System.out.println("你该退休了");
        } else {
            System.out.println("我觉得还OK啦");
        }
    }
}