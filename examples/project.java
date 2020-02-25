import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class project extends Frame implements ActionListener {
    String command = "";

    public static void main(String[] args) {
        Frame frame = new project();

        frame.setResizable(true);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public project() {
        setTitle("Data Structures");

        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        Menu fileMenu = new Menu("File");
        mb.add(fileMenu);

        MenuItem miAbout = new MenuItem("About");
        miAbout.addActionListener(this);
        fileMenu.add(miAbout);
        
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }

            public void windowActivated(WindowEvent ev) {
                repaint();
            }

            public void windowStateChanged(WindowEvent ev) {
                repaint();
            }
        };

        ComponentListener k = new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                repaint();
            }
        };

        this.addWindowListener(l);
        this.addComponentListener(k);
    }

    public void actionPerformed(ActionEvent ev) {
        command = ev.getActionCommand();

        if ("About".equals(command)) {
            repaint();
        } else {
            System.exit(0);
        }
    }

    public void paint(Graphics g) {
        int ww = this.getWidth();
        int wh = this.getHeight();

        Font f1 = new Font("SansSerif",Font.BOLD,16);
        Font f2 = new Font("SansSerif",Font.BOLD,16);
        g.setFont(f2);
        if ("About".equals(command)) {
            g.drawString("Hello My Name is Jason Anrico", 20, 100);
        }
        
    }
}