package com.yinglm.servlet.v;

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
        request.str="��Һ�:), <script>, ��ӭ����yinglm.com, ��Ҷ���996";
        Response response= new Response();
        response.str= "";
        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request,response,chain);

//        Msg msg = new Msg();
//        msg.setMsg("��Һ�:), <script>, ��ӭ����yinglm.com, ��Ҷ���996 ");
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
        System.out.println(request.str);
        System.out.println(response.str);


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
    boolean doFilter(Request request, Response response,FilterChain chain);
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response,FilterChain chain) {
        request.str= request.str.replaceAll("<","[").replaceAll(">","]");
        response.str+= "--HTMLFilter()";
//        String r= m.getMsg();
//        r= r.replace('<','[') ;
//        r=r.replace('>',']');
//        m.setMsg(r);
        return true;

    }
}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response,FilterChain chain) {
        request.str= request.str.replaceAll("996","955");
        response.str+= "--SensitiveFilter()";
//        String r= m.getMsg();
//        r=r.replaceAll("996","955");
//        m.setMsg(r);
        return true;

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
    int index=0;

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response,FilterChain chain){
        if(index == filters.size()) return false;
        Filter f= filters.get(index);
        index++;

        return f.doFilter(request,response, chain);
    }
}