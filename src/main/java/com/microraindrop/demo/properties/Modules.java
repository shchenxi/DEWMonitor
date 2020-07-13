package com.microraindrop.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix="modeulelist")
public class Modules {

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String target;



	public List<Module> getModeuls() {
		return modeuls;
	}

	public void setModeuls(List<Module> modeuls) {
		this.modeuls = modeuls;
	}

	private List<Module> modeuls;


	public String getDemoUrl() {
		return demoUrl;
	}

	public void setDemoUrl(String demoUrl) {
		this.demoUrl = demoUrl;
	}

	private String demoUrl;

}
