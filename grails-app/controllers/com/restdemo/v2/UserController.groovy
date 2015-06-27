package com.restdemo.v2

import com.restdemo.User
import grails.rest.RestfulController

class UserController extends RestfulController{

    static responseFormats=['json']
    static namespace = "v2"

    UserController(){
        super(User)
    }

    def index(){
        respond(User.findAllByAgeLessThan(25))
    }
}
