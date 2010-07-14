/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.13 at 11:14:43 PM EDT 
//


package org.apache.openejb.jee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * web-facesconfig_2_0.xsd
 *
 * <p>Java class for faces-configType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faces-configType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="application" type="{http://java.sun.com/xml/ns/javaee}faces-config-applicationType"/>
 *         &lt;element name="ordering" type="{http://java.sun.com/xml/ns/javaee}faces-config-orderingType"/>
 *         &lt;element name="absolute-ordering" type="{http://java.sun.com/xml/ns/javaee}faces-config-absoluteOrderingType" minOccurs="0"/>
 *         &lt;element name="factory" type="{http://java.sun.com/xml/ns/javaee}faces-config-factoryType"/>
 *         &lt;element name="component" type="{http://java.sun.com/xml/ns/javaee}faces-config-componentType"/>
 *         &lt;element name="converter" type="{http://java.sun.com/xml/ns/javaee}faces-config-converterType"/>
 *         &lt;element name="managed-bean" type="{http://java.sun.com/xml/ns/javaee}faces-config-managed-beanType"/>
 *         &lt;element name="name" type="{http://java.sun.com/xml/ns/javaee}java-identifierType" minOccurs="0"/>
 *         &lt;element name="navigation-rule" type="{http://java.sun.com/xml/ns/javaee}faces-config-navigation-ruleType"/>
 *         &lt;element name="referenced-bean" type="{http://java.sun.com/xml/ns/javaee}faces-config-referenced-beanType"/>
 *         &lt;element name="render-kit" type="{http://java.sun.com/xml/ns/javaee}faces-config-render-kitType"/>
 *         &lt;element name="lifecycle" type="{http://java.sun.com/xml/ns/javaee}faces-config-lifecycleType"/>
 *         &lt;element name="validator" type="{http://java.sun.com/xml/ns/javaee}faces-config-validatorType"/>
 *         &lt;element name="behavior" type="{http://java.sun.com/xml/ns/javaee}faces-config-behaviorType"/>
 *         &lt;element name="faces-config-extension" type="{http://java.sun.com/xml/ns/javaee}faces-config-extensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="metadata-complete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version" use="required" type="{http://java.sun.com/xml/ns/javaee}faces-config-versionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 59 *
 * 
 */
@XmlRootElement(name = "faces-config")

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faces-configType", propOrder = {
    "application",
        "ordering",
        "absoluteOrdering",
    "factory",
    "component",
    "converter",
    "managedBean",
        "name",
    "navigationRule",
    "referencedBean",
    "renderKit",
    "lifecycle",
    "validator",
        "behavior",
    "facesConfigExtension"
})
public class FacesConfig {

    protected List<FacesApplication> application;
    protected List<FacesOrdering> ordering;
    @XmlElement(name = "absolute-ordering")
    protected List<FacesAbsoluteOrdering> absoluteOrdering;
    protected List<FacesFactory> factory;
    protected List<FacesComponent> component;
    protected List<FacesConverter> converter;
    @XmlElement(name = "managed-bean")
    protected List<FacesManagedBean> managedBean;
    protected List<String> name;
    @XmlElement(name = "navigation-rule")
    protected List<FacesNavigationRule> navigationRule;
    @XmlElement(name = "referenced-bean")
    protected List<FacesReferencedBean> referencedBean;
    @XmlElement(name = "render-kit")
    protected List<FacesRenderKit> renderKit;
    protected List<FacesLifecycle> lifecycle;
    protected List<FacesValidator> validator;
    protected List<FacesBehavior> behavior;
    @XmlElement(name = "faces-config-extension")
    protected List<FacesExtension> facesConfigExtension;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(required = true)
    protected java.lang.String version;

    /**
     * Gets the value of the application property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the application property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesApplication }
     * 
     * 
     */
    public List<FacesApplication> getApplication() {
        if (application == null) {
            application = new ArrayList<FacesApplication>();
        }
        return this.application;
    }

    public List<FacesOrdering> getOrdering() {
        if (ordering == null) {
            ordering = new ArrayList<FacesOrdering>();
        }
        return ordering;
    }

    public List<FacesAbsoluteOrdering> getAbsoluteOrdering() {
        if (absoluteOrdering == null) {
            absoluteOrdering = new ArrayList<FacesAbsoluteOrdering>();
        }
        return absoluteOrdering;
    }

    /**
     * Gets the value of the factory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesFactory }
     * 
     * 
     */
    public List<FacesFactory> getFactory() {
        if (factory == null) {
            factory = new ArrayList<FacesFactory>();
        }
        return this.factory;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesComponent }
     * 
     * 
     */
    public List<FacesComponent> getComponent() {
        if (component == null) {
            component = new ArrayList<FacesComponent>();
        }
        return this.component;
    }

    /**
     * Gets the value of the converter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the converter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConverter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesConverter }
     * 
     * 
     */
    public List<FacesConverter> getConverter() {
        if (converter == null) {
            converter = new ArrayList<FacesConverter>();
        }
        return this.converter;
    }

    /**
     * Gets the value of the managedBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managedBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagedBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesManagedBean }
     * 
     * 
     */
    public List<FacesManagedBean> getManagedBean() {
        if (managedBean == null) {
            managedBean = new ArrayList<FacesManagedBean>();
        }
        return this.managedBean;
    }

    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return name;
    }

    /**
     * Gets the value of the navigationRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navigationRule property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavigationRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesNavigationRule }
     * 
     * 
     */
    public List<FacesNavigationRule> getNavigationRule() {
        if (navigationRule == null) {
            navigationRule = new ArrayList<FacesNavigationRule>();
        }
        return this.navigationRule;
    }

    /**
     * Gets the value of the referencedBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesReferencedBean }
     * 
     * 
     */
    public List<FacesReferencedBean> getReferencedBean() {
        if (referencedBean == null) {
            referencedBean = new ArrayList<FacesReferencedBean>();
        }
        return this.referencedBean;
    }

    /**
     * Gets the value of the renderKit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renderKit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenderKit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesRenderKit }
     * 
     * 
     */
    public List<FacesRenderKit> getRenderKit() {
        if (renderKit == null) {
            renderKit = new ArrayList<FacesRenderKit>();
        }
        return this.renderKit;
    }

    /**
     * Gets the value of the lifecycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lifecycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLifecycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesLifecycle }
     * 
     * 
     */
    public List<FacesLifecycle> getLifecycle() {
        if (lifecycle == null) {
            lifecycle = new ArrayList<FacesLifecycle>();
        }
        return this.lifecycle;
    }

    /**
     * Gets the value of the validator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesValidator }
     * 
     * 
     */
    public List<FacesValidator> getValidator() {
        if (validator == null) {
            validator = new ArrayList<FacesValidator>();
        }
        return this.validator;
    }

    public List<FacesBehavior> getBehavior() {
        if (behavior == null) {
            behavior = new ArrayList<FacesBehavior>();
        }
        return behavior;
    }

    /**
     * Gets the value of the facesConfigExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facesConfigExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacesConfigExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacesExtension }
     * 
     * 
     */
    public List<FacesExtension> getFacesConfigExtension() {
        if (facesConfigExtension == null) {
            facesConfigExtension = new ArrayList<FacesExtension>();
        }
        return this.facesConfigExtension;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }

}
