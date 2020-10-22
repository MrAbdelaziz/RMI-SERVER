package operation;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PalindromeInterface extends Remote{
	Boolean Palindrome(String chaine) throws RemoteException;
}
