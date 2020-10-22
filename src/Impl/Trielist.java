package Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import operation.TrielistInterface;

public class Trielist extends UnicastRemoteObject implements TrielistInterface {

	
	public Trielist() throws RemoteException {
	}

	@Override
	public ArrayList<String> Trielist(ArrayList<String> list) {
		Collections.sort(list);
		return list;
	}

}
