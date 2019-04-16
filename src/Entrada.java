import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.math.BigInteger;

public class Entrada {

    public static void main(String[] args)  throws IOException {

        /*
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");

        String nomeCompleto = nome + " " + sobreNome;

        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,"Informação",JOptionPane.INFORMATION_MESSAGE);
        */
        // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        novaEntrada();
    }

    public static void novaEntrada(){


        PainelEntrada P = new PainelEntrada();
        P.setVisible(true);
    }

}
