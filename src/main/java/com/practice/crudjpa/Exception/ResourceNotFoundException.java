package com.practice.crudjpa.Exception;

public class ResourceNotFoundException extends RuntimeException{
  public ResourceNotFoundException(String message){
      super(message);
  }

}
