package org.eclipse.ponyatov;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class MakeNature implements IProjectNature {
	
	public static final String ID="org.eclipse.ponyatov.makenature";
	
	MakeNature() {
		super();
		System.out.println(ID);
	}

	@Override
	public void configure() throws CoreException {
		// TODO Auto-generated method stub
		System.out.println(ID+" configure");
	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub
		
	}
	
	private IProject project;

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject arg0) {
		project = arg0;
	}

}
