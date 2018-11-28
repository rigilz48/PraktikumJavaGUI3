
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 100 Mbps
 */
public abstract class CloseFrame extends Frame implements WindowListener {
    
    Label label;
    
    public CloseFrame(String title) {
        super(title);
        label = new Label("Close The Frame");
        this.addWindowListener(this);
    }
    
    public void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        CloseFrame cf = new CloseFrame("Close Window Example") {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        };
        cf.launchFrame();
    }
}
