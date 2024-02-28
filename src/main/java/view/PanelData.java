package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//public class PanelUser extends JPanel implements ActionListener {
public class PanelData extends JPanel {

    private static final long serialVersionUID = 1L;

    // ATRIBUTOS
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblSurname;
    private JTextField txtSurname;
    private JLabel lblProgram;
    private JTextField txtProgram;

    public PanelData() {

        // DISEÑO
        TitledBorder borde = BorderFactory.createTitledBorder("User");
        setBorder(borde);
        borde.setTitleColor(Color.BLACK);
        borde.setTitleFont(getFont());
        setLayout(new GridLayout(5, 4));

        // CREACIÓN DE OBJETOS
        lblName = new JLabel("Name: ");
        txtName = new JTextField("");
        lblSurname = new JLabel("Surname: ");
        txtSurname = new JTextField("");
        lblProgram = new JLabel("Program: ");
        txtProgram = new JTextField("");

        // SETEDITABLE
        txtName.setEditable(false);
        txtSurname.setEditable(false);
        txtProgram.setEditable(false);

        // ADICIONAR OBJETOS
        add(lblName);
        add(txtName);
        add(lblSurname);
        add(txtSurname);
        add(lblProgram);
        add(txtProgram);

        // ADICIONAR ACTIONLISTENER 
        //txtName.addActionListener(this);
        //txtSurname.addActionListener(this);
        //txtProgram.addActionListener(this);
    }
    
    /*
    // ENTREGAR LOS DATOS EN EL TIPO DE DATOS QUE SE REQUIERE
    public double getTxtValorVerdaderoEnDouble() {
        return Double.parseDouble(txtName.getText());
    }
    */

    /*
    public ArrayList<Double> getTxtMedidasEnArray() {
        String[] medidasString = (txtSurname.getText().split(","));
        ArrayList<Double> medidas = new ArrayList<>();
        for (int i = 0; i < medidasString.length; i++) {
            medidas.add(Double.parseDouble(medidasString[i]));
        }
        return medidas;
    }
    */

    // CLEAN THE RESULTS
    public void setTxtName(String txtName) {
        this.txtName.setText(txtName);
    }

    public void setTxtSurname(String txtSurname) {
        this.txtSurname.setText(txtSurname);
    }

    public void setTxtProgram(String txtProgram) {
        this.txtProgram.setText(txtProgram);
    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txtName) {
            JOptionPane.showMessageDialog(this, "Ingrese las medidas separadas por una coma (,)", "Mensaje importante", JOptionPane.WARNING_MESSAGE);
        }
    }
    */
    
}