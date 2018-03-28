package view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class M3P02_Class {
    private String taskFlowId = "/WEB-INF/Menu3_Task_Insert_P2.xml#Menu3_Task_Insert_P2";

    public M3P02_Class() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
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
