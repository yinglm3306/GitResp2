package com.yinglm.dp.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yingliming
 * @Date: 2022/6/20 0020 - 06 - 20 - 19:55
 * @Description: com.yinglm.dp.cor
 * @Version: 1.0
 **/
public class Main {
    public static void main(String[] args) {

        Msg msg = new Msg();
        msg.setMsg("大家好:), <script>, 欢迎访问yinglm.com, 大家都是996 ");

        List<Filter> filters=new ArrayList<>();
        filters.add(new HTMLFilter());
        filters.add(new SensitiveFilter());

        //处理msg
//        String r= msg.getMsg();
//         r= r.replace('<','[') ;
//         r=r.replace('>',']');
//        msg.setMsg(r);

//        r=r.replaceAll("996","955");
//        msg.setMsg(r);

//        new HTMLFilter().doFilter(msg);
//        new SensitiveFilter().doFilter(msg);

        for(Filter f :filters){
            f.doFilter(msg);

        }
        System.out.println(msg);


    }
}

class  Msg{
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

interface  Filter{
    void doFilter(Msg m);
}

class HTMLFilter implements Filter{

    @Override
    public void doFilter(Msg m) {
        String r= m.getMsg();
        r= r.replace('<','[') ;
        r=r.replace('>',']');
        m.setMsg(r);

    }
}

class SensitiveFilter implements Filter{

    @Override
    public void doFilter(Msg m) {
        String r= m.getMsg();
        r=r.replaceAll("996","955");
        m.setMsg(r);

    }
}