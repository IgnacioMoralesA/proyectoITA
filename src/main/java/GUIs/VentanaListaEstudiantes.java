package GUIs;

import User.LoginEstudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaListaEstudiantes extends Ventana{
    private JLabel labelLista;
    private JTextField userInputPanel;
    private JPasswordField passInputPanel;
    private JPasswordField passConfirmationInputPanel;
    private JButton añadir;

    public VentanaListaEstudiantes() {
        super("Lista estudiantes",500,500);
        generarElementos();




    }
    public void generarElementos(){
        generarLabel();
        generar();
        generarBoton();
        generarInputPanels();

    }



    public void generarLabel(){

        labelLista = new JLabel("Curso");
        labelLista.setBounds(150, 30, 200, 40);
        labelLista.setForeground(Color.BLACK);
        labelLista.setFont(new Font("Calibri", Font.PLAIN, 40));
        super.add(labelLista);


    }
    public void generar(){
        VentanaTabla dou= new VentanaTabla(new String[12][2],new String[2]);
        dou.add(new VentanaListaEstudiantes());
        /*datos=new String[4];
        datos[0]=userInputPanel.getText();*/

        dou.generarTabla();
    }


    public void generarBoton(){
        String textoBoton = "Volver";
        this.añadir = super.generarBoton(textoBoton, 100, 400, 200, 80);
        this.add(this.añadir);
        this.añadir.addActionListener(this);



    }
    public void generarInputPanels() {
        JLabel labelUser = new JLabel("Usuario: ");
        labelUser.setBounds(30, 100, 200, 40);
        labelUser.setForeground(Color.BLACK);
        this.userInputPanel = new JTextField();
        userInputPanel.setBounds(200, 100, 200, 40);
        super.add(userInputPanel);
        super.add(labelUser);

        JLabel labelPass = new JLabel("Contraseña: ");
        labelPass.setBounds(30, 200, 200, 40);
        labelPass.setForeground(Color.BLACK);
        this.passInputPanel = new JPasswordField();
        passInputPanel.setBounds(200, 200, 200, 40);
        super.add(passInputPanel);
        super.add(labelPass);

        JLabel labelPassVerify = new JLabel("Confirmar Contraseña: ");
        labelPassVerify.setBounds(30, 300, 200, 40);
        labelPassVerify.setForeground(Color.BLACK);
        this.passConfirmationInputPanel = new JPasswordField();
        passConfirmationInputPanel.setBounds(200, 300, 200, 40);
        super.add(passConfirmationInputPanel);
        super.add(labelPassVerify);
    }
    public void registrarUsuario(String user, String pass,String confirmation) {
        if (!user.isEmpty() && !pass.isEmpty()) {
            if (pass.equalsIgnoreCase(confirmation)) {
                LoginEstudiante loginEstudiante = new LoginEstudiante(user,pass);
                if(!loginEstudiante.registroCheck("src\\main\\resources\\registroEstudiantes")) {
                    loginEstudiante.registrarUsuario();
                    JOptionPane.showMessageDialog(this, "Registro exitoso.");
                }
                else {
                    JOptionPane.showMessageDialog(this, "Nombre de usuario ya registrado, intente uno diferente.");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Registro no exitoso, intente nuevamente.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Registro no exitoso, intente nuevamente.");
        }
    }


    public void actionPerformed(ActionEvent e) {
        String user = userInputPanel.getText();
        String pass = String.valueOf(passInputPanel.getPassword());
        String confirmation = String.valueOf(passConfirmationInputPanel.getPassword());
        if (e.getSource() == this.añadir) {
            registrarUsuario(user, pass, confirmation);

        }

        /*if (e.getSource() == this.añadir) {
            VentanaProfesor m=new VentanaProfesor();
            System.out.println(m);


            /*VentanaProfesor m=new VentanaProfesor();
            m.devolverValor(m.getCurso());
            System.out.println(m);
            this.nombrex=m.getCurso();
            System.out.println(this.nombrex);
            labelLista.setText(this.nombrex);*/


    }


}

