pipelineJob("test-pipeline_original") {
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
                        branch("devops")
                  }
              }
        }
        scriptPath("lab3/Jenkinsfile")
      }

    }

 }
