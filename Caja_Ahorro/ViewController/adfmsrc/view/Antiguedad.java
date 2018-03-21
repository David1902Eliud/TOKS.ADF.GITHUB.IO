package view;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.model.AttributeBinding;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class Antiguedad {
  
    private Number idAntiguedad;
    private RichInputText InputTextIdAntiguedad = new RichInputText();


    public Antiguedad() {

    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public void obtenerIndice() {
        BindingContainer bindings = getBindings();
        // Bindings para obtener valor del Id
        AttributeBinding contador =
            (AttributeBinding)bindings.getControlBinding("Contador");

        AttributeBinding idAntiguedad =
            (AttributeBinding)bindings.getControlBinding("IdAntiguedad");

    System.out.println("Datos: " + contador);

        System.out.println("Datos1: " + idAntiguedad);
    /*       idAntiguedad = contador;
        IdPuesto.setInputValue(atributo);
        InputTextIdPuestoPorc.setValueExpression("value",
                                                 getValueExpression("#{bindings.IdPuestoPorc.inputValue}"));

        InputTextIdPuesto.setValueExpression("value",
                                             getValueExpressionModify("#{bindings.IdPuesto.inputValue}",
                                                                      atributo));
    */
    }


    //Método que ejecuta la operación de Commit

    public String commitAction() {
        CatalogoAntiguedad bM = new CatalogoAntiguedad();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }

        FacesContext con = FacesContext.getCurrentInstance();
        FacesMessage message =
            new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado", "");
        con.addMessage("", message);
        clearCache();
        //     bM.backFromPopup();
        return null;
    }


    // Da nuevo valor a binding

    public ValueExpression getValueExpressionModify(String data,
                                                    AttributeBinding atributo) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, data, Object.class);
        System.out.println("Dato: " + valueExp);
        valueExp.setValue(elContext, atributo.getInputValue());
        return valueExp;
    }

    //Obtiene valor del binding

    public ValueExpression getValueExpression(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, data, Object.class);
        return valueExp;
    }

    //Limpia el cache al momento de insertar o modificar.

    public void clearCache() {
        DCBindingContainer bindings =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding orderItemIterator =
            bindings.findIteratorBinding("ToksCaAntiguedadView1Iterator");
        ViewObject viewObject = orderItemIterator.getViewObject();
        viewObject.clearCache();
        viewObject.executeQuery();
    }


    public void setIdAntiguedad(Number idAntiguedad) {
        this.idAntiguedad = idAntiguedad;
    }

    public Number getIdAntiguedad() {
        return idAntiguedad;
    }

    public void setInputTextIdAntiguedad(RichInputText InputTextIdAntiguedad) {
        this.InputTextIdAntiguedad = InputTextIdAntiguedad;
    }

    public RichInputText getInputTextIdAntiguedad() {
        return InputTextIdAntiguedad;
    }

}
