job("Example_job_DSL"){
	description("Job DSL Exercise")
  scm{
    git("https://github.com/macloujulian/jenkins.job.parametrizado.git", "main"){node ->
      
      node / gitConfigName("CarlosBaez11")
      
      node / gitConfigEmail("eduardo.baez@udea.edu.co")
      }
    parameters{
      stringParam("nombre", defaultValue = "Eduardo", description = "Parámetro de cadena para Job")
      
      choiceParam("Planeta", ["Mercurio", "Tierra (default)", "Marte"])
      
      booleanParam("agente", false)
    }
    publishers{
      mailer("carlos.baez@ceiba.com.co", true, true)
    
    }
}
}
