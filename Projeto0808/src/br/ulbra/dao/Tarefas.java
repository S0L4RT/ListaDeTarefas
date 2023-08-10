
package br.ulbra.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Tarefas {
    ArrayList listaTarefas;    
    public Tarefas(){
        listaTarefas = new ArrayList();
    }
    public void salvar(String elemento){
        listaTarefas.add(elemento);
        JOptionPane.showMessageDialog(null, "Tarefa salva com sucesso!");
    }
    public String listar(){
        String res = "";
        if(listaTarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Sua lista de tarefas está vazia!");
        }else{
            for(int i=0; i<listaTarefas.size();i++){
                res+= (i + 1) + " - " + listaTarefas.get(i)+"\n";
            }
        }
        return res;
    }
    public void remover(int i){
        if(listaTarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Impossível excluir, lista vazia!");
        }else{
            if((i-1)>=0&&(i-1)<listaTarefas.size()){
                listaTarefas.remove(i - 1);
                JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Este item não existe!");
            }
        }
    }
    public void alterar(int i, String novo){
        if(listaTarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        }else{
            if((i-1)>=0 && (i-1)<listaTarefas.size()){
                listaTarefas.set((i-1),novo);
                JOptionPane.showMessageDialog(null, "Item alterado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Este item não existe!");
            }
        }
    }
}
