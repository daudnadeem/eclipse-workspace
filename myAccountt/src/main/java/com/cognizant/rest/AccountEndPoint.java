package com.cognizant.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.cognizant.business.service.AccountService;

@Path("/accountt")
public class AccountEndPoint {

	@Inject
	private AccountService service;

	@Path("/getAllMovies")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@Path("/getAnAccount/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts(@PathParam("id") Long id) {
		return service.getAnAccount(id);
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}
	
	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteAccount(id);
	}

	public void setService(AccountService service) {
		this.service = service;
	}
}
