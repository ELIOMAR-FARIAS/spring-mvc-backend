package com.edigital.springmvcbackend.services;

import org.springframework.mail.SimpleMailMessage;

import com.edigital.springmvcbackend.model.Cliente;
import com.edigital.springmvcbackend.model.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
