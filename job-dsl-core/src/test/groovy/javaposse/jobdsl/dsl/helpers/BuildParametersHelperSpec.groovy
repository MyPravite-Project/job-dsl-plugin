package javaposse.jobdsl.dsl.helpers

import javaposse.jobdsl.dsl.WithXmlAction
import javaposse.jobdsl.dsl.WithXmlActionSpec
import javaposse.jobdsl.dsl.helpers.BuildParametersContextHelper.BuildParametersContext
import spock.lang.Specification

public class BuildParametersHelperSpec extends Specification {

    List<WithXmlAction> mockActions = Mock()
    BuildParametersContextHelper helper = new BuildParametersContextHelper(mockActions)
    BuildParametersContext context = new BuildParametersContext()

    def 'base booleanParam usage'() {
        when:
        context.booleanParam("myParameterName", true, "myBooleanParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base listTagsParam usage'() {
        when:
        context.listTagsParam("myParameterName", "http://mysvmurl", "my tag filer regex", true, false, "myDefaultValue", "myMaxTagsToDisplay", "myListTagsParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base choiceParam usage'() {
        when:
        context.choiceParam("myParameterName", ["option 1 (default)", "option 2", "option 3"], "myChoiceParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base fileParam usage'() {
        when:
        context.fileParam("myParameterName", "my/file/location.txt", "myFileParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base passwordParam usage'() {
        when:
        context.passwordParam("myParameterName", "myDefaultPassword", "myPasswordParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base runParam usage'() {
        when:
        context.runParam("myParameterName", "myJobToRun", "myRunParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base stringParam usage'() {
        when:
        context.stringParam("myParameterName", "my default stringParam value", "myStringParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }

    def 'base textParam usage'() {
        when:
        context.textParam("myParameterName", "my default textParam value", "myTextParamDescription")

        then:
        context.buildParameterNodes != null
//        context.buildParameterNodes.hudson.model.BooleanParameterDefinition[0].name.text() == "myParameterName"
//        context.scmNode.modules[0].text() == ''
    }
}
