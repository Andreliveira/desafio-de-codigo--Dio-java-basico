
package DesafioDioJava;

import javax.swing.JOptionPane;

public class Principal extends Iphone {
    public static void main(String[] args) {
        Iphone cel = new Iphone();
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua escolha: 1 - Aparelho Telefonico, 2 - Reprodutor Musical, 3 - Navegador da Internet."));
        if(escolha == 1){
            int tel = Integer.parseInt(JOptionPane.showInputDialog("Digite sua escolha: 1 - Ligar, 2 - Atender, 3 - Iniciar Correio de Voz. "));
            int chamada = tel;
            switch(chamada){
                  case 1:
                       cel.ligar();
                       break;
                  case 2:
                       cel.atender();
                       break;
                  case 3:
                       cel.iniciarCorreioDeVoz();
                       break;
                  default:
                        JOptionPane.showMessageDialog(null, "Opção inválida para Aparelho Telefonico!");
                        break;
            }
        }else if(escolha == 2){ 
                int repro = Integer.parseInt(JOptionPane.showInputDialog("Digite sua escolha: 1 - Tocar, 2 - Pausar, 3 - Selecionar."));
                int decisao = repro;
                switch(decisao){
                      case 1:
                           cel.tocar();
                           break;
                      case 2:
                           cel.pausar();
                           break;
                      case 3:
                           cel.selecionar();
                           break;
                      default:
                        JOptionPane.showMessageDialog(null, "Opção inválida para Reprodutor Musical!");
                        break;
                } 
        }else if(escolha == 3){
                int net = Integer.parseInt(JOptionPane.showInputDialog("Digite sua escolha: 1 - Exibir Pagina Web, 2 - Adicionar Nova Aba, 3 - Atualizar Pagina. "));
                int navegar = net;
                switch(navegar){
                      case 1:
                           cel.exibirPagina();
                           break;
                      case 2:
                           cel.adicionarNovaAba();
                           break;
                      case 3:
                           cel.atualizarPagina();
                           break;
                      default:
                        JOptionPane.showMessageDialog(null, "Opção inválida para Navegador da Internet");
                         break;
                }
                      
        }else
             JOptionPane.showMessageDialog(null, "Opção inválida");       
    }    
}
