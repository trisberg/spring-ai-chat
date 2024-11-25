# Accelerator Log

## Options
```json
{
  "openaiModel" : "gpt-3.5-turbo",
  "includeBuildToolWrapper" : true,
  "groupId" : "com.example",
  "aiService" : "openAI",
  "artifactId" : "spring-ai-chat",
  "packageName" : "com.example.aichat",
  "projectName" : "spring-ai-chat",
  "vectorStoreType" : "simple"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Exclude, GeneratorValidationTransform, UniquePath)
┃ ┏ engine.transformations[0] (Exclude)
┃ ┃  Info Will exclude [accelerator.yaml, accelerator.axl]
┃ ┃ Debug tanzu.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug accelerator.axl matched [accelerator.yaml, accelerator.axl] -> excluded
┃ ┃ Debug .tanzu/config/egresspoint-spring-ai-chat.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug .tanzu/config/spring-ai-chat.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug .tanzu/config/httproute-spring-ai-chat.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug pom.xml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug accelerator.yaml matched [accelerator.yaml, accelerator.axl] -> excluded
┃ ┃ Debug README.md didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug .gitignore didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/test/java/com/vmware/tap/accelerators/aichat/ChatServiceApplicationTests.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/actions.js didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/User.png didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/System.png didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/style.css didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/AI.png didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/templates/home.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/templates/login.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/application.properties didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/Answer.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/SecurityConfig.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/SimpleVectorStoreConfig.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/Question.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/WebConfig.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/UploadController.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/vmware/tap/accelerators/aichat/ChatController.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┗ Debug src/main/java/com/vmware/tap/accelerators/aichat/ChatServiceApplication.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┏ ┏ engine.transformations[1].validated (Chain)
┃ ┃ ┃  Info Running Chain(ApplyTo, IfElse, ApplyTo, ApplyTo, ApplyTo, Let)
┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[0].apply (TextPreprocessor)
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[1] (IfElse)
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[2].apply (Chain)
┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, IfElse)
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[2].apply.transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┗  Info Will replace [<groupId>com.vmware.tap.accelerators</groupId>-><groupId>com.example...(truncated), <artifactId>ai-chat</artifactId>-><artifactId>spring-a...(truncated)]
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[2].apply.transformations[1] (IfElse)
┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[3].apply (Chain)
┃ ┃ ┃ ┃  Info Running Chain(IfElse, IfElse)
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[3].apply.transformations[0] (IfElse)
┃ ┃ ┃ ┃ ┃ engine.transformations[1].validated.transformations[3].apply.transformations[0].then (ReplaceText)
┃ ┃ ┃ ┃ ┗  Info Will replace [spring.ai.openai.model=gpt-3.5-turbo->spring.ai.openai.mod...(truncated)]
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[3].apply.transformations[1] (IfElse)
┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[4].apply (IfElse)
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5] (Let)
┃ ┃ ┃ ┃ Debug Adding symbol packageDirectory with value 'com/example/aichat'
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ApplyTo, ApplyTo, ApplyTo, ApplyTo, ApplyTo, Let)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[0].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[0].apply.transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [com.vmware.tap.accelerators.aichat->com.example.aichat]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[0].apply.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/test/java/com/vmware/tap/accelerators/aichat/ChatServiceApplicationTests.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/ChatServiceApplicationTests.java, g0=src/test/java/com/vmware/tap/accelerators/aichat/ChatServiceApplicationTests.java, g1=test, g2=com/vmware/tap/accelerators/, g3=/ChatServiceApplicationTests.java} and was rewritten to 'src/test/java/com/example/aichat//ChatServiceApplicationTests.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/Answer.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/Answer.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/Answer.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/Answer.java} and was rewritten to 'src/main/java/com/example/aichat//Answer.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/SecurityConfig.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/SecurityConfig.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/SecurityConfig.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/SecurityConfig.java} and was rewritten to 'src/main/java/com/example/aichat//SecurityConfig.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/SimpleVectorStoreConfig.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/SimpleVectorStoreConfig.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/SimpleVectorStoreConfig.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/SimpleVectorStoreConfig.java} and was rewritten to 'src/main/java/com/example/aichat//SimpleVectorStoreConfig.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/Question.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/Question.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/Question.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/Question.java} and was rewritten to 'src/main/java/com/example/aichat//Question.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/WebConfig.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/WebConfig.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/WebConfig.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/WebConfig.java} and was rewritten to 'src/main/java/com/example/aichat//WebConfig.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/UploadController.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/UploadController.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/UploadController.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/UploadController.java} and was rewritten to 'src/main/java/com/example/aichat//UploadController.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/ChatController.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/ChatController.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/ChatController.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/ChatController.java} and was rewritten to 'src/main/java/com/example/aichat//ChatController.java'
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path 'src/main/java/com/vmware/tap/accelerators/aichat/ChatServiceApplication.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)aichat(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/vmware/tap/accelerators/, untouchedpath=/ChatServiceApplication.java, g0=src/main/java/com/vmware/tap/accelerators/aichat/ChatServiceApplication.java, g1=main, g2=com/vmware/tap/accelerators/, g3=/ChatServiceApplication.java} and was rewritten to 'src/main/java/com/example/aichat//ChatServiceApplication.java'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[1].apply (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [spring-ai-chat->spring-ai-chat]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].apply.transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [spring-ai-chat->spring-ai-chat]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].apply.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path '.tanzu/config/spring-ai-chat.yml' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.yml, folder=.tanzu/config/, filename=spring-ai-chat.yml, g0=.tanzu/config/spring-ai-chat.yml, g1=.tanzu/config/, g2=spring-ai-chat.yml, g3=spring-ai-chat.yml, g4=.yml} and was rewritten to '.tanzu/config/spring-ai-chat.yml'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[3].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[3].apply.transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [spring-ai-chat->spring-ai-chat]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[3].apply.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path '.tanzu/config/httproute-spring-ai-chat.yml' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.yml, folder=.tanzu/config/, filename=httproute-spring-ai-chat.yml, g0=.tanzu/config/httproute-spring-ai-chat.yml, g1=.tanzu/config/, g2=httproute-spring-ai-chat.yml, g3=httproute-spring-ai-chat.yml, g4=.yml} and was rewritten to '.tanzu/config/httproute-spring-ai-chat.yml'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[4].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[4].apply.transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [spring-ai-chat->spring-ai-chat]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[4].apply.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path '.tanzu/config/egresspoint-spring-ai-chat.yml' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.yml, folder=.tanzu/config/, filename=egresspoint-spring-ai-chat.yml, g0=.tanzu/config/egresspoint-spring-ai-chat.yml, g1=.tanzu/config/, g2=egresspoint-spring-ai-chat.yml, g3=egresspoint-spring-ai-chat.yml, g4=.yml} and was rewritten to '.tanzu/config/egresspoint-spring-ai-chat.yml'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[5] (Let)
┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol uuid with value 'ce3cafdc-3cc9-4ec4-8b0c-4420a079fdb6'
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[5].in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ApplyTo, Merge, UniquePath, Provenance)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[0].apply (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[1] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Include, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[1].sources[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/actions.js matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/User.png matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/System.png matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/style.css matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/AI.png matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/home.html matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/login.html matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/aichat/ChatServiceApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/Answer.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/SecurityConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/SimpleVectorStoreConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/Question.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/WebConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/UploadController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/ChatController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/ChatServiceApplication.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzu/config/spring-ai-chat.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzu/config/httproute-spring-ai-chat.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzu/config/egresspoint-spring-ai-chat.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug tanzu.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[1].sources[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[1].sources[1].validated (IfElse)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[1].sources[1].validated.then (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [mvnw, mvnw.cmd, .mvn/**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/actions.js didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/User.png didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/System.png didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/style.css didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/AI.png didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/home.html didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/login.html didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/aichat/ChatServiceApplicationTests.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/Answer.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/SecurityConfig.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/SimpleVectorStoreConfig.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/Question.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/WebConfig.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/UploadController.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/ChatController.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/aichat/ChatServiceApplication.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzu/config/spring-ai-chat.yml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzu/config/httproute-spring-ai-chat.yml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzu/config/egresspoint-spring-ai-chat.yml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug tanzu.yml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ Debug mvnw matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[2] (UniquePath)
┃ ┗ ┗ ┗ ┗ ┗ ┗ ╺ engine.transformations[1].validated.transformations[5].in.transformations[5].in.transformations[3] (Provenance)
┗ ╺ engine.transformations[2] (UniquePath)
```
