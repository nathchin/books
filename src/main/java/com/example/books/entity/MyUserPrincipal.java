//package com.example.books.entity;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import lombok.Data;
//
//@Data
//public class MyUserPrincipal implements UserDetails {
//    private User user;
//    private String password;
//    private String username;
//    private Boolean isAccountNonExpired;
//    private Boolean isAccountNonLocked;
//    private Boolean isCredentialsNonExpired;
//    private Boolean isEnabled;
//    
//    
//
//    public MyUserPrincipal(User user) {
//        this.user = user;
//    }
//
//
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//    
//}