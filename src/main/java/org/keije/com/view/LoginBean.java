package org.keije.com.view;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.keije.com.service.KeijeService;



public class LoginBean implements Serializable{
	 
	/**************Servicios**********************
	private KeijeService keijeService;
	public void setKeijeService(KeijeService keijeService)
	{
		this.keijeService =keijeService;
	}
	*/
	/********************Acciones*************************/
	public void acceso(ActionEvent actionEvent)
    {   	
		System.out.println("entra aqui");
		FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation
    	(FacesContext.getCurrentInstance(), "null", (new StringBuilder
    			("/paginas/principal/facelets/faceletsInicio.xhtml?")).append("faces-redirect=true").toString());			
    }
}
