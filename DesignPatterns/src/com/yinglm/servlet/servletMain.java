package com.yinglm.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yingliming
 * @Date: 2022/6/20 0020 - 06 - 20 - 19:55
 * @Description: com.yinglm.dp.cor
 * @Version: 1.0
 **/
public class servletMain {
    public static void main(String[] args) {

        Request request = new Request();
        request.str="大家好:), <script>, 欢迎访问yinglm.com, 大家都是996";
        Response response= new Response();
        response.str= "response";

//        Msg msg = new Msg();
//        msg.setMsg("大家好:), <script>, 欢迎访问yinglm.com, 大家都是996 ");
//
////        List<Filter> filters=new ArrayList<>();
//
//        FilterChain fc = new FilterChain();
//        fc.add(new HTMLFilter()).add(new SensitiveFilter());
//
//        FilterChain fc2= new FilterChain();
//        fc2.add(new FaceFilter()).add(new URLFilter());
//
//        fc.add(fc2);
//        fc.doFilter(msg);


//        filters.add(new HTMLFilter());
//        filters.add(new SensitiveFilter());

        //处理msg
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
        System.out.println(request.str);


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

class Request{
    String str;
}
class Response{
    String str;
}

interface  Filter{
    boolean doFilter(Request request,Response response);
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Request request,Response response) {
        request.str= request.str.replaceAll("<","[").replaceAll(">","]");
//        String r= m.getMsg();
//        r= r.replace('<','[') ;
//        r=r.replace('>',']');
//        m.setMsg(r);
        return true;

    }
}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request,Response response) {
//        String r= m.getMsg();
//        r=r.replaceAll("996","955");
//        m.setMsg(r);
        return false;

    }
}

//class FaceFilter implements Filter {
//
//    @Override
//    public boolean doFilter(Msg m) {
//        String r= m.getMsg();
//        r=r.replace(":)","^V^");
//        m.setMsg(r);
//        return  true;
//
//    }
//}

//class URLFilter implements Filter {
//
//    @Override
//    public boolean doFilter(Msg m) {
//        String r= m.getMsg();
//        r=r.replace("yinglm.com","http://www.yinglm.com");
//        m.setMsg(r);
//        return true;
//
//    }
//}


class FilterChain implements Filter {
    List<Filter> filters=new ArrayList<>();
    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request,Response response){
//        for(Filter f :filters){
//            if(!f.doFilter(msg)) return false;
//
//        }
        return false;
    }
}