package com.twitter.service;

import com.twitter.dao.TwitterDAO;
import com.twitter.dao.TwitterDAOInterface;
import com.twitter.entity.TwitterEmployee;

public class TwitterService implements TwitterServiceInterface
{
	private TwitterService() {}

	public static TwitterServiceInterface CreateServiceObject() {
		// TODO Auto-generated method stub
		return new TwitterService();
	}

	@Override
	public int CreateProfile(TwitterEmployee te) {
		// TODO Auto-generated method stub
		TwitterDAOInterface id=TwitterDAO.CreateObject();
		return id.createProfileDAO();
	}

}
