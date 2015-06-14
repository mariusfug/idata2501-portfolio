package com.demo

import groovyx.net.http.RESTClient
import spock.lang.Specification

class ControllerFunctionalTest extends Specification {

    def "Should return 200 & some json"() {
        setup:
        def client = new RESTClient( 'http://localhost:8080/' )

        when:
        def resp = client.get(path : '')

        then:
        resp.data.name == "demo"
        resp.status == 200
        resp.contentType == "application/json"
    }
}
