package tpvFdS;

public class PrincipalTPV {
    public static void main(String[] args) {
        tpvWiew2_0 vista = new tpvWiew2_0();
        new ControladorTPV(vista);
        vista.setVisible(true);
    }
}