import edu.osumc.bmi.ird.ready.fmp.dataloader.NppesService;

class BootStrap {
	//def NppesService nppesService = new NppesService()
	
    def init = { servletContext ->
		environments {
			production {}
			development {
				
				//nppesService.writeToDB()
			}
		}
    }
    def destroy = {
    }
}
