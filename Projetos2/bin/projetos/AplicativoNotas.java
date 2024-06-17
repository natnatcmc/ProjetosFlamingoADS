package projetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AplicativoNotas extends JFrame implements ActionListener {

    private JTextArea areaTexto;
    private JButton botaoSalvar, botaoEditar, botaoExcluir;

    public AplicativoNotas() {
        setTitle("Aplicativo de Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER));

        botaoSalvar = new JButton("Salvar");
        botaoSalvar.addActionListener(this);
        painelBotoes.add(botaoSalvar);

        botaoEditar = new JButton("Editar");
        botaoEditar.addActionListener(this);
        painelBotoes.add(botaoEditar);

        botaoExcluir = new JButton("Excluir");
        botaoExcluir.addActionListener(this);
        painelBotoes.add(botaoExcluir);

        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoSalvar) {
            salvarNota();
        } else if (e.getSource() == botaoEditar) {
            editarNota();
        } else if (e.getSource() == botaoExcluir) {
            excluirNota();
        }
    }

    private void salvarNota() {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showSaveDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                String texto = areaTexto.getText();
                String caminhoArquivo = fileChooser.getSelectedFile().getAbsolutePath();
                ArquivoUtil.salvarTexto(texto, caminhoArquivo);
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void editarNota() {
        areaTexto.setEditable(true);
        JOptionPane.showMessageDialog(this, "Edite a nota e clique em Salvar para salvar as alterações.", "Editar Nota", JOptionPane.INFORMATION_MESSAGE);
    }

    private void excluirNota() {
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir a nota?", "Excluir Nota", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            areaTexto.setText("");
            JOptionPane.showMessageDialog(this, "Nota excluída com sucesso!", "Excluir Nota", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AplicativoNotas::new);
    }
}

class ArquivoUtil {
    public static void salvarTexto(String texto, String caminhoArquivo) throws IOException {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            writer.write(texto);
        }
    }
}
