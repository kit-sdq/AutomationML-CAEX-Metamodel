/**
 *
 * $Id$
 */
package caex.caex30.caex.validation;

import caex.caex30.caex.Mapping;
import caex.caex30.caex.RoleClass;

/**
 * A sample validator interface for {@link caex.caex30.caex.SupportedRoleClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SupportedRoleClassValidator {
	boolean validate();

	boolean validateMappingObject(Mapping value);
	boolean validateRefRoleClassPath(String value);
	boolean validateRoleClass(RoleClass value);
}