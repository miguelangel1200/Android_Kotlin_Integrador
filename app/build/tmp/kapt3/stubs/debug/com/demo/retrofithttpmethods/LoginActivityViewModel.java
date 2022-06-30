package com.demo.retrofithttpmethods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/demo/retrofithttpmethods/LoginActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "loginUserLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/demo/retrofithttpmethods/UserLoginResponse;", "getLoginUserLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setLoginUserLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "LoginUser", "", "user", "Lcom/demo/retrofithttpmethods/UserLogin;", "getLoginUserObserver", "app_debug"})
public final class LoginActivityViewModel extends androidx.lifecycle.ViewModel {
    public androidx.lifecycle.MutableLiveData<com.demo.retrofithttpmethods.UserLoginResponse> loginUserLiveData;
    
    public LoginActivityViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.demo.retrofithttpmethods.UserLoginResponse> getLoginUserLiveData() {
        return null;
    }
    
    public final void setLoginUserLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.demo.retrofithttpmethods.UserLoginResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.demo.retrofithttpmethods.UserLoginResponse> getLoginUserObserver() {
        return null;
    }
    
    public final void LoginUser(@org.jetbrains.annotations.NotNull()
    com.demo.retrofithttpmethods.UserLogin user) {
    }
}