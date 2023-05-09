package com.masai.verdant_straw_7365.DAOIntrafaces;

public interface Authorization {
	boolean AdminAuthorization (String username , String password);
	int userAuthorization (String username , String password);
}
