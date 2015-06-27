import com.restdemo.User
import grails.converters.JSON

import javax.annotation.PostConstruct

class UserRegisterMarshaller {
    @PostConstruct
    void registerMarshallers(){
        JSON.registerObjectMarshaller(User){
            def map=[:]
            map['userName']=it.userName
            map['age']=it.age
            return map
        }
    }

}
