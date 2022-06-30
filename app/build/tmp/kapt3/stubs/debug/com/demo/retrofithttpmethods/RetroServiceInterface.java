package com.demo.retrofithttpmethods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/demo/retrofithttpmethods/RetroServiceInterface;", "", "createUser", "Lretrofit2/Call;", "Lcom/demo/retrofithttpmethods/UserResponse;", "params", "Lcom/demo/retrofithttpmethods/User;", "getCoursesList", "", "Lcom/demo/retrofithttpmethods/data/Course;", "loginUser", "Lcom/demo/retrofithttpmethods/UserLoginResponse;", "Lcom/demo/retrofithttpmethods/UserLogin;", "app_debug"})
public abstract interface RetroServiceInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Accept:application/json", "Content-Type:application/json", "Authorization: Bearer 73668350bdf06c66f3388408c1a712b378c3e25da599753b21b664a6261e246c"})
    @retrofit2.http.POST(value = "api/auth/signup")
    public abstract retrofit2.Call<com.demo.retrofithttpmethods.UserResponse> createUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.demo.retrofithttpmethods.User params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Accept:application/json", "Content-Type:application/json"})
    @retrofit2.http.POST(value = "api/auth/signin")
    public abstract retrofit2.Call<com.demo.retrofithttpmethods.UserLoginResponse> loginUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.demo.retrofithttpmethods.UserLogin params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cursoes")
    public abstract retrofit2.Call<java.util.List<com.demo.retrofithttpmethods.data.Course>> getCoursesList();
}