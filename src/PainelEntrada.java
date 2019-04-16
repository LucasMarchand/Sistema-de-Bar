import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class PainelEntrada extends JFrame{
    private JTextField textField_nome;
    private JTextField textField_cpf;
    private JTextField textField_idade;
    private JTextField textField_genero;
    private JPanel painelEntrada;
    private JLabel label_titulo;
    private JLabel label_nome;
    private JLabel label_cpf;
    private JLabel label_idade;
    private JLabel label_genero;
    private JButton okButton;
    private String FileListaBar = "C:\\Users\\LucasMarchand\\IdeaProjects\\SistemaBar\\Lista.txt";


    public PainelEntrada(){
        add(painelEntrada);

        setTitle("Sistema do Bar");
        setSize(400,200);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String registro =
                        textField_nome.getText() + ";" +
                        textField_cpf.getText() + ";" +
                        textField_idade.getText() + ";" +
                        textField_genero.getText() ;
                System.out.println(registro);
                //JOptionPane.showMessageDialog;


                try {
                    boolean anexar = false;
                    File f = new File(FileListaBar);

                    if (f.length() != 0L)
                        anexar = true;

                    FileWriter writer = new FileWriter(new File(FileListaBar), anexar);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);

                    bufferedWriter.write(registro);

                    writer.flush();
                    writer.close();
                    //bufferedWriter.flush();
                    bufferedWriter.close();
                } catch (IOException erro){
                    erro.printStackTrace();
                }

            }
        });

    }
}
