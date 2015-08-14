package org.eclipse.ponyatov;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.PlatformUI;

public class Perspective implements IPerspectiveFactory {

	public static final String ID = "org.eclipse.ponyatov.perspective";

	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
	}

	public void defineActions(IPageLayout layout) {
		// new menu items
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
		// views
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	}

	public void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.2, editorArea);
		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float) 0.7, editorArea);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		right.addView(IPageLayout.ID_OUTLINE);
	}

}
