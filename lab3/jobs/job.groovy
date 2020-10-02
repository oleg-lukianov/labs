pipelineJob("lab3-build-docker-image") {

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

