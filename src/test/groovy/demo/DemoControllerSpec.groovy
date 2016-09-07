package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test binding params with bindData"() {
        when:
        params.propTwo = 'Property Two'
        request.json = '''
{"propOne":"Property One"}
'''
        controller.useBindData()

        then:
        response.text == 'propOne=[Property One], propTwo=[Property Two]'
    }
}
