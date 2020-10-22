package Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import operation.ProduitInterface;

public class Produit extends UnicastRemoteObject implements ProduitInterface {

	
	public Produit() throws RemoteException {
	}

	@Override
	public float Produit(float a, float b) throws RemoteException {
		return a*b;
	}



}
