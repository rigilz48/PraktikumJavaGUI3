
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 100 Mbps (Rigil Makmun)
 */
public class MainFormIDM2 {
    public static void main (String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
    } finally{
            JTextField Nama = new JTextField(18);
            JComboBox Buah = new JComboBox();
            Buah.addItem("Apple");
            Buah.addItem("Mangga");
            Buah.addItem("Nanas");
            Buah.addItem("Jeruk");
            
            JPanel myPanel = new JPanel();
            Object[] content = {
                "Masukkan nama :", Nama,
                "Pilih buah kesukaan anda?", Buah
            };
            
            int result = JOptionPane.showConfirmDialog(null, content, "Pilih Masukan", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Nama : "+Nama.getText()+"\nBuah kesukaan anda : "+Buah.getSelectedItem()+"\n");
            }
        }
    }
}
