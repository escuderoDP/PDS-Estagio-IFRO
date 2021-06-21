/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Fabricio
 */
public class Aparencia {
    
    public static boolean temaPrincipal(JFrame fr){
        try{
            temaWindows(fr);
            fr.setIconImage(new ImageIcon("icon.png").getImage());
            return true;
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        }
        
    }
    
    private static boolean temaTattoo(JFrame fr){
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            return true;
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    private static boolean temaPsg(JFrame fr){
        try{
            UIManager.setLookAndFeel("com.pagosoft.plaf.PgsLookAndFeel");
            return true;
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){
            System.out.println(ex);
            return false;
        }
    }
    
    private static boolean temaWindows(JFrame fr){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            return true;
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){
            System.out.println(ex);
            return false;
        }
    }
}
