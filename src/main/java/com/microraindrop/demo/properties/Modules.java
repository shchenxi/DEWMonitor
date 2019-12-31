package com.microraindrop.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
