package com.takatas.oot.mbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "indexBean")
@ViewScoped
public class IndexMBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3374659546955990539L;

	@PostConstruct
	private void init() {
	

	}

}
