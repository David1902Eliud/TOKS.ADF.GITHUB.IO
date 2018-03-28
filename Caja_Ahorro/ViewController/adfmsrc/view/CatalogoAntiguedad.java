package view;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;

public class CatalogoAntiguedad {

    private RichTable tablaAntiguedadDescuentos;
    private String taskFlowId =
        "/WEB-INF/insertar_antiguedad_definition.xml#insertar_antiguedad_definition";

    public CatalogoAntiguedad() {

    }

    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {
        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
        }
    }


    public void editDialogListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("Commit");
            operationBinding.execute();
            backFromPopup();
            clearCache();
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("Rollback");
            operationBinding.execute();
        }
    }

    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {
        BindingContainer bindings =
            BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        clearCache();
    }

    public void clearCache() {
        DCBindingContainer bindings =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding orderItemIterator =
            bindings.findIteratorBinding("ToksCaAntiguedadView1Iterator");
        ViewObject viewObject = orderItemIterator.getViewObject();
        viewObject.clearCache();
        viewObject.executeQuery();
    }

    public void calcularIndice(PopupFetchEvent popupFetchEvent) {
        Antiguedad ins = new Antiguedad();
        ins.obtenerIndice();
    }

    public void backFromPopup() {
        AdfFacesContext.getCurrentInstance().addPartialTarget(tablaAntiguedadDescuentos);
    }

    public void setTablaAntiguedadDescuentos(RichTable tablaAntiguedadDescuentos) {
        this.tablaAntiguedadDescuentos = tablaAntiguedadDescuentos;
    }

    public RichTable getTablaAntiguedadDescuentos() {
        return tablaAntiguedadDescuentos;
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }
}
