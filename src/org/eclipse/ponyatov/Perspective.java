package org.eclipse.ponyatov;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.PlatformUI;

public class Perspective implements IPerspectiveFactory {

	public static final String ID = "org.eclipse.ponyatov.perspective";

	public void createInitialLayout(IPageLayout layout) {
//		layout.setEditorAreaVisible(true);
//		// layout.setFixed(true);
//		REG.revertPerspective(DESC);
	}

//	public static IPerspectiveRegistry REG;
//	public static IPerspectiveDescriptor DESC;

//	public Perspective() {
//		REG = PlatformUI.getWorkbench().getPerspectiveRegistry();
//		DESC = REG.findPerspectiveWithId(ID);
//	}

}
