package com.cognizant.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import com.cognizant.persistence.domain.Account;
import com.cognizant.util.JSONUtil;
import com.cognizant.persistence.domain.Account;


	@Transactional(SUPPORTS)
	@Default
	public class AccountDBRepository implements AccountRepository {

		@PersistenceContext(unitName = "primary")
		private EntityManager manager;

		@Inject
		private JSONUtil util;

		public String getAllAccounts() {
			Query query = manager.createQuery("Select a FROM Account a");
			Collection<Account> accounts = (Collection<Account>) query.getResultList();
			return util.getJSONForObject(accounts);
		}
		
		@Transactional(REQUIRED)
		public String createAccount(String jsonAccount) {
			Account anAccount = util.getObjectForJSON(jsonAccount, Account.class);
			manager.persist(anAccount);
			return "{\"message\": \"movie has been sucessfully added\"}";
		}

		@Transactional(REQUIRED)
		public String deleteAccount(Long id) {
			Account accountInDB = findAccount(id);
			if (accountInDB != null) {
				manager.remove(accountInDB);
			}
			return "{\"message\": \"movie sucessfully deleted\"}";
		}
		
		public String getAccount(Long id) {
			Account anAccount =  manager.find(Account.class, id);
			return util.getJSONForObject(anAccount);
		}

		private Account findAccount(Long id) {
			return manager.find(Account.class, id);
		}

		public void setManager(EntityManager manager) {
			this.manager = manager;
		}

		public void setUtil(JSONUtil util) {
			this.util = util;
		}
	}

