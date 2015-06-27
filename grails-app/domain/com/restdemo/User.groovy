package com.restdemo

import grails.rest.*;

@Resource()
class User {
    String userName;
    Integer age
    String password;

static  hasMany = [ orders:ProductOrder]
}
