package ufc;

import java.util.ArrayList;

public class Jogador implements Subject {

    private ArrayList<Observer> observers;
    private double dinheiro;

    public Jogador() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        observers.remove(observerIndex);
    }


    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(dinheiro);
        }
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
        notifyObserver();
    }
}