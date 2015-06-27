package com.restdemo

import grails.rest.Resource

@Resource(uri = '/orders')
class ProductOrder {
String productName;
    String quantity;
    static belongsTo = [ user :User]
    static constraints = {
    }
}
