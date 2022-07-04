package User;
import data.FileReader;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class UnitTest {

    @Test
    void textReader() {
        ArrayList<String> actual = FileReader.leerArchivo("src/test/testResources/readerTest");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("pato");
        expected.add("purific");
        assertEquals(expected, actual);
    }

    @Test
    void loginTest(){
        LoginEstudiante loginTrue = new LoginEstudiante("userExpected","passExpected");
        loginTrue.logearUsuario("src/test/testResources/usuarioTest");

        LoginEstudiante loginFalse = new LoginEstudiante("userExpectedFalse","passExpectedFalse");
        loginFalse.logearUsuario("src/test/testResources/usuarioTest");

        assertTrue(loginTrue.isLoginState());
        assertFalse(loginFalse.isLoginState());
    }



    @Test
    void registroCheckTest(){
        ArrayList<String> file = FileReader.leerArchivo("src/test/testResources/usuarioTest");
        String[] actual = file.get(file.size()-1).split(",");
        LoginProfesor loginTrue = new LoginProfesor(actual[0],actual[1]);
        LoginProfesor loginFalse = new LoginProfesor("expectedToFail","expectedToFail");
        assertTrue(loginTrue.registroCheck("src/test/testResources/usuarioTest"));
        assertFalse(loginFalse.registroCheck("src/test/testResources/usuarioTest"));
    }



}