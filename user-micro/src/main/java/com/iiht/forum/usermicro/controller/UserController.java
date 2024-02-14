package com.iiht.forum.usermicro.controller;

import java.util.List;

import jakarta.validation.Valid;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.iiht.forum.usermicro.dto.LoginDto;
import com.iiht.forum.usermicro.dto.RegisterDto;
import com.iiht.forum.usermicro.dto.UserDetailDto;
import com.iiht.forum.usermicro.dto.exception.UserExceptionDto;
import com.iiht.forum.usermicro.exception.BoundaryException;
import com.iiht.forum.usermicro.exception.UserNotFoundException;
import com.iiht.forum.usermicro.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {

	private UserService service;
	public UserController(UserService service) {
		this.service = service;
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserDetailDto> register(@Valid @RequestBody RegisterDto registerDto, BindingResult result){
		
		return null;
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserDetailDto> login(@Valid @RequestBody LoginDto loginDto, BindingResult result){
		
		return null;
	}
	
	@GetMapping("/check-in-use/{emailId}")
	public ResponseEntity<Boolean> checkAlreadyInUse(@PathVariable("emailId") String emailId){
		return null;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<UserDetailDto> getUserDetails(@PathVariable("id") Integer id){
		return null;
	}
	
	@GetMapping("/all-users")
	public ResponseEntity<List<UserDetailDto>> getRegisteredUserList(){
		return null;
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<UserExceptionDto> userExceptionHandler(UserNotFoundException ex){
		return null;
	}
	@ExceptionHandler(BoundaryException.class)
	public ResponseEntity<UserExceptionDto> boundaryExceptionHandler(BoundaryException ex){
		return null;
	}
	
}
