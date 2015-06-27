import com.restdemo.ProductOrder
import com.restdemo.User

class BootStrap {

def init = { servletContext ->
    createUsers()
    createOrderForUser()
}

   void createUsers(){
       (1..3).each {
           new User(userName:'richa'+it,password: 'abcde',age: 10*it).save(flush: true)
       }
   }

    void createOrderForUser(){
        List<User> userList=User.list()
        userList.eachWithIndex {user,index->
            ProductOrder productOrder= new ProductOrder(productName: 'order'+index,quantity: '10',user: user).save(flush: true)
            user.addToOrders(productOrder).save(flush: true)
        }
    }
}
