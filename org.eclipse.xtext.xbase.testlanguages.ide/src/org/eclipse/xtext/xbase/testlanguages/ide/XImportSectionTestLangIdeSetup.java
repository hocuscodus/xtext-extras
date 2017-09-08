/*
 * generated by Xtext
 */
package org.eclipse.xtext.xbase.testlanguages.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.xbase.testlanguages.XImportSectionTestLangRuntimeModule;
import org.eclipse.xtext.xbase.testlanguages.XImportSectionTestLangStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class XImportSectionTestLangIdeSetup extends XImportSectionTestLangStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new XImportSectionTestLangRuntimeModule(), new XImportSectionTestLangIdeModule()));
	}
	
}
