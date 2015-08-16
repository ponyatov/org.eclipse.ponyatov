package org.eclipse.ponyatov;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class New extends Wizard implements INewWizard {
	
	public static final String NAME="Makefile project";
	public static final String INFO="Generic Makefile based project with Git repository";

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
		
		private int XL=10,XT=121,Y=10,DY=30,LW=111,TW=333;
		
		page() {
			super(NAME);
			setWindowTitle("New "+NAME);
			setTitle(NAME);
			setDescription(INFO);
		}

		@Override
		public void createControl(Composite par) {
			container = new Composite(par, SWT.NONE);
			Label Lname = new Label(container, SWT.NONE);
			Lname.setText("name:");
			Lname.setBounds(XL, Y, LW, 20);
			Text Tname = new Text(container, SWT.BORDER);
			Tname.setText("ProjectName");
			Tname.setBounds(XT,Y,TW,20);
			Y+=DY;
			Label Lgit = new Label(container, SWT.NONE);
			Lgit.setText("GitHub repo:");
			Lgit.setBounds(XL, Y, LW, 20);
			Text Tgit = new Text(container, SWT.BORDER);
			Tgit.setText("git@github.com:ponyatov/org.eclipse.ponyatov.git");
			Tgit.setBounds(XT, Y, TW, 20);
			Y+=DY;
			Label Ltarget = new Label(container, SWT.NONE);
			Ltarget.setText("target:");
			Ltarget.setBounds(XL,Y,LW,20);
			Text Ttarget = new Text(container, SWT.BORDER);
			Ttarget.setText("unix");
			Ttarget.setBounds(XT,Y,TW,20);
			setControl(container);
			setPageComplete(false);
		}
		
	}

}
