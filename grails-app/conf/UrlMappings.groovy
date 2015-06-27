import com.restdemo.User

class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

//        "/users"(resources:"user" )
//        "/v2/users"(resources:"user",namespace :'v2')

        "/users"(version:'1.0',resources:"user",namespace :'v1' )
        "/users"(version:'2.0',resources:"user",namespace :'v2')

	}
}
