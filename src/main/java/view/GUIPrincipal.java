package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import model.Person;

public class GUIPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;

    private Controller controller;
    private PanelOperations panelOperations;

    public GUIPrincipal(Controller controller) {
        setTitle("BE FIT");
        setVisible(true);
        setResizable(true);
        setSize(500, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("Images/be-fit.jpg");
        JLabel label = new JLabel(icon);
        add(label, BorderLayout.NORTH);
        
        panelOperations = new PanelOperations(this);
        add(panelOperations, BorderLayout.CENTER);
        
        // Add the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        fileMenu.add(exitMenuItem);
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");

        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUIPrincipal.this, "BE FIT App v1.0 desgined by Alejandra Moreano Vásquez", "About", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        helpMenu.add(aboutMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        this.controller = controller;
    }

    public void create() {
        GUIData data = new GUIData(this);
        data.setVisible(true);
    }

    public void read() {
        // TO DO
    }

    public void update() {
        // TO DO
    }

    public void delete() {
        // TO DO
    }

    public void clean() {
        // TO DO
    }

    void createToController(String name, String surname, String program) {
        controller.handleCreate(name, surname, program);
    }

    void listToController() {
        controller.handleRead();
    }
    
    List<Person> listToControllerReturn() {
        return controller.handleReadM();
    }

    void updateToController(String name, String surname, String program) {
        controller.handleUpdate(name, surname, program);        
    }

    void deleteToController(String userName) {
        controller.handleDelete(userName);
    }
    
}