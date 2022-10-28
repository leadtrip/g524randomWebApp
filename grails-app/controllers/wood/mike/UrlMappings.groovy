package wood.mike

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/" controller: 'information'
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
