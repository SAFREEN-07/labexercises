/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author 91936
 */
public class CreateCounter extends Applet implements Runnable{
    int counter;
    Thread t;
    
    @Override
    public void init(){
        counter=0;
        t=new Thread(this);
        t.start();//To change the body of generated methods,choose tools |templates
    }
    
    
    @Override
    public void run() {
        try{
            while(true){
                repaint();
                Thread.sleep(100);
                ++counter;
            }
            
        }catch(Exception e){
            
        }
       //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void paint(Graphics g){
        g.setFont(new Font("Bauhaus 93",Font.BOLD,30));
        FontMetrics fm=g.getFontMetrics();
        String s=""+counter;
        Dimension d=getSize();
        int x=d.width/2 - fm.stringWidth(s)/2;
        int y=d.height/2;
        g.drawString(s, x, y);
        super.paint(g);
        
    }
    
}
