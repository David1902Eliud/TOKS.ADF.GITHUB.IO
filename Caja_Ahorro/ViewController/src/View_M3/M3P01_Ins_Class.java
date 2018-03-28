package View_M3;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class M3P01_Ins_Class {
    public M3P01_Ins_Class() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String CommitAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        FacesContext con = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Correcto!", "");
        con.addMessage("", message);
        return null;
    }
}
