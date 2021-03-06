package catalogo;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 26 17:18:56 CST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ToksCaAntiguedadImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        IdAntiguedad {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getIdAntiguedad();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setIdAntiguedad((Number)value);
            }
        }
        ,
        DiasPrestacion {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getDiasPrestacion();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setDiasPrestacion((Number)value);
            }
        }
        ,
        RangoInicial {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getRangoInicial();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setRangoInicial((Number)value);
            }
        }
        ,
        RangoFinal {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getRangoFinal();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setRangoFinal((Number)value);
            }
        }
        ,
        CreadoPor {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getCreadoPor();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setCreadoPor((Number)value);
            }
        }
        ,
        FechaCreacion {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getFechaCreacion();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setFechaCreacion((Date)value);
            }
        }
        ,
        ActualizadoPor {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getActualizadoPor();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setActualizadoPor((Number)value);
            }
        }
        ,
        FechaActualizacion {
            public Object get(ToksCaAntiguedadImpl obj) {
                return obj.getFechaActualizacion();
            }

            public void put(ToksCaAntiguedadImpl obj, Object value) {
                obj.setFechaActualizacion((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ToksCaAntiguedadImpl object);

        public abstract void put(ToksCaAntiguedadImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int IDANTIGUEDAD = AttributesEnum.IdAntiguedad.index();
    public static final int DIASPRESTACION = AttributesEnum.DiasPrestacion.index();
    public static final int RANGOINICIAL = AttributesEnum.RangoInicial.index();
    public static final int RANGOFINAL = AttributesEnum.RangoFinal.index();
    public static final int CREADOPOR = AttributesEnum.CreadoPor.index();
    public static final int FECHACREACION = AttributesEnum.FechaCreacion.index();
    public static final int ACTUALIZADOPOR = AttributesEnum.ActualizadoPor.index();
    public static final int FECHAACTUALIZACION = AttributesEnum.FechaActualizacion.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ToksCaAntiguedadImpl() {
    }

    /**
     * Gets the attribute value for IdAntiguedad, using the alias name IdAntiguedad.
     * @return the IdAntiguedad
     */
    public Number getIdAntiguedad() {
        return (Number)getAttributeInternal(IDANTIGUEDAD);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdAntiguedad.
     * @param value value to set the IdAntiguedad
     */
    public void setIdAntiguedad(Number value) {
        setAttributeInternal(IDANTIGUEDAD, value);
    }

    /**
     * Gets the attribute value for DiasPrestacion, using the alias name DiasPrestacion.
     * @return the DiasPrestacion
     */
    public Number getDiasPrestacion() {
        return (Number)getAttributeInternal(DIASPRESTACION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiasPrestacion.
     * @param value value to set the DiasPrestacion
     */
    public void setDiasPrestacion(Number value) {
        setAttributeInternal(DIASPRESTACION, value);
    }

    /**
     * Gets the attribute value for RangoInicial, using the alias name RangoInicial.
     * @return the RangoInicial
     */
    public Number getRangoInicial() {
        return (Number)getAttributeInternal(RANGOINICIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for RangoInicial.
     * @param value value to set the RangoInicial
     */
    public void setRangoInicial(Number value) {
        setAttributeInternal(RANGOINICIAL, value);
    }

    /**
     * Gets the attribute value for RangoFinal, using the alias name RangoFinal.
     * @return the RangoFinal
     */
    public Number getRangoFinal() {
        return (Number)getAttributeInternal(RANGOFINAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for RangoFinal.
     * @param value value to set the RangoFinal
     */
    public void setRangoFinal(Number value) {
        setAttributeInternal(RANGOFINAL, value);
    }

    /**
     * Gets the attribute value for CreadoPor, using the alias name CreadoPor.
     * @return the CreadoPor
     */
    public Number getCreadoPor() {
        return (Number)getAttributeInternal(CREADOPOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreadoPor.
     * @param value value to set the CreadoPor
     */
    public void setCreadoPor(Number value) {
        setAttributeInternal(CREADOPOR, value);
    }

    /**
     * Gets the attribute value for FechaCreacion, using the alias name FechaCreacion.
     * @return the FechaCreacion
     */
    public Date getFechaCreacion() {
        return (Date)getAttributeInternal(FECHACREACION);
    }

    /**
     * Sets <code>value</code> as the attribute value for FechaCreacion.
     * @param value value to set the FechaCreacion
     */
    public void setFechaCreacion(Date value) {
        setAttributeInternal(FECHACREACION, value);
    }

    /**
     * Gets the attribute value for ActualizadoPor, using the alias name ActualizadoPor.
     * @return the ActualizadoPor
     */
    public Number getActualizadoPor() {
        return (Number)getAttributeInternal(ACTUALIZADOPOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActualizadoPor.
     * @param value value to set the ActualizadoPor
     */
    public void setActualizadoPor(Number value) {
        setAttributeInternal(ACTUALIZADOPOR, value);
    }

    /**
     * Gets the attribute value for FechaActualizacion, using the alias name FechaActualizacion.
     * @return the FechaActualizacion
     */
    public Date getFechaActualizacion() {
        return (Date)getAttributeInternal(FECHAACTUALIZACION);
    }

    /**
     * Sets <code>value</code> as the attribute value for FechaActualizacion.
     * @param value value to set the FechaActualizacion
     */
    public void setFechaActualizacion(Date value) {
        setAttributeInternal(FECHAACTUALIZACION, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @param idAntiguedad key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number idAntiguedad) {
        return new Key(new Object[]{idAntiguedad});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("catalogo.ToksCaAntiguedad");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setDiasPrestacion(null);
        setRangoInicial(null);
        setRangoFinal(null);
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }
}
