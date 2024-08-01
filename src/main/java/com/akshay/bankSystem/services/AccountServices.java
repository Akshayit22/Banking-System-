package com.akshay.bankSystem.services;

import java.util.List;

import com.akshay.bankSystem.dto.AccountDto;
import com.akshay.bankSystem.dto.NomineeDto;

public interface AccountServices {

	public AccountDto createAccount(String username, AccountDto account);

	public AccountDto updateAccount(String username, AccountDto account);

	public List<AccountDto> getAllAccounts();

	public AccountDto getAccountByAccountNumber(int accountNumber);

	public List<AccountDto> getAccountsByUsername(String username);
	

	public NomineeDto createNominee(int accountNumber, NomineeDto nominee);

	public NomineeDto updateNominee(int accountNumber, NomineeDto nominee);
	
	public List<NomineeDto> getAllNominees();

}
