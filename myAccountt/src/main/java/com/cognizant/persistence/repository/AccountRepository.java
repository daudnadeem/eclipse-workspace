package com.cognizant.persistence.repository;

public interface AccountRepository {

		String getAllAccounts();
		String createAccount(String movie);
		String deleteAccount(Long id);
		String getAccount(Long id);

	}
