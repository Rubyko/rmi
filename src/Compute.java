import rubyko.java.rmi.Remote;
import rubyko.java.rmi.RemoteException;

public interface Compute extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}