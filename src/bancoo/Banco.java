package bancoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco implements Imprimivel {

    ArrayList<ContaBancaria> listaContas = new ArrayList<>();

    public void inserirConta(ContaBancaria conta) {

        listaContas.add(conta);
        System.out.println(listaContas.size());
        mostrarDados();

    }

    public void removerConta(int numeroConta) {

        listaContas.remove(numeroConta);

    }

    public ContaBancaria procurarConta(int numeroConta) {

        return listaContas.get(numeroConta);

    }

    public void mostrarDados() {

        for (int i = 0; i < listaContas.size(); i++) {

            System.out.println(i);

            Imprimivel imp = (Imprimivel) listaContas.get(i);
            imp.mostrarDados();

        }
    }

}
