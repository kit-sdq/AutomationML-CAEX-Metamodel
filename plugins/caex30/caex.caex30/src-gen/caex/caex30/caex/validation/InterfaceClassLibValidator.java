/**
 *
 * $Id$
 */
package caex.caex30.caex.validation;

import caex.caex30.caex.InterfaceClass;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link caex.caex30.caex.InterfaceClassLib}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceClassLibValidator {
	boolean validate();

	boolean validateInterfaceClass(EList<InterfaceClass> value);
}