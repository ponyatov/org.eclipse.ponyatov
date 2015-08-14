package org.eclipse.ponyatov;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class Perspective implements IPerspectiveFactory {

	public static final String ID = "org.eclipse.ponyatov.perspective";

	IWorkspace workspace;
	IWorkspaceDescription description;

	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
		// get workspace
		workspace = ResourcesPlugin.getWorkspace();
		description = workspace.getDescription();
		// set autobuild flag
		if (!description.isAutoBuilding()) description.setAutoBuilding(true);
		// update workspace
		try {
			workspace.setDescription(description);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void defineActions(IPageLayout layout) {
		// new menu items
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
		// views
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
//		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
	}

	public void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.2, editorArea);
		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float) 0.75, editorArea);
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.7, editorArea);
//		bottom.addPlaceholder(IConsoleConstants.ID_CONSOLE_VIEW);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		right.addView(IPageLayout.ID_OUTLINE);
//		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
	}

}
