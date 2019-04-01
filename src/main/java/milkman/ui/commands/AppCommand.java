package milkman.ui.commands;

import java.util.Optional;

import lombok.Value;
import milkman.domain.Environment;
import milkman.domain.Workspace;

public interface AppCommand {

	
	@Value
	public static class PersistWorkspace implements AppCommand {
		Workspace workspace;
	}
	
	@Value
	public static class ManageWorkspaces implements AppCommand {
		
	}
	@Value
	public static class LoadWorkspace implements AppCommand {
		String workspaceName;
	}
	
	@Value
	public static class CreateNewWorkspace implements AppCommand {
		String newWorkspaceName;
	}
	
	@Value
	public static class DeleteWorkspace implements AppCommand {
		String workspaceName;
	}
	
	@Value
	public static class RenameWorkspace implements AppCommand {
		String workspaceName;
		String newWorkspaceName;
	}
	
	
	
	@Value
	public static class ManageEnvironments implements AppCommand {
		
	}
	@Value
	public static class ActivateEnvironment implements AppCommand {
		Optional<Environment> env;
	}
	@Value
	public static class RenameEnvironment implements AppCommand {
		Environment env;
		String newName;
	}
	
	@Value
	public static class DeleteEnvironment implements AppCommand {
		Environment env;
	}
	
	@Value
	public static class CreateNewEnvironment implements AppCommand {
		Environment env;
	}
}
