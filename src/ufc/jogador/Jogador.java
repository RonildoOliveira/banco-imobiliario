package ufc.jogador;

import ufc.IObserver;
import ufc.ISubject;

import java.util.ArrayList;

public class Jogador implements ISubject {

    private ArrayList<IObserver> IObservers;
    private double dinheiro;
    private int numeroDuplas;

    public Jogador() {
        numeroDuplas = 0;
        IObservers = new ArrayList<>();
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
}