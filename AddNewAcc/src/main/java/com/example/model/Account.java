package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Account {
	private Long acno;
	private String name;
	private Float bal;
}
