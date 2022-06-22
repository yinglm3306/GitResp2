package com.yinglm.servlet.v3;

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

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request,response,chain);
        System.out.println(request.str);
        System.out.println(response.str);
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
        chain.doFilter(request,response,chain);
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
        chain.doFilter(request,response,chain);
        response.str+= "--SensitiveFilter()";
//        String r= m.getMsg();
//        r=r.replaceAll("996","955");
//        m.setMsg(r);
        return true;

    }
}


class FilterChain implements Filter {
    List<Filter> filters=new ArrayList<>();
    int index=0 ;

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response,FilterChain chain){

        if(index==filters.size()) return false ;

        Filter f= filters.get(index);
        index++;
        return f.doFilter(request,response,chain);
    }
}