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
        msg.setMsg("��Һ�:), <script>, ��ӭ����yinglm.com, ��Ҷ���996 ");

//        List<Filter> filters=new ArrayList<>();

        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());

        FilterChain fc2= new FilterChain();
        fc2.add(new FaceFilter()).add(new URLFilter());

        fc.add(fc2);
        fc.doFilter(msg);


//        filters.add(new HTMLFilter());
//        filters.add(new SensitiveFilter());

        //����msg
//        String r= msg.getMsg();
//         r= r.replace('<','[') ;
//         r=r.replace('>',']');
//        msg.setMsg(r);

//        r=r.replaceAll("996","955");
//        msg.setMsg(r);

//        new HTMLFilter().doFilter(msg);
//        new SensitiveFilter().doFilter(msg);

//        for(Filter f :filters){
//            f.doFilter(msg);
//
//        }
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

class FaceFilter implements Filter{

    @Override
    public void doFilter(Msg m) {
        String r= m.getMsg();
        r=r.replace(":)","^V^");
        m.setMsg(r);

    }
}

class URLFilter implements Filter{

    @Override
    public void doFilter(Msg m) {
        String r= m.getMsg();
        r=r.replace("yinglm.com","http://www.yinglm.com");
        m.setMsg(r);

    }
}


class FilterChain implements Filter{
    List<Filter> filters=new ArrayList<>();
    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    public void doFilter(Msg msg){
        for(Filter f :filters){
            f.doFilter(msg);

        }
    }
}