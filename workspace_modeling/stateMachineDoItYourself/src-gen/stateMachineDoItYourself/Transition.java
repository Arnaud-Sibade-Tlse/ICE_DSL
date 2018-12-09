/**
 */
package stateMachineDoItYourself;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachineDoItYourself.Transition#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link stateMachineDoItYourself.Transition#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link stateMachineDoItYourself.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see stateMachineDoItYourself.StateMachineDoItYourselfPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link stateMachineDoItYourself.State}.
	 * It is bidirectional and its opposite is '{@link stateMachineDoItYourself.State#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see stateMachineDoItYourself.StateMachineDoItYourselfPackage#getTransition_Outgoing()
	 * @see stateMachineDoItYourself.State#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<State> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link stateMachineDoItYourself.State}.
	 * It is bidirectional and its opposite is '{@link stateMachineDoItYourself.State#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see stateMachineDoItYourself.StateMachineDoItYourselfPackage#getTransition_Incoming()
	 * @see stateMachineDoItYourself.State#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<State> getIncoming();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachineDoItYourself.StateMachineDoItYourselfPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachineDoItYourself.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
