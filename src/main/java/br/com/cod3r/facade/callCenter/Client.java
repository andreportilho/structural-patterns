package br.com.cod3r.facade.callCenter;

import java.util.List;

import br.com.cod3r.facade.callCenter.facade.CallCenterFacade;
import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.CardService;
import br.com.cod3r.facade.callCenter.services.PaymentService;
import br.com.cod3r.facade.callCenter.services.RegisterService;
import br.com.cod3r.facade.callCenter.services.ReportService;
import br.com.cod3r.facade.callCenter.services.SecurityService;

public class Client {

	public static void main(String[] args) {

		CallCenterFacade facade = new CallCenterFacade();

		Card card = facade.getCardByUser(123456L);
		System.out.println(card);

		
		facade.getSummary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);

		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
