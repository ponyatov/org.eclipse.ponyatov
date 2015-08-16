package org.eclipse.ponyatov;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class New extends Wizard implements INewWizard {
	
	public static String NAME="Makefile project";
	public static String INFO="Generic Makefile based project with Git repository";

	@Override public void init(IWorkbench arg0, IStructuredSelection arg1) {}
	@Override public boolean performFinish() { return false; }
	@Override public boolean canFinish() { return false; }

//	public New() { 
//		super();
//		setNeedsProgressMonitor(true);
//	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		addPage(new page());
	}
	
	class page extends WizardPage {
		
		private Composite container;
		
		page() {
			super(NAME);
			setWindowTitle("New "+NAME);
			setTitle(NAME);
			setDescription(INFO);
		}

		@Override
		public void createControl(Composite par) {
			container = new Composite(par, SWT.NONE);
			Label name = new Label(container, SWT.NONE);
			name.setText("label:");
			setControl(container);
			setPageComplete(false);
		}
		
	}

}
