package ufc;

public interface ISubject {

    public void register(IObserver IObserver);
    public void unregister(IObserver IObserver);
    public void notifyObserver();

}
