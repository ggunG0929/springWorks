package aaa.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import aaa.model.JoinData;

@Service
public class JoinChk {
	public boolean pwDupChk(JoinData jd, BindingResult br) {
		System.out.println("JoinChk.pwDupChk() 진입");
		return true;
	}
}
