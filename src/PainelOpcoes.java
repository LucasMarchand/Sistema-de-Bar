import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class PainelOpcoes extends JFrame {
    private JButton listarPessoasPresentesButton;
    private JButton registrarSaídaButton;
    private JButton quantidadeDePessoasPresentesButton;
    private JButton consultarCPFButton;
    private JButton registrarEntradaButton;
    private JPanel painelOpcoes;

    public PainelOpcoes(){

        add(painelOpcoes);

        setTitle("Sistema do Bar");
        setSize(400,200);

    }
}
