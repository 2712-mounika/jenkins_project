package com.twitter.dao;

public class TwitterDAO implements TwitterDAOInterface{
	private TwitterDAO() {}

	public static TwitterDAOInterface CreateObject() {
		// TODO Auto-generated method stub
		return new TwitterDAO();
	}

	@Override
	public int createProfileDAO() {
		// TODO Auto-generated method stub
		return 1;
	}

}
