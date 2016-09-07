package demo

class DemoController {

    def useBindData(SomeCommand co) {
        bindData co, params, [include: ['propTwo']]

        render "propOne=[${co.propOne}], propTwo=[${co.propTwo}]"
    }
}

class SomeCommand {
    String propOne
    String propTwo
}
