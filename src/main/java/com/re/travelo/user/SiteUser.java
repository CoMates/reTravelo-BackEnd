package com.re.travelo.user;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SiteUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uSeq;
	
	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false, unique = true, columnDefinition = "VARCHAR(320)")
	private String email;
	
	@Column(nullable = false, columnDefinition = "VARCHAR(20)")
	private String password;

	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@Column(columnDefinition = "CHAR(6)")
	private String oauthType;
	
	@Column(columnDefinition = "VARCHAR(30)")
	private String oauthId;
	
	@Column(nullable = false)
	private LocalDateTime registerDate;
	
	private LocalDateTime modifyDate;
	
	private LocalDateTime resignDate;
	
	@Column(columnDefinition = "VARCHAR(500)")
	private String resignCause;
	
}
