package View_M3;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;

public class M3P03_Class {
    public M3P03_Class() {
    }

    public void editDialogListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("Commit");
            operationBinding.execute();
            clearCache();
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("Rollback");
            operationBinding.execute();
        }
    }

    private void clearCache() {
        DCBindingContainer bindings =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding orderItemIterator =
            bindings.findIteratorBinding("ToksCaPeriodoCajaView1Iterator");
        ViewObject viewObject = orderItemIterator.getViewObject();
        viewObject.clearCache();
        viewObject.executeQuery();
    }
}
