/**
 *
 * $Id$
 */
package caex.caex30.caex.validation;

import caex.caex30.caex.AttributeLib;
import caex.caex30.caex.ExternalReference;
import caex.caex30.caex.InstanceHierarchy;
import caex.caex30.caex.InterfaceClassLib;
import caex.caex30.caex.RoleClassLib;
import caex.caex30.caex.SourceDocumentInformation;
import caex.caex30.caex.SystemUnitClassLib;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link caex.caex30.caex.CAEXFile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CAEXFileValidator {
	boolean validate();

	boolean validateSuperiorStandardVersion(EList<String> value);
	boolean validateSourceDocumentInformation(EList<SourceDocumentInformation> value);
	boolean validateExternalReference(EList<ExternalReference> value);
	boolean validateInstanceHierarchy(EList<InstanceHierarchy> value);
	boolean validateInterfaceClassLib(EList<InterfaceClassLib> value);
	boolean validateRoleClassLib(EList<RoleClassLib> value);
	boolean validateSystemUnitClassLib(EList<SystemUnitClassLib> value);
	boolean validateAttributeTypeLib(EList<AttributeLib> value);
	boolean validateFileName(String value);
	boolean validateSchemaVersion(String value);
}