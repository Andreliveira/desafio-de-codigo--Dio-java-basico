
package DesafioDioJava;

import javax.swing.JOptionPane;

public class Iphone implements AparelhoTelefonico, NavegadorDaInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        JOptionPane.showMessageDialog(null,"Ligando com método da interface!");
        
    }

    @Override
    public void atender() {
        JOptionPane.showMessageDialog(null,"Atendendo com método da interface!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        JOptionPane.showMessageDialog(null, "Correio de voz com método da interface!");
    }

    @Override
    public void exibirPagina() {
        JOptionPane.showMessageDialog(null, "Exibindo Página Web com método da interface!");
    }

    @Override
    public void adicionarNovaAba() {
        JOptionPane.showMessageDialog(null, "Add Aba com método da interface!");
    }

    @Override
    public void atualizarPagina() {
        JOptionPane.showMessageDialog(null, "Atualizando página com método da interface!");
    }

    @Override
    public void tocar() {
        JOptionPane.showMessageDialog(null, "Tocando música com método da interface!");
    }

    @Override
    public void pausar() {
        JOptionPane.showMessageDialog(null, "Pausando a música com método da interface!");
    }

    @Override
    public void selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando a música com método da interface!");
    }
    
}
