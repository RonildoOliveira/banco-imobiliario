package ufc.jogador;

import ufc.IObserver;
import ufc.ISubject;

import java.util.ArrayList;

public class Jogador implements ISubject {

    private ArrayList<IObserver> IObservers;
    private ArrayList<Propriedade> propriedades;

    private double dinheiro;
    //contar a qut dados repetidos
    private int numeroDuplas;
    private int posicao;

    public Jogador() {
        dinheiro = 800;
        numeroDuplas = 0;
        IObservers = new ArrayList<>();
        propriedades = new ArrayList<>();
        posicao = 0;
    }

    @Override
    public void register(IObserver IObserver) {
        IObservers.add(IObserver);
    }

    @Override
    public void unregister(IObserver IObserver) {
        int observerIndex = IObservers.indexOf(IObserver);
        IObservers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (IObserver IObserver : IObservers) {
            IObserver.update(dinheiro);
        }
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
        notifyObserver();
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}