package com.senai.ecommerce.entities;

import java.time.Instant;

import com.senai.ecommerce.enums.StatusDoPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	private StatusDoPedido status;
	
	public Pedido(Long id, Instant momento, StatusDoPedido status) {
		super();
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	
	public Pedido() {
	
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getMomento() {
		return momento;
	}
	public void setMomento(Instant momento) {
		this.momento = momento;
	}
	public StatusDoPedido getStatus() {
		return status;
	}
	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}
	
	
	
}