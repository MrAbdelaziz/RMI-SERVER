package Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import operation.PalindromeInterface;
import operation.TrielistInterface;

public class Palindrome extends UnicastRemoteObject implements PalindromeInterface {

	
	public Palindrome() throws RemoteException {
	}

	@Override
	public Boolean Palindrome(String chaine) throws RemoteException {
		//  TODO Auto-generated method stub
		
		Reverse s = new Reverse();
		String res = s.reverseString(chaine);

		return res.equals(chaine);
	}



}
