package operation;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProduitInterface extends Remote{
	float Produit(float a , float b) throws RemoteException;
}
