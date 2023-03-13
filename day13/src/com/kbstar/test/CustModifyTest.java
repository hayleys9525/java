package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustModifyTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = 
				new CustCRUDServiceImpl();
		
		Cust cust = new Cust("id3", "3333", "tom", 40);
		try {
			crudService.modify(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
