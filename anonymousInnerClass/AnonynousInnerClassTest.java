import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates anonymous inner classes
 * @version 1.01 2017-12-30
 * @author MA SI YUAN
 */

 public class AnonynousInnerClassTest
 {
     public static void main(String[] args) 
     {
         TalkingClock clock = new TalkingClock();
         clock.start(1000, true);

        // keep program running untill user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0); 
         
     }
 }

 /**
  * A clock that prints the time in regular intervals
  */

  class TalkingClock
  {
      /**
       * Starts the clock
       * @param interval the interval between messate (in milliseconds)
       * @param beep true if the clock should beep
       */
      public void start(int interval, boolean beep)
      {
          ActionListener listener = new ActionListener()
          {
              public void actionPerformed(ActionEvent event)
              {
                  System.out.println("At the tone, the time is " + new Date());
                  if (beep) Toolkit.getDefaultToolkit().beep();
              }                
              
          };
          Timer t = new Timer(interval, listener);
          t.start();


              
          
      }
  }