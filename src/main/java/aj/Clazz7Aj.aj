package aj;

/**
 * Created by xesamguo@gmail.com on 16-8-8.
 */
public aspect Clazz7Aj {
    pointcut fn2():
            call(* aj.Clazz7.fn2());

    declare error:
            fn2() && !within(aj.Clazz7Aj):
            "hehehe";

    pointcut fn(Clazz7 clazz):
            call(* aj.Clazz7.fn(int, String))
            && this(clazz);

    before(Clazz7 clazz): fn(clazz){
        System.out.println("aop:before fn");
        clazz.fn2();
    }
}
