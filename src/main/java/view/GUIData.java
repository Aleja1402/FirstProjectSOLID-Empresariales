package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import model.Person;

public class GUIData extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JLabel lblUserName;
    private JTextField txtUserName;
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblSurname;
    private JTextField txtSurname;
    private JButton btnCreate;
    private JButton btnRead;
    private JButton btnUpdate;
    private JButton btnDelete;
    private PanelList panelList;
    private GUIPrincipal parent;

    public GUIData(GUIPrincipal parent) {
        this.parent = parent;
        
        setTitle("PERSON");
        setVisible(true);
        setResizable(false); // Evita que se redimensione
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear y añadir componentes
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // Agrega espacio entre los componentes
        lblUserName = new JLabel("UserName: ");
        txtUserName = new JTextField("");
        lblName = new JLabel("Name: ");
        txtName = new JTextField("");
        lblSurname = new JLabel("Surname: ");
        txtSurname = new JTextField("");
        centerPanel.add(lblUserName);
        centerPanel.add(txtUserName);
        centerPanel.add(lblName);
        centerPanel.add(txtName);
        centerPanel.add(lblSurname);
        centerPanel.add(txtSurname);

        add(centerPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        btnCreate = new JButton("Create");
        btnRead = new JButton("Read");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        southPanel.add(btnCreate);
        southPanel.add(btnRead);
        southPanel.add(btnUpdate);
        southPanel.add(btnDelete);

        add(southPanel, BorderLayout.SOUTH);

        panelList = new PanelList();
        add(panelList, BorderLayout.CENTER);

        btnCreate.addActionListener(this);
        btnRead.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCreate) {
            parent.createToController(txtUserName.getText(), txtName.getText(), txtSurname.getText());
            panelList.addPersonToTable(txtUserName.getText(), txtName.getText(), txtSurname.getText());
            panelList.updateView();
        } else if (e.getSource() == btnRead) {
            parent.listToController();
            List<Person> listObjects = parent.listToControllerReturn();
            panelList.loadData(listObjects);
        } else if (e.getSource() == btnUpdate) {
            parent.updateToController(txtUserName.getText(), txtName.getText(), txtSurname.getText());
            List<Person> listObjects = parent.listToControllerReturn();
            panelList.loadData(listObjects);
            //panelList.loadData();
        } else if (e.getSource() == btnDelete) {
            parent.deleteToController(txtUserName.getText());
            panelList.deleteSelectedRow();
            List<Person> listObjects = parent.listToControllerReturn();
            panelList.loadData(listObjects);            
        }
    }

}