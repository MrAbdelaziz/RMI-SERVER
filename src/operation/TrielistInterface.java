package operation;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface TrielistInterface extends Remote{
	ArrayList<String> Trielist(ArrayList<String> list) throws RemoteException;
}
