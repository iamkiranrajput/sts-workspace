package com.guardians.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private String userId;
	private String name;
	private String phone;
	private String email;
}
