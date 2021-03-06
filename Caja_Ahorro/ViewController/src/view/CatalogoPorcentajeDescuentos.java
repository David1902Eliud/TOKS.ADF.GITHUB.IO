package view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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

public class CatalogoPorcentajeDescuentos {
    
    private RichTable tablaPorcentajeDescuentos;

    public CatalogoPorcentajeDescuentos() {
    
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

 /*   public void callMethodIndice(PopupFetchEvent popupFetchEvent) {
        InsertPuesto puesto = new InsertPuesto();
        puesto.obtenerIndice();
    } */


    public void editDialogListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("Commit");
            operationBinding.execute();

            FacesContext con = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Modificado",
                                 "");
            con.addMessage("", message);
            backFromPopup();
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            System.out.println("Cancelar");
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("Rollback");
            operationBinding.execute();
        }
        clearCache();
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
            bindings.findIteratorBinding("ToksCaPuestosPorcsView1Iterator");

        ViewObject viewObject = orderItemIterator.getViewObject();
        viewObject.clearCache();
        viewObject.executeQuery();
    }

    public void backFromPopup() {
        AdfFacesContext.getCurrentInstance().addPartialTarget(tablaPorcentajeDescuentos);
    }


    public void settablaPorcentajeDescuentos(RichTable tablaPorcentajeDescuentos) {
        this.tablaPorcentajeDescuentos = tablaPorcentajeDescuentos;
    }

    public RichTable gettablaPorcentajeDescuentos() {
        return tablaPorcentajeDescuentos;
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    
    
}
