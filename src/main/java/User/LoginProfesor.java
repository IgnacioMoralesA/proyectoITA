package User;
import data.DataUpdater;
import data.FileReader;

import java.util.ArrayList;

public class LoginProfesor {
    private String user;
    private String pass;
    private boolean loginState = false;

    public LoginProfesor(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public void registrarUsuario() {
        int newId = FileReader.leerArchivo("src\\main\\resources\\registroProfesores").size() + 1;
        DataUpdater.guardarUsuario(this.user, this.pass, "src\\main\\resources\\registroProfesores", newId);
    }

    public String[] logearUsuario(String filepath) {
        ArrayList<String> registros = FileReader.leerArchivo(filepath);
        this.loginState = false;
        String[] usuarioLogeado = new String[6];
        for (int i = 0; i < registros.size(); i++) {
            String[] temp = registros.get(i).split(",");
            if (this.user.equalsIgnoreCase(temp[0]) && this.pass.equalsIgnoreCase(temp[1])) {
                this.loginState = true;
                usuarioLogeado = temp;
            }
        }
        return usuarioLogeado;
    }

    public boolean registroCheck(String filepath) {
        ArrayList<String> registros = FileReader.leerArchivo(filepath);
        this.loginState = false;
        for (String registro : registros) {
            String[] temp = registro.split(",");
            if (this.user.equalsIgnoreCase(temp[0])) {
                this.loginState = true;
                break;
            }
        }
        return this.loginState;
    }

    public boolean isLoginState() {
        return loginState;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
