package org.eclipse.ponyatov;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class MakeBuilder extends IncrementalProjectBuilder {
	
	public MakeBuilder() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Custom builder consturctoed");
	}
	
	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		super.clean(monitor);
		System.out.println("make clean");
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> arg1, IProgressMonitor arg2) throws CoreException {
		// TODO Auto-generated method stub
		
		System.out.println("Custom builder triggered");
		
		getProject();
		
		switch (kind) {  
		  
		  case FULL_BUILD:  System.out.println("FULL_BUILD");
		   break;  
		  
		  case INCREMENTAL_BUILD:  System.out.println("INCREMENTAL_BUILD");
		   break;  
		  
		  case AUTO_BUILD:  System.out.println("AUTO_BUILD");
		   break;  
		  }  		
		
		return null;
	}

}
