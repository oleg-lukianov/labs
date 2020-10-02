pipelineJob("build-docker-image") {
        logRotator {
            numToKeep(10)
        }

    parameters {
      choiceParam('ACTION', ["plan", "apply"], "Choose current action")
      stringParam('COMMIT_HASH')
        booleanParam('BUILD_IMAGE', true, 'Build image')
    }

    definition {
        cpsScm {
            scm {
                git {
                  remote {
                        github("oleg-lukianov/labs", 'https')
                        branch("pull-request")
                  }
              }
        }
        scriptPath("lab3/Jenkinsfile")
      }

    }

 }

