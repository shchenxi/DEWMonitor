package com.microraindrop.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix="modeulelist")
public class Modules {
	public List<Module> getModeuls() {
		return modeuls;
	}

	public void setModeuls(List<Module> modeuls) {
		this.modeuls = modeuls;
	}

	private List<Module> modeuls;

}
