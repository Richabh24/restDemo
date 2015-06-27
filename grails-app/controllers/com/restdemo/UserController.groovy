package com.restdemo
import grails.rest.RestfulController

class UserController extends RestfulController{

    static responseFormats=['json']
    static namespace = "v1"
    UserController(){
        super(User)
    }

    def index(){
        respond(User.list())
    }
}
