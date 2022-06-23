package com.yinglm.observer.v9;

import sun.awt.WindowClosingListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: yingliming
 * @Date: 2022/6/23 0023 - 06 - 23 - 20:03
 * @Description: com.yinglm.observer.v9
 * @Version: 1.0
 **/
public class TestFrame extends Frame {
    public void launch(){
        Button b= new Button("press me");
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());

        this.add(b);
        this.pack();

       this.addWindowListener(new winAdapter(){
           public  void windowClosing(WindowAdapter e){
               System.exit(0);
           }
       });
       this.setLocation(400,400);
       this.setVisible(true);




    }

    public static void main(String[] args) {
        new TestFrame().launch();
    }

    class winAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent windowEvent){

            System.exit(0);
        }
    }


    private class MyActionListener implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed!");
        }
    }

    private class MyActionListener2 implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed2 !");

        }
    }

}
