package View_M3;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class M3P01_ClassInsert {
    private String taskFlowId = "/WEB-INF/Menu3_Task_Insert_P1.xml#Menu3_Task_Insert_P1";

    public M3P01_ClassInsert() {
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String CommitAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Create");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        FacesContext con = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Correcto!", "");
        con.addMessage("", message);
        return null;
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }
}
