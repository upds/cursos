package org.keije.com.view;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.keije.com.service.KeijeService;




public class EstudianteBean implements Serializable{
	 

	public void buscar(ActionEvent actionEvent)
    {   	
	
		FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation
    	(FacesContext.getCurrentInstance(), "null", (new StringBuilder
    			("/paginas/estudiantes/facelets/faceletsBuscar.xhtml?")).append("faces-redirect=true").toString());			
    }
	public void registrar(ActionEvent actionEvent)
	{   	
		
		FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation
		(FacesContext.getCurrentInstance(), "null", (new StringBuilder
				("/paginas/estudiantes/facelets/faceletsRegistrar.xhtml?")).append("faces-redirect=true").toString());			
	}	
	public void editar(ActionEvent actionEvent)
	{   			
		FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation
		(FacesContext.getCurrentInstance(), "null", (new StringBuilder
				("/paginas/estudiantes/facelets/faceletsEditar.xhtml?")).append("faces-redirect=true").toString());	
	}
}
